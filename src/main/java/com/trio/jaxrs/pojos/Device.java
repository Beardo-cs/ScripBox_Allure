
package com.trio.jaxrs.pojos;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hardwareId",
    "isRooted",
    "brand",
    "androidApiLevel",
    "internalStorage",
    "externalStorage",
    "model",
    "cpuArchitecture",
    "hardwareCodeName",
    "firmwareBuildTime",
    "firmwareType",
    "firmwareBuildTags",
    "displaySizes",
    "firmwareBuildFingerPrint",
    "radioFirmwareVersion",
    "socModel",
    "socManufacture",
    "partitionNameSystem",
    "agentVersion",
    "upTime",
    "name"
})
@Generated("jsonschema2pojo")
public class Device {

    @JsonProperty("hardwareId")
    private String hardwareId;
    @JsonProperty("isRooted")
    private Boolean isRooted;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("androidApiLevel")
    private String androidApiLevel;
    @JsonProperty("internalStorage")
    private Integer internalStorage;
    @JsonProperty("externalStorage")
    private Integer externalStorage;
    @JsonProperty("model")
    private String model;
    @JsonProperty("cpuArchitecture")
    private String cpuArchitecture;
    @JsonProperty("hardwareCodeName")
    private String hardwareCodeName;
    @JsonProperty("firmwareBuildTime")
    private String firmwareBuildTime;
    @JsonProperty("firmwareType")
    private String firmwareType;
    @JsonProperty("firmwareBuildTags")
    private List<String> firmwareBuildTags = new ArrayList<String>();
    @JsonProperty("displaySizes")
    private List<String> displaySizes = new ArrayList<String>();
    @JsonProperty("firmwareBuildFingerPrint")
    private String firmwareBuildFingerPrint;
    @JsonProperty("radioFirmwareVersion")
    private String radioFirmwareVersion;
    @JsonProperty("socModel")
    private String socModel;
    @JsonProperty("socManufacture")
    private String socManufacture;
    @JsonProperty("partitionNameSystem")
    private String partitionNameSystem;
    @JsonProperty("agentVersion")
    private String agentVersion;
    @JsonProperty("upTime")
    private Integer upTime;
    @JsonProperty("name")
    private String name;

    @JsonProperty("hardwareId")
    public String getHardwareId() {
        return hardwareId;
    }

    @JsonProperty("hardwareId")
    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    @JsonProperty("isRooted")
    public Boolean getIsRooted() {
        return isRooted;
    }

    @JsonProperty("isRooted")
    public void setIsRooted(Boolean isRooted) {
        this.isRooted = isRooted;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("androidApiLevel")
    public String getAndroidApiLevel() {
        return androidApiLevel;
    }

    @JsonProperty("androidApiLevel")
    public void setAndroidApiLevel(String androidApiLevel) {
        this.androidApiLevel = androidApiLevel;
    }

    @JsonProperty("internalStorage")
    public Integer getInternalStorage() {
        return internalStorage;
    }

    @JsonProperty("internalStorage")
    public void setInternalStorage(Integer internalStorage) {
        this.internalStorage = internalStorage;
    }

    @JsonProperty("externalStorage")
    public Integer getExternalStorage() {
        return externalStorage;
    }

    @JsonProperty("externalStorage")
    public void setExternalStorage(Integer externalStorage) {
        this.externalStorage = externalStorage;
    }

    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    @JsonProperty("cpuArchitecture")
    public String getCpuArchitecture() {
        return cpuArchitecture;
    }

    @JsonProperty("cpuArchitecture")
    public void setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
    }

    @JsonProperty("hardwareCodeName")
    public String getHardwareCodeName() {
        return hardwareCodeName;
    }

    @JsonProperty("hardwareCodeName")
    public void setHardwareCodeName(String hardwareCodeName) {
        this.hardwareCodeName = hardwareCodeName;
    }

    @JsonProperty("firmwareBuildTime")
    public String getFirmwareBuildTime() {
        return firmwareBuildTime;
    }

    @JsonProperty("firmwareBuildTime")
    public void setFirmwareBuildTime(String firmwareBuildTime) {
        this.firmwareBuildTime = firmwareBuildTime;
    }

    @JsonProperty("firmwareType")
    public String getFirmwareType() {
        return firmwareType;
    }

    @JsonProperty("firmwareType")
    public void setFirmwareType(String firmwareType) {
        this.firmwareType = firmwareType;
    }

    @JsonProperty("firmwareBuildTags")
    public List<String> getFirmwareBuildTags() {
        return firmwareBuildTags;
    }

    @JsonProperty("firmwareBuildTags")
    public void setFirmwareBuildTags(List<String> firmwareBuildTags) {
        this.firmwareBuildTags = firmwareBuildTags;
    }

    @JsonProperty("displaySizes")
    public List<String> getDisplaySizes() {
        return displaySizes;
    }

    @JsonProperty("displaySizes")
    public void setDisplaySizes(List<String> displaySizes) {
        this.displaySizes = displaySizes;
    }

    @JsonProperty("firmwareBuildFingerPrint")
    public String getFirmwareBuildFingerPrint() {
        return firmwareBuildFingerPrint;
    }

    @JsonProperty("firmwareBuildFingerPrint")
    public void setFirmwareBuildFingerPrint(String firmwareBuildFingerPrint) {
        this.firmwareBuildFingerPrint = firmwareBuildFingerPrint;
    }

    @JsonProperty("radioFirmwareVersion")
    public String getRadioFirmwareVersion() {
        return radioFirmwareVersion;
    }

    @JsonProperty("radioFirmwareVersion")
    public void setRadioFirmwareVersion(String radioFirmwareVersion) {
        this.radioFirmwareVersion = radioFirmwareVersion;
    }

    @JsonProperty("socModel")
    public String getSocModel() {
        return socModel;
    }

    @JsonProperty("socModel")
    public void setSocModel(String socModel) {
        this.socModel = socModel;
    }

    @JsonProperty("socManufacture")
    public String getSocManufacture() {
        return socManufacture;
    }

    @JsonProperty("socManufacture")
    public void setSocManufacture(String socManufacture) {
        this.socManufacture = socManufacture;
    }

    @JsonProperty("partitionNameSystem")
    public String getPartitionNameSystem() {
        return partitionNameSystem;
    }

    @JsonProperty("partitionNameSystem")
    public void setPartitionNameSystem(String partitionNameSystem) {
        this.partitionNameSystem = partitionNameSystem;
    }

    @JsonProperty("agentVersion")
    public String getAgentVersion() {
        return agentVersion;
    }

    @JsonProperty("agentVersion")
    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    @JsonProperty("upTime")
    public Integer getUpTime() {
        return upTime;
    }

    @JsonProperty("upTime")
    public void setUpTime(Integer upTime) {
        this.upTime = upTime;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Device.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hardwareId");
        sb.append('=');
        sb.append(((this.hardwareId == null)?"<null>":this.hardwareId));
        sb.append(',');
        sb.append("isRooted");
        sb.append('=');
        sb.append(((this.isRooted == null)?"<null>":this.isRooted));
        sb.append(',');
        sb.append("brand");
        sb.append('=');
        sb.append(((this.brand == null)?"<null>":this.brand));
        sb.append(',');
        sb.append("androidApiLevel");
        sb.append('=');
        sb.append(((this.androidApiLevel == null)?"<null>":this.androidApiLevel));
        sb.append(',');
        sb.append("internalStorage");
        sb.append('=');
        sb.append(((this.internalStorage == null)?"<null>":this.internalStorage));
        sb.append(',');
        sb.append("externalStorage");
        sb.append('=');
        sb.append(((this.externalStorage == null)?"<null>":this.externalStorage));
        sb.append(',');
        sb.append("model");
        sb.append('=');
        sb.append(((this.model == null)?"<null>":this.model));
        sb.append(',');
        sb.append("cpuArchitecture");
        sb.append('=');
        sb.append(((this.cpuArchitecture == null)?"<null>":this.cpuArchitecture));
        sb.append(',');
        sb.append("hardwareCodeName");
        sb.append('=');
        sb.append(((this.hardwareCodeName == null)?"<null>":this.hardwareCodeName));
        sb.append(',');
        sb.append("firmwareBuildTime");
        sb.append('=');
        sb.append(((this.firmwareBuildTime == null)?"<null>":this.firmwareBuildTime));
        sb.append(',');
        sb.append("firmwareType");
        sb.append('=');
        sb.append(((this.firmwareType == null)?"<null>":this.firmwareType));
        sb.append(',');
        sb.append("firmwareBuildTags");
        sb.append('=');
        sb.append(((this.firmwareBuildTags == null)?"<null>":this.firmwareBuildTags));
        sb.append(',');
        sb.append("displaySizes");
        sb.append('=');
        sb.append(((this.displaySizes == null)?"<null>":this.displaySizes));
        sb.append(',');
        sb.append("firmwareBuildFingerPrint");
        sb.append('=');
        sb.append(((this.firmwareBuildFingerPrint == null)?"<null>":this.firmwareBuildFingerPrint));
        sb.append(',');
        sb.append("radioFirmwareVersion");
        sb.append('=');
        sb.append(((this.radioFirmwareVersion == null)?"<null>":this.radioFirmwareVersion));
        sb.append(',');
        sb.append("socModel");
        sb.append('=');
        sb.append(((this.socModel == null)?"<null>":this.socModel));
        sb.append(',');
        sb.append("socManufacture");
        sb.append('=');
        sb.append(((this.socManufacture == null)?"<null>":this.socManufacture));
        sb.append(',');
        sb.append("partitionNameSystem");
        sb.append('=');
        sb.append(((this.partitionNameSystem == null)?"<null>":this.partitionNameSystem));
        sb.append(',');
        sb.append("agentVersion");
        sb.append('=');
        sb.append(((this.agentVersion == null)?"<null>":this.agentVersion));
        sb.append(',');
        sb.append("upTime");
        sb.append('=');
        sb.append(((this.upTime == null)?"<null>":this.upTime));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.firmwareBuildTime == null)? 0 :this.firmwareBuildTime.hashCode()));
        result = ((result* 31)+((this.firmwareType == null)? 0 :this.firmwareType.hashCode()));
        result = ((result* 31)+((this.internalStorage == null)? 0 :this.internalStorage.hashCode()));
        result = ((result* 31)+((this.hardwareCodeName == null)? 0 :this.hardwareCodeName.hashCode()));
        result = ((result* 31)+((this.firmwareBuildFingerPrint == null)? 0 :this.firmwareBuildFingerPrint.hashCode()));
        result = ((result* 31)+((this.socManufacture == null)? 0 :this.socManufacture.hashCode()));
        result = ((result* 31)+((this.cpuArchitecture == null)? 0 :this.cpuArchitecture.hashCode()));
        result = ((result* 31)+((this.externalStorage == null)? 0 :this.externalStorage.hashCode()));
        result = ((result* 31)+((this.androidApiLevel == null)? 0 :this.androidApiLevel.hashCode()));
        result = ((result* 31)+((this.displaySizes == null)? 0 :this.displaySizes.hashCode()));
        result = ((result* 31)+((this.firmwareBuildTags == null)? 0 :this.firmwareBuildTags.hashCode()));
        result = ((result* 31)+((this.isRooted == null)? 0 :this.isRooted.hashCode()));
        result = ((result* 31)+((this.upTime == null)? 0 :this.upTime.hashCode()));
        result = ((result* 31)+((this.hardwareId == null)? 0 :this.hardwareId.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.radioFirmwareVersion == null)? 0 :this.radioFirmwareVersion.hashCode()));
        result = ((result* 31)+((this.socModel == null)? 0 :this.socModel.hashCode()));
        result = ((result* 31)+((this.agentVersion == null)? 0 :this.agentVersion.hashCode()));
        result = ((result* 31)+((this.model == null)? 0 :this.model.hashCode()));
        result = ((result* 31)+((this.brand == null)? 0 :this.brand.hashCode()));
        result = ((result* 31)+((this.partitionNameSystem == null)? 0 :this.partitionNameSystem.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Device) == false) {
            return false;
        }
        Device rhs = ((Device) other);
        return ((((((((((((((((((((((this.firmwareBuildTime == rhs.firmwareBuildTime)||((this.firmwareBuildTime!= null)&&this.firmwareBuildTime.equals(rhs.firmwareBuildTime)))&&((this.firmwareType == rhs.firmwareType)||((this.firmwareType!= null)&&this.firmwareType.equals(rhs.firmwareType))))&&((this.internalStorage == rhs.internalStorage)||((this.internalStorage!= null)&&this.internalStorage.equals(rhs.internalStorage))))&&((this.hardwareCodeName == rhs.hardwareCodeName)||((this.hardwareCodeName!= null)&&this.hardwareCodeName.equals(rhs.hardwareCodeName))))&&((this.firmwareBuildFingerPrint == rhs.firmwareBuildFingerPrint)||((this.firmwareBuildFingerPrint!= null)&&this.firmwareBuildFingerPrint.equals(rhs.firmwareBuildFingerPrint))))&&((this.socManufacture == rhs.socManufacture)||((this.socManufacture!= null)&&this.socManufacture.equals(rhs.socManufacture))))&&((this.cpuArchitecture == rhs.cpuArchitecture)||((this.cpuArchitecture!= null)&&this.cpuArchitecture.equals(rhs.cpuArchitecture))))&&((this.externalStorage == rhs.externalStorage)||((this.externalStorage!= null)&&this.externalStorage.equals(rhs.externalStorage))))&&((this.androidApiLevel == rhs.androidApiLevel)||((this.androidApiLevel!= null)&&this.androidApiLevel.equals(rhs.androidApiLevel))))&&((this.displaySizes == rhs.displaySizes)||((this.displaySizes!= null)&&this.displaySizes.equals(rhs.displaySizes))))&&((this.firmwareBuildTags == rhs.firmwareBuildTags)||((this.firmwareBuildTags!= null)&&this.firmwareBuildTags.equals(rhs.firmwareBuildTags))))&&((this.isRooted == rhs.isRooted)||((this.isRooted!= null)&&this.isRooted.equals(rhs.isRooted))))&&((this.upTime == rhs.upTime)||((this.upTime!= null)&&this.upTime.equals(rhs.upTime))))&&((this.hardwareId == rhs.hardwareId)||((this.hardwareId!= null)&&this.hardwareId.equals(rhs.hardwareId))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.radioFirmwareVersion == rhs.radioFirmwareVersion)||((this.radioFirmwareVersion!= null)&&this.radioFirmwareVersion.equals(rhs.radioFirmwareVersion))))&&((this.socModel == rhs.socModel)||((this.socModel!= null)&&this.socModel.equals(rhs.socModel))))&&((this.agentVersion == rhs.agentVersion)||((this.agentVersion!= null)&&this.agentVersion.equals(rhs.agentVersion))))&&((this.model == rhs.model)||((this.model!= null)&&this.model.equals(rhs.model))))&&((this.brand == rhs.brand)||((this.brand!= null)&&this.brand.equals(rhs.brand))))&&((this.partitionNameSystem == rhs.partitionNameSystem)||((this.partitionNameSystem!= null)&&this.partitionNameSystem.equals(rhs.partitionNameSystem))));
    }

}
