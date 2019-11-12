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
import it.nextworks.openapi.msno.model.CpProtocolInfo2;
import it.nextworks.openapi.msno.model.KeyValuePairs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VnfcResourceInfo2VnfcCpInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T16:52:33.422+01:00")
public class VnfcResourceInfo2VnfcCpInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("cpdId")
  private String cpdId = null;

  @SerializedName("vnfExtCpId")
  private String vnfExtCpId = null;

  @SerializedName("cpProtocolInfo")
  private List<CpProtocolInfo2> cpProtocolInfo = null;

  @SerializedName("vnfLinkPortId")
  private String vnfLinkPortId = null;

  @SerializedName("metadata")
  private KeyValuePairs metadata = null;

  public VnfcResourceInfo2VnfcCpInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of this VNFC CP instance and the associated array entry. 
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of this VNFC CP instance and the associated array entry. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VnfcResourceInfo2VnfcCpInfo cpdId(String cpdId) {
    this.cpdId = cpdId;
    return this;
  }

   /**
   * Identifier of the VDU CPD, cpdId, in the VNFD. 
   * @return cpdId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the VDU CPD, cpdId, in the VNFD. ")
  public String getCpdId() {
    return cpdId;
  }

  public void setCpdId(String cpdId) {
    this.cpdId = cpdId;
  }

  public VnfcResourceInfo2VnfcCpInfo vnfExtCpId(String vnfExtCpId) {
    this.vnfExtCpId = vnfExtCpId;
    return this;
  }

   /**
   * When the VNFC CP is exposed as external CP of the VNF, the identifier of this external VNF CP. 
   * @return vnfExtCpId
  **/
  @ApiModelProperty(value = "When the VNFC CP is exposed as external CP of the VNF, the identifier of this external VNF CP. ")
  public String getVnfExtCpId() {
    return vnfExtCpId;
  }

  public void setVnfExtCpId(String vnfExtCpId) {
    this.vnfExtCpId = vnfExtCpId;
  }

  public VnfcResourceInfo2VnfcCpInfo cpProtocolInfo(List<CpProtocolInfo2> cpProtocolInfo) {
    this.cpProtocolInfo = cpProtocolInfo;
    return this;
  }

  public VnfcResourceInfo2VnfcCpInfo addCpProtocolInfoItem(CpProtocolInfo2 cpProtocolInfoItem) {
    if (this.cpProtocolInfo == null) {
      this.cpProtocolInfo = new ArrayList<CpProtocolInfo2>();
    }
    this.cpProtocolInfo.add(cpProtocolInfoItem);
    return this;
  }

   /**
   * Network protocol information for this CP. 
   * @return cpProtocolInfo
  **/
  @ApiModelProperty(value = "Network protocol information for this CP. ")
  public List<CpProtocolInfo2> getCpProtocolInfo() {
    return cpProtocolInfo;
  }

  public void setCpProtocolInfo(List<CpProtocolInfo2> cpProtocolInfo) {
    this.cpProtocolInfo = cpProtocolInfo;
  }

  public VnfcResourceInfo2VnfcCpInfo vnfLinkPortId(String vnfLinkPortId) {
    this.vnfLinkPortId = vnfLinkPortId;
    return this;
  }

   /**
   * Identifier of the \&quot;vnfLinkPorts\&quot; structure in the \&quot;VnfVirtualLinkResourceInfo\&quot; structure. Shall be present if the CP is associated to a link port. 
   * @return vnfLinkPortId
  **/
  @ApiModelProperty(value = "Identifier of the \"vnfLinkPorts\" structure in the \"VnfVirtualLinkResourceInfo\" structure. Shall be present if the CP is associated to a link port. ")
  public String getVnfLinkPortId() {
    return vnfLinkPortId;
  }

  public void setVnfLinkPortId(String vnfLinkPortId) {
    this.vnfLinkPortId = vnfLinkPortId;
  }

  public VnfcResourceInfo2VnfcCpInfo metadata(KeyValuePairs metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata about this CP. 
   * @return metadata
  **/
  @ApiModelProperty(value = "Metadata about this CP. ")
  public KeyValuePairs getMetadata() {
    return metadata;
  }

  public void setMetadata(KeyValuePairs metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VnfcResourceInfo2VnfcCpInfo vnfcResourceInfo2VnfcCpInfo = (VnfcResourceInfo2VnfcCpInfo) o;
    return Objects.equals(this.id, vnfcResourceInfo2VnfcCpInfo.id) &&
        Objects.equals(this.cpdId, vnfcResourceInfo2VnfcCpInfo.cpdId) &&
        Objects.equals(this.vnfExtCpId, vnfcResourceInfo2VnfcCpInfo.vnfExtCpId) &&
        Objects.equals(this.cpProtocolInfo, vnfcResourceInfo2VnfcCpInfo.cpProtocolInfo) &&
        Objects.equals(this.vnfLinkPortId, vnfcResourceInfo2VnfcCpInfo.vnfLinkPortId) &&
        Objects.equals(this.metadata, vnfcResourceInfo2VnfcCpInfo.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cpdId, vnfExtCpId, cpProtocolInfo, vnfLinkPortId, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VnfcResourceInfo2VnfcCpInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cpdId: ").append(toIndentedString(cpdId)).append("\n");
    sb.append("    vnfExtCpId: ").append(toIndentedString(vnfExtCpId)).append("\n");
    sb.append("    cpProtocolInfo: ").append(toIndentedString(cpProtocolInfo)).append("\n");
    sb.append("    vnfLinkPortId: ").append(toIndentedString(vnfLinkPortId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

