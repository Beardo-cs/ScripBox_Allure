
package com.trio.jaxrs.pojos;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isActive",
    "passExpDays",
    "reusePass",
    "resetPassBeforeExpDays"
})
@Generated("jsonschema2pojo")
public class ForcePass {

    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("passExpDays")
    private Integer passExpDays;
    @JsonProperty("reusePass")
    private Integer reusePass;
    @JsonProperty("resetPassBeforeExpDays")
    private Integer resetPassBeforeExpDays;

    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("passExpDays")
    public Integer getPassExpDays() {
        return passExpDays;
    }

    @JsonProperty("passExpDays")
    public void setPassExpDays(Integer passExpDays) {
        this.passExpDays = passExpDays;
    }

    @JsonProperty("reusePass")
    public Integer getReusePass() {
        return reusePass;
    }

    @JsonProperty("reusePass")
    public void setReusePass(Integer reusePass) {
        this.reusePass = reusePass;
    }

    @JsonProperty("resetPassBeforeExpDays")
    public Integer getResetPassBeforeExpDays() {
        return resetPassBeforeExpDays;
    }

    @JsonProperty("resetPassBeforeExpDays")
    public void setResetPassBeforeExpDays(Integer resetPassBeforeExpDays) {
        this.resetPassBeforeExpDays = resetPassBeforeExpDays;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ForcePass.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isActive");
        sb.append('=');
        sb.append(((this.isActive == null)?"<null>":this.isActive));
        sb.append(',');
        sb.append("passExpDays");
        sb.append('=');
        sb.append(((this.passExpDays == null)?"<null>":this.passExpDays));
        sb.append(',');
        sb.append("reusePass");
        sb.append('=');
        sb.append(((this.reusePass == null)?"<null>":this.reusePass));
        sb.append(',');
        sb.append("resetPassBeforeExpDays");
        sb.append('=');
        sb.append(((this.resetPassBeforeExpDays == null)?"<null>":this.resetPassBeforeExpDays));
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
        result = ((result* 31)+((this.resetPassBeforeExpDays == null)? 0 :this.resetPassBeforeExpDays.hashCode()));
        result = ((result* 31)+((this.isActive == null)? 0 :this.isActive.hashCode()));
        result = ((result* 31)+((this.passExpDays == null)? 0 :this.passExpDays.hashCode()));
        result = ((result* 31)+((this.reusePass == null)? 0 :this.reusePass.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ForcePass) == false) {
            return false;
        }
        ForcePass rhs = ((ForcePass) other);
        return (((((this.resetPassBeforeExpDays == rhs.resetPassBeforeExpDays)||((this.resetPassBeforeExpDays!= null)&&this.resetPassBeforeExpDays.equals(rhs.resetPassBeforeExpDays)))&&((this.isActive == rhs.isActive)||((this.isActive!= null)&&this.isActive.equals(rhs.isActive))))&&((this.passExpDays == rhs.passExpDays)||((this.passExpDays!= null)&&this.passExpDays.equals(rhs.passExpDays))))&&((this.reusePass == rhs.reusePass)||((this.reusePass!= null)&&this.reusePass.equals(rhs.reusePass))));
    }

}
