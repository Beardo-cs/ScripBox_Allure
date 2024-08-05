package com.trio.jaxrs;

import com.trio.jaxrs.pojos.*;
import com.trio.jaxrs.utils.PropertiesLoader;
import io.qameta.allure.*;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonInclude;
import io.qameta.allure.internal.shadowed.jackson.core.JsonProcessingException;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import io.qameta.allure.internal.shadowed.jackson.databind.SerializationFeature;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.FilterProvider;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.impl.SimpleFilterProvider;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

@Epic("REST API Regression Testing using TestNG")
@Feature("Verify that the Get and POST APIs return the correct results")
public class TestDemo {
    public static String mqttPassword = "";
    public static String hardwareID = "";
    private static CloseableHttpClient client;

    @BeforeClass
    public static void setUp() {
        client = HttpClients.createDefault();
        RestAssured.baseURI = PropertiesLoader.getProperty("base.url");
        RestAssured.filters(new AllureRestAssured(), new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    @AfterClass
    public static void tearDown() throws IOException {
        client.close();
    }

    @Test(description = "To log in and get an access token", priority = 0)
    public void loginPostAPI() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setEmail(PropertiesLoader.getProperty("email"));
        loginRequest.setPassword(PropertiesLoader.getProperty("password"));

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.serializeAllExcept("additionalProperties");
        FilterProvider filters = new SimpleFilterProvider().addFilter("myFilter", filter);
        mapper.setFilterProvider(filters);

        String requestBody = "";
        try {
            requestBody = mapper.writeValueAsString(loginRequest);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        given()
                .filter(new AllureRestAssured())
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("auth/login")
                .then()
                .statusCode(201)
                .body("accessToken", notNullValue());
    }

    @Test(description = "To enroll an Android device and fetch the password", priority = 1)
    public void enrollAndroidAPI() {
        Random random = new Random();
        int randomHardwareID = 10000 + random.nextInt(90000);

        EnrollRequest enrollRequest = getEnrollRequest(randomHardwareID);

        ObjectMapper mapper = new ObjectMapper();
        String requestBody = "";
        try {
            requestBody = mapper.writeValueAsString(enrollRequest);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Failed to serialize EnrollRequest object to JSON");
        }

        Response response = given()
                .filter(new AllureRestAssured())
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("device/enrollment-android")
                .then()
                .statusCode(201)
                .extract()
                .response();

        EnrollResponse enrollResponse = response.as(EnrollResponse.class);
        mqttPassword = enrollResponse.getAuth().getMqttPassword();
        hardwareID = enrollResponse.getHardwareId();

        Assert.assertNotNull(mqttPassword, "MQTT password should not be null");
        Assert.assertNotNull(hardwareID, "Hardware ID should not be null");

        System.out.println("Hardware ID: " + hardwareID);
        System.out.println("MQTT Password: " + mqttPassword);
    }

    private EnrollRequest getEnrollRequest(int randomHardwareID) {
        EnrollRequest enrollRequest = new EnrollRequest();
        Device device = new Device();

        // Fetch properties from the properties file
        String brand = PropertiesLoader.getProperty("device.brand");
        String androidApiLevel = PropertiesLoader.getProperty("device.androidApiLevel");
        int internalStorage = Integer.parseInt(PropertiesLoader.getProperty("device.internalStorage"));
        String model = PropertiesLoader.getProperty("device.model");
        String cpuArchitecture = PropertiesLoader.getProperty("device.cpuArchitecture");
        List<String> displaySizes = Arrays.asList(PropertiesLoader.getProperty("device.displaySizes").split(","));
        String enrollmentCode = PropertiesLoader.getProperty("enrollment.code");

        device.setHardwareId(String.valueOf(randomHardwareID));
        device.setIsRooted(true);
        device.setBrand(brand);
        device.setAndroidApiLevel(androidApiLevel);
        device.setInternalStorage(internalStorage);
        device.setModel(model);
        device.setCpuArchitecture(cpuArchitecture);
        device.setDisplaySizes(displaySizes);

        enrollRequest.setEnrollmentCode(enrollmentCode);
        enrollRequest.setDevice(device);
        return enrollRequest;
    }

    @Test(description = "To authenticate using the admin credentials", priority = 2)
    public void adminLoginPostAPI() {
        AgentRequest agentRequest = new AgentRequest();
        agentRequest.setHardwareId(hardwareID);
        agentRequest.setMqttPassword(mqttPassword);

        ObjectMapper mapper = new ObjectMapper();
        String requestBody = "";
        try {
            requestBody = mapper.writeValueAsString(agentRequest);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        given()
                .filter(new AllureRestAssured())
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("agent/auth/login")
                .then()
                .statusCode(201)
                .body("accessToken", notNullValue());
    }
}
