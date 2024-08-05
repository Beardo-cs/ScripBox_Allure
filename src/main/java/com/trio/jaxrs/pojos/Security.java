
package com.trio.jaxrs.pojos;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mfaConfiguration",
    "minPassLen",
    "complexity",
    "forcePass",
    "lockout",
    "passRecoveryEmail"
})
@Generated("jsonschema2pojo")
public class Security {

    @JsonProperty("mfaConfiguration")
    private MfaConfiguration mfaConfiguration;
    @JsonProperty("minPassLen")
    private Integer minPassLen;
    @JsonProperty("complexity")
    private Complexity complexity;
    @JsonProperty("forcePass")
    private ForcePass forcePass;
    @JsonProperty("lockout")
    private Lockout lockout;
    @JsonProperty("passRecoveryEmail")
    private Boolean passRecoveryEmail;

    @JsonProperty("mfaConfiguration")
    public MfaConfiguration getMfaConfiguration() {
        return mfaConfiguration;
    }

    @JsonProperty("mfaConfiguration")
    public void setMfaConfiguration(MfaConfiguration mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }

    @JsonProperty("minPassLen")
    public Integer getMinPassLen() {
        return minPassLen;
    }

    @JsonProperty("minPassLen")
    public void setMinPassLen(Integer minPassLen) {
        this.minPassLen = minPassLen;
    }

    @JsonProperty("complexity")
    public Complexity getComplexity() {
        return complexity;
    }

    @JsonProperty("complexity")
    public void setComplexity(Complexity complexity) {
        this.complexity = complexity;
    }

    @JsonProperty("forcePass")
    public ForcePass getForcePass() {
        return forcePass;
    }

    @JsonProperty("forcePass")
    public void setForcePass(ForcePass forcePass) {
        this.forcePass = forcePass;
    }

    @JsonProperty("lockout")
    public Lockout getLockout() {
        return lockout;
    }

    @JsonProperty("lockout")
    public void setLockout(Lockout lockout) {
        this.lockout = lockout;
    }

    @JsonProperty("passRecoveryEmail")
    public Boolean getPassRecoveryEmail() {
        return passRecoveryEmail;
    }

    @JsonProperty("passRecoveryEmail")
    public void setPassRecoveryEmail(Boolean passRecoveryEmail) {
        this.passRecoveryEmail = passRecoveryEmail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Security.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mfaConfiguration");
        sb.append('=');
        sb.append(((this.mfaConfiguration == null)?"<null>":this.mfaConfiguration));
        sb.append(',');
        sb.append("minPassLen");
        sb.append('=');
        sb.append(((this.minPassLen == null)?"<null>":this.minPassLen));
        sb.append(',');
        sb.append("complexity");
        sb.append('=');
        sb.append(((this.complexity == null)?"<null>":this.complexity));
        sb.append(',');
        sb.append("forcePass");
        sb.append('=');
        sb.append(((this.forcePass == null)?"<null>":this.forcePass));
        sb.append(',');
        sb.append("lockout");
        sb.append('=');
        sb.append(((this.lockout == null)?"<null>":this.lockout));
        sb.append(',');
        sb.append("passRecoveryEmail");
        sb.append('=');
        sb.append(((this.passRecoveryEmail == null)?"<null>":this.passRecoveryEmail));
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
        result = ((result* 31)+((this.complexity == null)? 0 :this.complexity.hashCode()));
        result = ((result* 31)+((this.lockout == null)? 0 :this.lockout.hashCode()));
        result = ((result* 31)+((this.passRecoveryEmail == null)? 0 :this.passRecoveryEmail.hashCode()));
        result = ((result* 31)+((this.minPassLen == null)? 0 :this.minPassLen.hashCode()));
        result = ((result* 31)+((this.mfaConfiguration == null)? 0 :this.mfaConfiguration.hashCode()));
        result = ((result* 31)+((this.forcePass == null)? 0 :this.forcePass.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Security) == false) {
            return false;
        }
        Security rhs = ((Security) other);
        return (((((((this.complexity == rhs.complexity)||((this.complexity!= null)&&this.complexity.equals(rhs.complexity)))&&((this.lockout == rhs.lockout)||((this.lockout!= null)&&this.lockout.equals(rhs.lockout))))&&((this.passRecoveryEmail == rhs.passRecoveryEmail)||((this.passRecoveryEmail!= null)&&this.passRecoveryEmail.equals(rhs.passRecoveryEmail))))&&((this.minPassLen == rhs.minPassLen)||((this.minPassLen!= null)&&this.minPassLen.equals(rhs.minPassLen))))&&((this.mfaConfiguration == rhs.mfaConfiguration)||((this.mfaConfiguration!= null)&&this.mfaConfiguration.equals(rhs.mfaConfiguration))))&&((this.forcePass == rhs.forcePass)||((this.forcePass!= null)&&this.forcePass.equals(rhs.forcePass))));
    }

}
