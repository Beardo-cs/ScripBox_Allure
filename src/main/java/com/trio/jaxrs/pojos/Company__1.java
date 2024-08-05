
package com.trio.jaxrs.pojos;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "trcAgreement",
    "ownerId",
    "settings"
})
@Generated("jsonschema2pojo")
public class Company__1 {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("trcAgreement")
    private Boolean trcAgreement;
    @JsonProperty("ownerId")
    private String ownerId;
    @JsonProperty("settings")
    private Settings settings;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("trcAgreement")
    public Boolean getTrcAgreement() {
        return trcAgreement;
    }

    @JsonProperty("trcAgreement")
    public void setTrcAgreement(Boolean trcAgreement) {
        this.trcAgreement = trcAgreement;
    }

    @JsonProperty("ownerId")
    public String getOwnerId() {
        return ownerId;
    }

    @JsonProperty("ownerId")
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("settings")
    public Settings getSettings() {
        return settings;
    }

    @JsonProperty("settings")
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Company__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("trcAgreement");
        sb.append('=');
        sb.append(((this.trcAgreement == null)?"<null>":this.trcAgreement));
        sb.append(',');
        sb.append("ownerId");
        sb.append('=');
        sb.append(((this.ownerId == null)?"<null>":this.ownerId));
        sb.append(',');
        sb.append("settings");
        sb.append('=');
        sb.append(((this.settings == null)?"<null>":this.settings));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.settings == null)? 0 :this.settings.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.ownerId == null)? 0 :this.ownerId.hashCode()));
        result = ((result* 31)+((this.trcAgreement == null)? 0 :this.trcAgreement.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Company__1) == false) {
            return false;
        }
        Company__1 rhs = ((Company__1) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.settings == rhs.settings)||((this.settings!= null)&&this.settings.equals(rhs.settings))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.ownerId == rhs.ownerId)||((this.ownerId!= null)&&this.ownerId.equals(rhs.ownerId))))&&((this.trcAgreement == rhs.trcAgreement)||((this.trcAgreement!= null)&&this.trcAgreement.equals(rhs.trcAgreement))));
    }

}
