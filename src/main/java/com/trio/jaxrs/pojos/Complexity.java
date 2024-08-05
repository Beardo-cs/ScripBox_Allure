
package com.trio.jaxrs.pojos;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lowercase",
    "uppercase",
    "numeral",
    "specialChar"
})
@Generated("jsonschema2pojo")
public class Complexity {

    @JsonProperty("lowercase")
    private Boolean lowercase;
    @JsonProperty("uppercase")
    private Boolean uppercase;
    @JsonProperty("numeral")
    private Boolean numeral;
    @JsonProperty("specialChar")
    private Boolean specialChar;

    @JsonProperty("lowercase")
    public Boolean getLowercase() {
        return lowercase;
    }

    @JsonProperty("lowercase")
    public void setLowercase(Boolean lowercase) {
        this.lowercase = lowercase;
    }

    @JsonProperty("uppercase")
    public Boolean getUppercase() {
        return uppercase;
    }

    @JsonProperty("uppercase")
    public void setUppercase(Boolean uppercase) {
        this.uppercase = uppercase;
    }

    @JsonProperty("numeral")
    public Boolean getNumeral() {
        return numeral;
    }

    @JsonProperty("numeral")
    public void setNumeral(Boolean numeral) {
        this.numeral = numeral;
    }

    @JsonProperty("specialChar")
    public Boolean getSpecialChar() {
        return specialChar;
    }

    @JsonProperty("specialChar")
    public void setSpecialChar(Boolean specialChar) {
        this.specialChar = specialChar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Complexity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lowercase");
        sb.append('=');
        sb.append(((this.lowercase == null)?"<null>":this.lowercase));
        sb.append(',');
        sb.append("uppercase");
        sb.append('=');
        sb.append(((this.uppercase == null)?"<null>":this.uppercase));
        sb.append(',');
        sb.append("numeral");
        sb.append('=');
        sb.append(((this.numeral == null)?"<null>":this.numeral));
        sb.append(',');
        sb.append("specialChar");
        sb.append('=');
        sb.append(((this.specialChar == null)?"<null>":this.specialChar));
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
        result = ((result* 31)+((this.uppercase == null)? 0 :this.uppercase.hashCode()));
        result = ((result* 31)+((this.numeral == null)? 0 :this.numeral.hashCode()));
        result = ((result* 31)+((this.lowercase == null)? 0 :this.lowercase.hashCode()));
        result = ((result* 31)+((this.specialChar == null)? 0 :this.specialChar.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Complexity) == false) {
            return false;
        }
        Complexity rhs = ((Complexity) other);
        return (((((this.uppercase == rhs.uppercase)||((this.uppercase!= null)&&this.uppercase.equals(rhs.uppercase)))&&((this.numeral == rhs.numeral)||((this.numeral!= null)&&this.numeral.equals(rhs.numeral))))&&((this.lowercase == rhs.lowercase)||((this.lowercase!= null)&&this.lowercase.equals(rhs.lowercase))))&&((this.specialChar == rhs.specialChar)||((this.specialChar!= null)&&this.specialChar.equals(rhs.specialChar))));
    }

}
