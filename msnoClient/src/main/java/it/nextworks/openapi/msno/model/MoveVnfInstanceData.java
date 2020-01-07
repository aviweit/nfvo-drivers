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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This type specifies existing VNF instances to be moved from one NS instance (source) to another NS instance (destination). The NS instance defined in the Update NS operation indicates the source NS instance and the destination NS instance is specified in this data type (referred to targetNsInstanceId). It shall comply with the provisions defined in Table 6.5.3.35-1. 
 */
@ApiModel(description = "This type specifies existing VNF instances to be moved from one NS instance (source) to another NS instance (destination). The NS instance defined in the Update NS operation indicates the source NS instance and the destination NS instance is specified in this data type (referred to targetNsInstanceId). It shall comply with the provisions defined in Table 6.5.3.35-1. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T16:52:33.422+01:00")
public class MoveVnfInstanceData {
  @SerializedName("targetNsInstanceId")
  private String targetNsInstanceId = null;

  @SerializedName("vnfInstanceId")
  private List<String> vnfInstanceId = null;

  public MoveVnfInstanceData targetNsInstanceId(String targetNsInstanceId) {
    this.targetNsInstanceId = targetNsInstanceId;
    return this;
  }

   /**
   * Specify the target NS instance where the VNF instances are moved to. 
   * @return targetNsInstanceId
  **/
  @ApiModelProperty(required = true, value = "Specify the target NS instance where the VNF instances are moved to. ")
  public String getTargetNsInstanceId() {
    return targetNsInstanceId;
  }

  public void setTargetNsInstanceId(String targetNsInstanceId) {
    this.targetNsInstanceId = targetNsInstanceId;
  }

  public MoveVnfInstanceData vnfInstanceId(List<String> vnfInstanceId) {
    this.vnfInstanceId = vnfInstanceId;
    return this;
  }

  public MoveVnfInstanceData addVnfInstanceIdItem(String vnfInstanceIdItem) {
    if (this.vnfInstanceId == null) {
      this.vnfInstanceId = new ArrayList<String>();
    }
    this.vnfInstanceId.add(vnfInstanceIdItem);
    return this;
  }

   /**
   * Specify the VNF instance that is moved. 
   * @return vnfInstanceId
  **/
  @ApiModelProperty(value = "Specify the VNF instance that is moved. ")
  public List<String> getVnfInstanceId() {
    return vnfInstanceId;
  }

  public void setVnfInstanceId(List<String> vnfInstanceId) {
    this.vnfInstanceId = vnfInstanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveVnfInstanceData moveVnfInstanceData = (MoveVnfInstanceData) o;
    return Objects.equals(this.targetNsInstanceId, moveVnfInstanceData.targetNsInstanceId) &&
        Objects.equals(this.vnfInstanceId, moveVnfInstanceData.vnfInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetNsInstanceId, vnfInstanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveVnfInstanceData {\n");
    
    sb.append("    targetNsInstanceId: ").append(toIndentedString(targetNsInstanceId)).append("\n");
    sb.append("    vnfInstanceId: ").append(toIndentedString(vnfInstanceId)).append("\n");
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
