
package com.trio.jaxrs.pojos;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mqttPassword"
})
@Generated("jsonschema2pojo")
public class Auth {

    @JsonProperty("mqttPassword")
    private String mqttPassword;

    @JsonProperty("mqttPassword")
    public String getMqttPassword() {
        return mqttPassword;
    }

    @JsonProperty("mqttPassword")
    public void setMqttPassword(String mqttPassword) {
        this.mqttPassword = mqttPassword;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Auth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mqttPassword");
        sb.append('=');
        sb.append(((this.mqttPassword == null)?"<null>":this.mqttPassword));
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
        result = ((result* 31)+((this.mqttPassword == null)? 0 :this.mqttPassword.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Auth) == false) {
            return false;
        }
        Auth rhs = ((Auth) other);
        return ((this.mqttPassword == rhs.mqttPassword)||((this.mqttPassword!= null)&&this.mqttPassword.equals(rhs.mqttPassword)));
    }

}
