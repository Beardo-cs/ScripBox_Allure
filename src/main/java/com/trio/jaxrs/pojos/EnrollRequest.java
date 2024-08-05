
package com.trio.jaxrs.pojos;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enrollmentCode",
    "device"
})
@Generated("jsonschema2pojo")
public class EnrollRequest {

    @JsonProperty("enrollmentCode")
    private String enrollmentCode;
    @JsonProperty("device")
    private Device device;

    @JsonProperty("enrollmentCode")
    public String getEnrollmentCode() {
        return enrollmentCode;
    }

    @JsonProperty("enrollmentCode")
    public void setEnrollmentCode(String enrollmentCode) {
        this.enrollmentCode = enrollmentCode;
    }

    @JsonProperty("device")
    public Device getDevice() {
        return device;
    }

    @JsonProperty("device")
    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrollRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enrollmentCode");
        sb.append('=');
        sb.append(((this.enrollmentCode == null)?"<null>":this.enrollmentCode));
        sb.append(',');
        sb.append("device");
        sb.append('=');
        sb.append(((this.device == null)?"<null>":this.device));
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
        result = ((result* 31)+((this.device == null)? 0 :this.device.hashCode()));
        result = ((result* 31)+((this.enrollmentCode == null)? 0 :this.enrollmentCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrollRequest) == false) {
            return false;
        }
        EnrollRequest rhs = ((EnrollRequest) other);
        return (((this.device == rhs.device)||((this.device!= null)&&this.device.equals(rhs.device)))&&((this.enrollmentCode == rhs.enrollmentCode)||((this.enrollmentCode!= null)&&this.enrollmentCode.equals(rhs.enrollmentCode))));
    }

}
