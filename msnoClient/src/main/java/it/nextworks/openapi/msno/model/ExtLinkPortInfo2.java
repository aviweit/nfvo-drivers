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
import it.nextworks.openapi.msno.model.ResourceHandle;

import java.io.IOException;

/**
 * This type represents information about a link port of an external VL, i.e. a port providing connectivity for the VNF to an NS VL. 
 */
@ApiModel(description = "This type represents information about a link port of an external VL, i.e. a port providing connectivity for the VNF to an NS VL. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T16:52:33.422+01:00")
public class ExtLinkPortInfo2 {
  @SerializedName("id")
  private String id = null;

  @SerializedName("resourceHandle")
  private ResourceHandle resourceHandle = null;

  @SerializedName("cpInstanceId")
  private String cpInstanceId = null;

  public ExtLinkPortInfo2 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of this link port as provided by the entity that has created the link port. 
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of this link port as provided by the entity that has created the link port. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExtLinkPortInfo2 resourceHandle(ResourceHandle resourceHandle) {
    this.resourceHandle = resourceHandle;
    return this;
  }

   /**
   * Reference to the virtualised resource realizing this link port. 
   * @return resourceHandle
  **/
  @ApiModelProperty(required = true, value = "Reference to the virtualised resource realizing this link port. ")
  public ResourceHandle getResourceHandle() {
    return resourceHandle;
  }

  public void setResourceHandle(ResourceHandle resourceHandle) {
    this.resourceHandle = resourceHandle;
  }

  public ExtLinkPortInfo2 cpInstanceId(String cpInstanceId) {
    this.cpInstanceId = cpInstanceId;
    return this;
  }

   /**
   * Identifier of the external CP of the VNF connected to this link port. There shall be at most one link port associated with any external connection point instance. The value refers to an \&quot;extCpInfo\&quot; item in the VnfInstance. 
   * @return cpInstanceId
  **/
  @ApiModelProperty(value = "Identifier of the external CP of the VNF connected to this link port. There shall be at most one link port associated with any external connection point instance. The value refers to an \"extCpInfo\" item in the VnfInstance. ")
  public String getCpInstanceId() {
    return cpInstanceId;
  }

  public void setCpInstanceId(String cpInstanceId) {
    this.cpInstanceId = cpInstanceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtLinkPortInfo2 extLinkPortInfo2 = (ExtLinkPortInfo2) o;
    return Objects.equals(this.id, extLinkPortInfo2.id) &&
        Objects.equals(this.resourceHandle, extLinkPortInfo2.resourceHandle) &&
        Objects.equals(this.cpInstanceId, extLinkPortInfo2.cpInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceHandle, cpInstanceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtLinkPortInfo2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceHandle: ").append(toIndentedString(resourceHandle)).append("\n");
    sb.append("    cpInstanceId: ").append(toIndentedString(cpInstanceId)).append("\n");
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
