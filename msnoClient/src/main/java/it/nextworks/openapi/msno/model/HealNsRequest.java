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
import it.nextworks.openapi.msno.model.HealNsData;
import it.nextworks.openapi.msno.model.HealVnfData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This operation supports the healing of an NS instance, either by healing the complete NS instance or by healing one of more of the VNF instances that are part of this NS. It shall comply with the provisions defined in Table 6.5.2.13-1. 
 */
@ApiModel(description = "This operation supports the healing of an NS instance, either by healing the complete NS instance or by healing one of more of the VNF instances that are part of this NS. It shall comply with the provisions defined in Table 6.5.2.13-1. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T16:52:33.422+01:00")
public class HealNsRequest {
  @SerializedName("healNsData")
  private HealNsData healNsData = null;

  @SerializedName("healVnfData")
  private List<HealVnfData> healVnfData = null;

  public HealNsRequest healNsData(HealNsData healNsData) {
    this.healNsData = healNsData;
    return this;
  }

   /**
   * Indicates the reason why a healing procedure is required. 
   * @return healNsData
  **/
  @ApiModelProperty(value = "Indicates the reason why a healing procedure is required. ")
  public HealNsData getHealNsData() {
    return healNsData;
  }

  public void setHealNsData(HealNsData healNsData) {
    this.healNsData = healNsData;
  }

  public HealNsRequest healVnfData(List<HealVnfData> healVnfData) {
    this.healVnfData = healVnfData;
    return this;
  }

  public HealNsRequest addHealVnfDataItem(HealVnfData healVnfDataItem) {
    if (this.healVnfData == null) {
      this.healVnfData = new ArrayList<HealVnfData>();
    }
    this.healVnfData.add(healVnfDataItem);
    return this;
  }

   /**
   * Additional parameters passed by the NFVO as input to the healing process, specific to the VNF being healed, as declared in the VNFD as part of \&quot;HealVnfOpConfig\&quot;. 
   * @return healVnfData
  **/
  @ApiModelProperty(value = "Additional parameters passed by the NFVO as input to the healing process, specific to the VNF being healed, as declared in the VNFD as part of \"HealVnfOpConfig\". ")
  public List<HealVnfData> getHealVnfData() {
    return healVnfData;
  }

  public void setHealVnfData(List<HealVnfData> healVnfData) {
    this.healVnfData = healVnfData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealNsRequest healNsRequest = (HealNsRequest) o;
    return Objects.equals(this.healNsData, healNsRequest.healNsData) &&
        Objects.equals(this.healVnfData, healNsRequest.healVnfData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healNsData, healVnfData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealNsRequest {\n");
    
    sb.append("    healNsData: ").append(toIndentedString(healNsData)).append("\n");
    sb.append("    healVnfData: ").append(toIndentedString(healVnfData)).append("\n");
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

