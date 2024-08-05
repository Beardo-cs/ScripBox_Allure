
package com.trio.jaxrs.pojos;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "created",
    "auth",
    "deviceId",
    "hardwareId",
    "company"
})
@Generated("jsonschema2pojo")
public class EnrollResponse {

    @JsonProperty("created")
    private Boolean created;
    @JsonProperty("auth")
    private Auth auth;
    @JsonProperty("deviceId")
    private String deviceId;
    @JsonProperty("hardwareId")
    private String hardwareId;
    @JsonProperty("company")
    private Company company;

    @JsonProperty("created")
    public Boolean getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(Boolean created) {
        this.created = created;
    }

    @JsonProperty("auth")
    public Auth getAuth() {
        return auth;
    }

    @JsonProperty("auth")
    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    @JsonProperty("deviceId")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("deviceId")
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @JsonProperty("hardwareId")
    public String getHardwareId() {
        return hardwareId;
    }

    @JsonProperty("hardwareId")
    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    @JsonProperty("company")
    public Company getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrollResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("auth");
        sb.append('=');
        sb.append(((this.auth == null)?"<null>":this.auth));
        sb.append(',');
        sb.append("deviceId");
        sb.append('=');
        sb.append(((this.deviceId == null)?"<null>":this.deviceId));
        sb.append(',');
        sb.append("hardwareId");
        sb.append('=');
        sb.append(((this.hardwareId == null)?"<null>":this.hardwareId));
        sb.append(',');
        sb.append("company");
        sb.append('=');
        sb.append(((this.company == null)?"<null>":this.company));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.company == null)? 0 :this.company.hashCode()));
        result = ((result* 31)+((this.auth == null)? 0 :this.auth.hashCode()));
        result = ((result* 31)+((this.deviceId == null)? 0 :this.deviceId.hashCode()));
        result = ((result* 31)+((this.hardwareId == null)? 0 :this.hardwareId.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrollResponse) == false) {
            return false;
        }
        EnrollResponse rhs = ((EnrollResponse) other);
        return ((((((this.company == rhs.company)||((this.company!= null)&&this.company.equals(rhs.company)))&&((this.auth == rhs.auth)||((this.auth!= null)&&this.auth.equals(rhs.auth))))&&((this.deviceId == rhs.deviceId)||((this.deviceId!= null)&&this.deviceId.equals(rhs.deviceId))))&&((this.hardwareId == rhs.hardwareId)||((this.hardwareId!= null)&&this.hardwareId.equals(rhs.hardwareId))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))));
    }

}
