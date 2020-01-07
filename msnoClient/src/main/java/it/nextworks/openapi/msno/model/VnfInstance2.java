/*
 * SOL005 - NS Lifecycle Management Interface
 * SOL005 - NS Lifecycle Management Interface IMPORTANT: Please note that this file might be not aligned to the current version of the ETSI Group Specification it refers to and has not been approved by the ETSI NFV ISG. In case of discrepancies the published ETSI Group Specification takes precedence. Please report bugs to https://forge.etsi.org/bugzilla/buglist.cgi?component=Nfv-Openapis 
 *
 * OpenAPI spec version: 1.1.0-impl:etsi.org:ETSI_NFV_OpenAPI:1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package it.nextworks.openapi.msno.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.nextworks.openapi.msno.model.KeyValuePairs;
import it.nextworks.openapi.msno.model.VnfInstance2InstantiatedVnfInfo;

import java.io.IOException;

/**
 * This type represents a VNF instance. 
 */
@ApiModel(description = "This type represents a VNF instance. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T16:52:33.422+01:00")
public class VnfInstance2 {
  @SerializedName("id")
  private String id = null;

  @SerializedName("vnfInstanceName")
  private String vnfInstanceName = null;

  @SerializedName("vnfInstanceDescription")
  private String vnfInstanceDescription = null;

  @SerializedName("vnfdId")
  private String vnfdId = null;

  @SerializedName("vnfProvider")
  private String vnfProvider = null;

  @SerializedName("vnfProductName")
  private String vnfProductName = null;

  @SerializedName("vnfSoftwareVersion")
  private String vnfSoftwareVersion = null;

  @SerializedName("vnfdVersion")
  private String vnfdVersion = null;

  @SerializedName("vnfPkgId")
  private String vnfPkgId = null;

  @SerializedName("vnfConfigurableProperties")
  private KeyValuePairs vnfConfigurableProperties = null;

  @SerializedName("vimId")
  private String vimId = null;

  /**
   * The instantiation state of the VNF. 
   */
  @JsonAdapter(InstantiationStateEnum.Adapter.class)
  public enum InstantiationStateEnum {
    NOT_INSTANTIATED("NOT_INSTANTIATED"),
    
    INSTANTIATED("INSTANTIATED");

    private String value;

    InstantiationStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InstantiationStateEnum fromValue(String text) {
      for (InstantiationStateEnum b : InstantiationStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InstantiationStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstantiationStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstantiationStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InstantiationStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("instantiationState")
  private InstantiationStateEnum instantiationState = null;

  @SerializedName("instantiatedVnfInfo")
  private VnfInstance2InstantiatedVnfInfo instantiatedVnfInfo = null;

  @SerializedName("metadata")
  private KeyValuePairs metadata = null;

  @SerializedName("extensions")
  private KeyValuePairs extensions = null;

  public VnfInstance2 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the VNF instance. 
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the VNF instance. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VnfInstance2 vnfInstanceName(String vnfInstanceName) {
    this.vnfInstanceName = vnfInstanceName;
    return this;
  }

   /**
   * Name of the VNF instance. This attribute can be modified with the PATCH method. 
   * @return vnfInstanceName
  **/
  @ApiModelProperty(value = "Name of the VNF instance. This attribute can be modified with the PATCH method. ")
  public String getVnfInstanceName() {
    return vnfInstanceName;
  }

  public void setVnfInstanceName(String vnfInstanceName) {
    this.vnfInstanceName = vnfInstanceName;
  }

  public VnfInstance2 vnfInstanceDescription(String vnfInstanceDescription) {
    this.vnfInstanceDescription = vnfInstanceDescription;
    return this;
  }

   /**
   * Human-readable description of the VNF instance. This attribute can be modified with the PATCH method. 
   * @return vnfInstanceDescription
  **/
  @ApiModelProperty(value = "Human-readable description of the VNF instance. This attribute can be modified with the PATCH method. ")
  public String getVnfInstanceDescription() {
    return vnfInstanceDescription;
  }

  public void setVnfInstanceDescription(String vnfInstanceDescription) {
    this.vnfInstanceDescription = vnfInstanceDescription;
  }

  public VnfInstance2 vnfdId(String vnfdId) {
    this.vnfdId = vnfdId;
    return this;
  }

   /**
   * Identifier of the VNFD on which the VNF instance is based. 
   * @return vnfdId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the VNFD on which the VNF instance is based. ")
  public String getVnfdId() {
    return vnfdId;
  }

  public void setVnfdId(String vnfdId) {
    this.vnfdId = vnfdId;
  }

  public VnfInstance2 vnfProvider(String vnfProvider) {
    this.vnfProvider = vnfProvider;
    return this;
  }

   /**
   * Provider of the VNF and the VNFD. The value is copied from the VNFD. 
   * @return vnfProvider
  **/
  @ApiModelProperty(required = true, value = "Provider of the VNF and the VNFD. The value is copied from the VNFD. ")
  public String getVnfProvider() {
    return vnfProvider;
  }

  public void setVnfProvider(String vnfProvider) {
    this.vnfProvider = vnfProvider;
  }

  public VnfInstance2 vnfProductName(String vnfProductName) {
    this.vnfProductName = vnfProductName;
    return this;
  }

   /**
   * Name to identify the VNF Product. The value is copied from the VNFD. 
   * @return vnfProductName
  **/
  @ApiModelProperty(required = true, value = "Name to identify the VNF Product. The value is copied from the VNFD. ")
  public String getVnfProductName() {
    return vnfProductName;
  }

  public void setVnfProductName(String vnfProductName) {
    this.vnfProductName = vnfProductName;
  }

  public VnfInstance2 vnfSoftwareVersion(String vnfSoftwareVersion) {
    this.vnfSoftwareVersion = vnfSoftwareVersion;
    return this;
  }

   /**
   * Software version of the VNF. The value is copied from the VNFD. 
   * @return vnfSoftwareVersion
  **/
  @ApiModelProperty(required = true, value = "Software version of the VNF. The value is copied from the VNFD. ")
  public String getVnfSoftwareVersion() {
    return vnfSoftwareVersion;
  }

  public void setVnfSoftwareVersion(String vnfSoftwareVersion) {
    this.vnfSoftwareVersion = vnfSoftwareVersion;
  }

  public VnfInstance2 vnfdVersion(String vnfdVersion) {
    this.vnfdVersion = vnfdVersion;
    return this;
  }

   /**
   * Identifies the version of the VNFD. The value is copied from the VNFD. 
   * @return vnfdVersion
  **/
  @ApiModelProperty(required = true, value = "Identifies the version of the VNFD. The value is copied from the VNFD. ")
  public String getVnfdVersion() {
    return vnfdVersion;
  }

  public void setVnfdVersion(String vnfdVersion) {
    this.vnfdVersion = vnfdVersion;
  }

  public VnfInstance2 vnfPkgId(String vnfPkgId) {
    this.vnfPkgId = vnfPkgId;
    return this;
  }

   /**
   * Identifier of information held by the NFVO about the specific VNF package on which the VNF is based. This identifier was allocated by the NFVO. This attribute can be modified with the PATCH method. 
   * @return vnfPkgId
  **/
  @ApiModelProperty(required = true, value = "Identifier of information held by the NFVO about the specific VNF package on which the VNF is based. This identifier was allocated by the NFVO. This attribute can be modified with the PATCH method. ")
  public String getVnfPkgId() {
    return vnfPkgId;
  }

  public void setVnfPkgId(String vnfPkgId) {
    this.vnfPkgId = vnfPkgId;
  }

  public VnfInstance2 vnfConfigurableProperties(KeyValuePairs vnfConfigurableProperties) {
    this.vnfConfigurableProperties = vnfConfigurableProperties;
    return this;
  }

   /**
   * Current values of the configurable properties of the VNF instance. Configurable properties referred in this attribute are declared in the VNFD. ETSI GS NFV-SOL 001 specifies the structure and format of the VNFD based on TOSCA specifications. VNF configurable properties are sometimes also referred to as configuration parameters applicable to a VNF. Some of these are set prior to instantiation and cannot be modified if the VNF is instantiated, some are set prior to instantiation (are part of initial configuration) and can be modified later, and others can be set only after instantiation. The applicability of certain configuration may depend on the VNF and the required operation of the VNF at a certain point in time. These configurable properties include the following standard attributes, which are declared in the VNFD if auto-scaling and/or auto-healing are supported by the VNF: * isAutoscaleEnabled: If present, the VNF supports auto-scaling. If set to true, auto-scaling is currently enabled. If set to false, auto-scaling is currently disabled. * isAutohealEnabled: If present, the VNF supports auto-healing. If set to true, auto-healing is currently enabled. If set to false, auto-healing is currently disabled. This attribute can be modified with the PATCH method. 
   * @return vnfConfigurableProperties
  **/
  @ApiModelProperty(value = "Current values of the configurable properties of the VNF instance. Configurable properties referred in this attribute are declared in the VNFD. ETSI GS NFV-SOL 001 specifies the structure and format of the VNFD based on TOSCA specifications. VNF configurable properties are sometimes also referred to as configuration parameters applicable to a VNF. Some of these are set prior to instantiation and cannot be modified if the VNF is instantiated, some are set prior to instantiation (are part of initial configuration) and can be modified later, and others can be set only after instantiation. The applicability of certain configuration may depend on the VNF and the required operation of the VNF at a certain point in time. These configurable properties include the following standard attributes, which are declared in the VNFD if auto-scaling and/or auto-healing are supported by the VNF: * isAutoscaleEnabled: If present, the VNF supports auto-scaling. If set to true, auto-scaling is currently enabled. If set to false, auto-scaling is currently disabled. * isAutohealEnabled: If present, the VNF supports auto-healing. If set to true, auto-healing is currently enabled. If set to false, auto-healing is currently disabled. This attribute can be modified with the PATCH method. ")
  public KeyValuePairs getVnfConfigurableProperties() {
    return vnfConfigurableProperties;
  }

  public void setVnfConfigurableProperties(KeyValuePairs vnfConfigurableProperties) {
    this.vnfConfigurableProperties = vnfConfigurableProperties;
  }

  public VnfInstance2 vimId(String vimId) {
    this.vimId = vimId;
    return this;
  }

   /**
   * Identifier of a VIM that manages resources for the VNF instance. 
   * @return vimId
  **/
  @ApiModelProperty(value = "Identifier of a VIM that manages resources for the VNF instance. ")
  public String getVimId() {
    return vimId;
  }

  public void setVimId(String vimId) {
    this.vimId = vimId;
  }

  public VnfInstance2 instantiationState(InstantiationStateEnum instantiationState) {
    this.instantiationState = instantiationState;
    return this;
  }

   /**
   * The instantiation state of the VNF. 
   * @return instantiationState
  **/
  @ApiModelProperty(required = true, value = "The instantiation state of the VNF. ")
  public InstantiationStateEnum getInstantiationState() {
    return instantiationState;
  }

  public void setInstantiationState(InstantiationStateEnum instantiationState) {
    this.instantiationState = instantiationState;
  }

  public VnfInstance2 instantiatedVnfInfo(VnfInstance2InstantiatedVnfInfo instantiatedVnfInfo) {
    this.instantiatedVnfInfo = instantiatedVnfInfo;
    return this;
  }

   /**
   * Get instantiatedVnfInfo
   * @return instantiatedVnfInfo
  **/
  @ApiModelProperty(value = "")
  public VnfInstance2InstantiatedVnfInfo getInstantiatedVnfInfo() {
    return instantiatedVnfInfo;
  }

  public void setInstantiatedVnfInfo(VnfInstance2InstantiatedVnfInfo instantiatedVnfInfo) {
    this.instantiatedVnfInfo = instantiatedVnfInfo;
  }

  public VnfInstance2 metadata(KeyValuePairs metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Additional VNF-specific metadata describing the VNF instance. Metadata that are writeable are declared in the VNFD. This attribute can be modified with the PATCH method. 
   * @return metadata
  **/
  @ApiModelProperty(value = "Additional VNF-specific metadata describing the VNF instance. Metadata that are writeable are declared in the VNFD. This attribute can be modified with the PATCH method. ")
  public KeyValuePairs getMetadata() {
    return metadata;
  }

  public void setMetadata(KeyValuePairs metadata) {
    this.metadata = metadata;
  }

  public VnfInstance2 extensions(KeyValuePairs extensions) {
    this.extensions = extensions;
    return this;
  }

   /**
   * VNF-specific attributes that affect the lifecycle management of this VNF instance by the VNFM, or the lifecycle management scripts. Extensions that are writeable are declared in the VNFD. This attribute can be modified with the PATCH method. 
   * @return extensions
  **/
  @ApiModelProperty(value = "VNF-specific attributes that affect the lifecycle management of this VNF instance by the VNFM, or the lifecycle management scripts. Extensions that are writeable are declared in the VNFD. This attribute can be modified with the PATCH method. ")
  public KeyValuePairs getExtensions() {
    return extensions;
  }

  public void setExtensions(KeyValuePairs extensions) {
    this.extensions = extensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VnfInstance2 vnfInstance2 = (VnfInstance2) o;
    return Objects.equals(this.id, vnfInstance2.id) &&
        Objects.equals(this.vnfInstanceName, vnfInstance2.vnfInstanceName) &&
        Objects.equals(this.vnfInstanceDescription, vnfInstance2.vnfInstanceDescription) &&
        Objects.equals(this.vnfdId, vnfInstance2.vnfdId) &&
        Objects.equals(this.vnfProvider, vnfInstance2.vnfProvider) &&
        Objects.equals(this.vnfProductName, vnfInstance2.vnfProductName) &&
        Objects.equals(this.vnfSoftwareVersion, vnfInstance2.vnfSoftwareVersion) &&
        Objects.equals(this.vnfdVersion, vnfInstance2.vnfdVersion) &&
        Objects.equals(this.vnfPkgId, vnfInstance2.vnfPkgId) &&
        Objects.equals(this.vnfConfigurableProperties, vnfInstance2.vnfConfigurableProperties) &&
        Objects.equals(this.vimId, vnfInstance2.vimId) &&
        Objects.equals(this.instantiationState, vnfInstance2.instantiationState) &&
        Objects.equals(this.instantiatedVnfInfo, vnfInstance2.instantiatedVnfInfo) &&
        Objects.equals(this.metadata, vnfInstance2.metadata) &&
        Objects.equals(this.extensions, vnfInstance2.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vnfInstanceName, vnfInstanceDescription, vnfdId, vnfProvider, vnfProductName, vnfSoftwareVersion, vnfdVersion, vnfPkgId, vnfConfigurableProperties, vimId, instantiationState, instantiatedVnfInfo, metadata, extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VnfInstance2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vnfInstanceName: ").append(toIndentedString(vnfInstanceName)).append("\n");
    sb.append("    vnfInstanceDescription: ").append(toIndentedString(vnfInstanceDescription)).append("\n");
    sb.append("    vnfdId: ").append(toIndentedString(vnfdId)).append("\n");
    sb.append("    vnfProvider: ").append(toIndentedString(vnfProvider)).append("\n");
    sb.append("    vnfProductName: ").append(toIndentedString(vnfProductName)).append("\n");
    sb.append("    vnfSoftwareVersion: ").append(toIndentedString(vnfSoftwareVersion)).append("\n");
    sb.append("    vnfdVersion: ").append(toIndentedString(vnfdVersion)).append("\n");
    sb.append("    vnfPkgId: ").append(toIndentedString(vnfPkgId)).append("\n");
    sb.append("    vnfConfigurableProperties: ").append(toIndentedString(vnfConfigurableProperties)).append("\n");
    sb.append("    vimId: ").append(toIndentedString(vimId)).append("\n");
    sb.append("    instantiationState: ").append(toIndentedString(instantiationState)).append("\n");
    sb.append("    instantiatedVnfInfo: ").append(toIndentedString(instantiatedVnfInfo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
