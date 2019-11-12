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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This type specifies additional parameters on a per-nested NS instance basis. It shall comply with the provisions defined in Table 6.5.3.21a-1. 
 */
@ApiModel(description = "This type specifies additional parameters on a per-nested NS instance basis. It shall comply with the provisions defined in Table 6.5.3.21a-1. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T16:52:33.422+01:00")
public class ParamsForNestedNs {
  @SerializedName("nsProfileId")
  private String nsProfileId = null;

  @SerializedName("additionalParam")
  private List<KeyValuePairs> additionalParam = null;

  public ParamsForNestedNs nsProfileId(String nsProfileId) {
    this.nsProfileId = nsProfileId;
    return this;
  }

   /**
   * Identifier of a NsProfile to which the additional parameters apply. 
   * @return nsProfileId
  **/
  @ApiModelProperty(required = true, value = "Identifier of a NsProfile to which the additional parameters apply. ")
  public String getNsProfileId() {
    return nsProfileId;
  }

  public void setNsProfileId(String nsProfileId) {
    this.nsProfileId = nsProfileId;
  }

  public ParamsForNestedNs additionalParam(List<KeyValuePairs> additionalParam) {
    this.additionalParam = additionalParam;
    return this;
  }

  public ParamsForNestedNs addAdditionalParamItem(KeyValuePairs additionalParamItem) {
    if (this.additionalParam == null) {
      this.additionalParam = new ArrayList<KeyValuePairs>();
    }
    this.additionalParam.add(additionalParamItem);
    return this;
  }

   /**
   * Additional parameters that are to be applied on a per nested NS instance. 
   * @return additionalParam
  **/
  @ApiModelProperty(value = "Additional parameters that are to be applied on a per nested NS instance. ")
  public List<KeyValuePairs> getAdditionalParam() {
    return additionalParam;
  }

  public void setAdditionalParam(List<KeyValuePairs> additionalParam) {
    this.additionalParam = additionalParam;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParamsForNestedNs paramsForNestedNs = (ParamsForNestedNs) o;
    return Objects.equals(this.nsProfileId, paramsForNestedNs.nsProfileId) &&
        Objects.equals(this.additionalParam, paramsForNestedNs.additionalParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsProfileId, additionalParam);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParamsForNestedNs {\n");
    
    sb.append("    nsProfileId: ").append(toIndentedString(nsProfileId)).append("\n");
    sb.append("    additionalParam: ").append(toIndentedString(additionalParam)).append("\n");
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

