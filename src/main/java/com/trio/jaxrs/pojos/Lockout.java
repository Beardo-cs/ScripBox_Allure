
package com.trio.jaxrs.pojos;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isActive",
    "loggingAttempts"
})
@Generated("jsonschema2pojo")
public class Lockout {

    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("loggingAttempts")
    private Integer loggingAttempts;

    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("loggingAttempts")
    public Integer getLoggingAttempts() {
        return loggingAttempts;
    }

    @JsonProperty("loggingAttempts")
    public void setLoggingAttempts(Integer loggingAttempts) {
        this.loggingAttempts = loggingAttempts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Lockout.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null)?"<null>":this.isActive));
        sb.append(',');
        sb.append("loggingAttempts");
        sb.append('=');
        sb.append(((this.loggingAttempts == null)?"<null>":this.loggingAttempts));
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
        result = ((result* 31)+((this.isActive == null)? 0 :this.isActive.hashCode()));
        result = ((result* 31)+((this.loggingAttempts == null)? 0 :this.loggingAttempts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Lockout) == false) {
            return false;
        }
        Lockout rhs = ((Lockout) other);
        return (((this.isActive == rhs.isActive)||((this.isActive!= null)&&this.isActive.equals(rhs.isActive)))&&((this.loggingAttempts == rhs.loggingAttempts)||((this.loggingAttempts!= null)&&this.loggingAttempts.equals(rhs.loggingAttempts))));
    }

}
