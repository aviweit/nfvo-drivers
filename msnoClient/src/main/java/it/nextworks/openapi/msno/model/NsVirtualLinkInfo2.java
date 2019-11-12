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
import it.nextworks.openapi.msno.model.NsLinkPortInfo2;
import it.nextworks.openapi.msno.model.ResourceHandle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This type specifies the information about an NS VL instance. It shall comply with the provisions defined in Table 6.5.3.53-1 
 */
@ApiModel(description = "This type specifies the information about an NS VL instance. It shall comply with the provisions defined in Table 6.5.3.53-1 ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T16:52:33.422+01:00")
public class NsVirtualLinkInfo2 {
  @SerializedName("id")
  private String id = null;

  @SerializedName("nsVirtualLinkDescId")
  private String nsVirtualLinkDescId = null;

  @SerializedName("nsVirtualLinkProfileId")
  private String nsVirtualLinkProfileId = null;

  @SerializedName("resourceHandle")
  private List<ResourceHandle> resourceHandle = null;

  @SerializedName("linkPort")
  private List<NsLinkPortInfo2> linkPort = null;

  public NsVirtualLinkInfo2 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the VL instance. 
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the VL instance. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NsVirtualLinkInfo2 nsVirtualLinkDescId(String nsVirtualLinkDescId) {
    this.nsVirtualLinkDescId = nsVirtualLinkDescId;
    return this;
  }

   /**
   * Identifier of the VLD in the NSD. 
   * @return nsVirtualLinkDescId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the VLD in the NSD. ")
  public String getNsVirtualLinkDescId() {
    return nsVirtualLinkDescId;
  }

  public void setNsVirtualLinkDescId(String nsVirtualLinkDescId) {
    this.nsVirtualLinkDescId = nsVirtualLinkDescId;
  }

  public NsVirtualLinkInfo2 nsVirtualLinkProfileId(String nsVirtualLinkProfileId) {
    this.nsVirtualLinkProfileId = nsVirtualLinkProfileId;
    return this;
  }

   /**
   * Identifier of the VL profile in the NSD. 
   * @return nsVirtualLinkProfileId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the VL profile in the NSD. ")
  public String getNsVirtualLinkProfileId() {
    return nsVirtualLinkProfileId;
  }

  public void setNsVirtualLinkProfileId(String nsVirtualLinkProfileId) {
    this.nsVirtualLinkProfileId = nsVirtualLinkProfileId;
  }

  public NsVirtualLinkInfo2 resourceHandle(List<ResourceHandle> resourceHandle) {
    this.resourceHandle = resourceHandle;
    return this;
  }

  public NsVirtualLinkInfo2 addResourceHandleItem(ResourceHandle resourceHandleItem) {
    if (this.resourceHandle == null) {
      this.resourceHandle = new ArrayList<ResourceHandle>();
    }
    this.resourceHandle.add(resourceHandleItem);
    return this;
  }

   /**
   * Identifier(s) of the virtualised network resource(s) realizing the VL instance. See note. 
   * @return resourceHandle
  **/
  @ApiModelProperty(value = "Identifier(s) of the virtualised network resource(s) realizing the VL instance. See note. ")
  public List<ResourceHandle> getResourceHandle() {
    return resourceHandle;
  }

  public void setResourceHandle(List<ResourceHandle> resourceHandle) {
    this.resourceHandle = resourceHandle;
  }

  public NsVirtualLinkInfo2 linkPort(List<NsLinkPortInfo2> linkPort) {
    this.linkPort = linkPort;
    return this;
  }

  public NsVirtualLinkInfo2 addLinkPortItem(NsLinkPortInfo2 linkPortItem) {
    if (this.linkPort == null) {
      this.linkPort = new ArrayList<NsLinkPortInfo2>();
    }
    this.linkPort.add(linkPortItem);
    return this;
  }

   /**
   * Link ports of the VL instance. Cardinality of zero indicates that no port has yet been created for the VL instance. 
   * @return linkPort
  **/
  @ApiModelProperty(value = "Link ports of the VL instance. Cardinality of zero indicates that no port has yet been created for the VL instance. ")
  public List<NsLinkPortInfo2> getLinkPort() {
    return linkPort;
  }

  public void setLinkPort(List<NsLinkPortInfo2> linkPort) {
    this.linkPort = linkPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NsVirtualLinkInfo2 nsVirtualLinkInfo2 = (NsVirtualLinkInfo2) o;
    return Objects.equals(this.id, nsVirtualLinkInfo2.id) &&
        Objects.equals(this.nsVirtualLinkDescId, nsVirtualLinkInfo2.nsVirtualLinkDescId) &&
        Objects.equals(this.nsVirtualLinkProfileId, nsVirtualLinkInfo2.nsVirtualLinkProfileId) &&
        Objects.equals(this.resourceHandle, nsVirtualLinkInfo2.resourceHandle) &&
        Objects.equals(this.linkPort, nsVirtualLinkInfo2.linkPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nsVirtualLinkDescId, nsVirtualLinkProfileId, resourceHandle, linkPort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NsVirtualLinkInfo2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nsVirtualLinkDescId: ").append(toIndentedString(nsVirtualLinkDescId)).append("\n");
    sb.append("    nsVirtualLinkProfileId: ").append(toIndentedString(nsVirtualLinkProfileId)).append("\n");
    sb.append("    resourceHandle: ").append(toIndentedString(resourceHandle)).append("\n");
    sb.append("    linkPort: ").append(toIndentedString(linkPort)).append("\n");
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

