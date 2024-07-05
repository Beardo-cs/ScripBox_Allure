package com.example;

import io.qameta.allure.*;
import io.qameta.allure.restassured.AllureRestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Epic("REST API Regression Testing using TestNG")
@Feature("Verify that the Get and POST API returns correctly")
public class TestDemo {

    @Test(description = "To get the details of post with id 1", priority = 2)
    @Story("GET Request with Valid post id")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description : Verify that the GET API returns correctly")
    public void verifyGetAPI() {
        given()
                .filter(new AllureRestAssured())
                .baseUri("https://reqres.in")
                .header("Content-Type", "application/json")
                .when()
                .get("/api/user/profile/1")
                .then()
                .statusCode(404);

    }

    @Story("POST Request")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description : Verify that the post API returns correctly")
    public void verifyPostAPI() {
        given()
                .filter(new AllureRestAssured())
                .baseUri("https://reqres.in")
                .header("Content-Type", "application/json")
                .when()
                .body("{\n" +
                        "  \"email\": \"eve.holt@reqres.in\",\n" +
                        "  \"password\": \"cityslicka\"\n" +
                        "}")
                .post("/api/register")

                .then()
                .statusCode(200)
                .body("id", equalTo(4))
                .body("token", equalTo("QpwL5tke4Pnpja7X4"));
    }

}