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
import it.nextworks.openapi.msno.model.ScaleNsData;
import it.nextworks.openapi.msno.model.ScaleVnfData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This type represents a request for the scale NS operation. 
 */
@ApiModel(description = "This type represents a request for the scale NS operation. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T16:52:33.422+01:00")
public class ScaleNsRequest {
  /**
   * Indicates the type of scaling to be performed. Possible values: - SCALE_NS - SCALE_VNF 
   */
  @JsonAdapter(ScaleTypeEnum.Adapter.class)
  public enum ScaleTypeEnum {
    NS("SCALE_NS"),
    
    VNF("SCALE_VNF");

    private String value;

    ScaleTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScaleTypeEnum fromValue(String text) {
      for (ScaleTypeEnum b : ScaleTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScaleTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScaleTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScaleTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScaleTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("scaleType")
  private ScaleTypeEnum scaleType = null;

  @SerializedName("scaleNsData")
  private ScaleNsData scaleNsData = null;

  @SerializedName("scaleVnfData")
  private List<ScaleVnfData> scaleVnfData = null;

  @SerializedName("scaleTime")
  private String scaleTime = null;

  public ScaleNsRequest scaleType(ScaleTypeEnum scaleType) {
    this.scaleType = scaleType;
    return this;
  }

   /**
   * Indicates the type of scaling to be performed. Possible values: - SCALE_NS - SCALE_VNF 
   * @return scaleType
  **/
  @ApiModelProperty(required = true, value = "Indicates the type of scaling to be performed. Possible values: - SCALE_NS - SCALE_VNF ")
  public ScaleTypeEnum getScaleType() {
    return scaleType;
  }

  public void setScaleType(ScaleTypeEnum scaleType) {
    this.scaleType = scaleType;
  }

  public ScaleNsRequest scaleNsData(ScaleNsData scaleNsData) {
    this.scaleNsData = scaleNsData;
    return this;
  }

   /**
   * The necessary information to scale the referenced NS instance. It shall be present when scaleType &#x3D; SCALE_NS. 
   * @return scaleNsData
  **/
  @ApiModelProperty(value = "The necessary information to scale the referenced NS instance. It shall be present when scaleType = SCALE_NS. ")
  public ScaleNsData getScaleNsData() {
    return scaleNsData;
  }

  public void setScaleNsData(ScaleNsData scaleNsData) {
    this.scaleNsData = scaleNsData;
  }

  public ScaleNsRequest scaleVnfData(List<ScaleVnfData> scaleVnfData) {
    this.scaleVnfData = scaleVnfData;
    return this;
  }

  public ScaleNsRequest addScaleVnfDataItem(ScaleVnfData scaleVnfDataItem) {
    if (this.scaleVnfData == null) {
      this.scaleVnfData = new ArrayList<ScaleVnfData>();
    }
    this.scaleVnfData.add(scaleVnfDataItem);
    return this;
  }

   /**
   * The necessary information to scale the referenced NS instance. It shall be present when scaleType &#x3D; SCALE_VNF. 
   * @return scaleVnfData
  **/
  @ApiModelProperty(value = "The necessary information to scale the referenced NS instance. It shall be present when scaleType = SCALE_VNF. ")
  public List<ScaleVnfData> getScaleVnfData() {
    return scaleVnfData;
  }

  public void setScaleVnfData(List<ScaleVnfData> scaleVnfData) {
    this.scaleVnfData = scaleVnfData;
  }

  public ScaleNsRequest scaleTime(String scaleTime) {
    this.scaleTime = scaleTime;
    return this;
  }

   /**
   * Timestamp indicating the scale time of the NS, i.e. the NS will be scaled at this timestamp. Cardinality \&quot;0\&quot; indicates the NS scaling takes place immediately\&quot;. 
   * @return scaleTime
  **/
  @ApiModelProperty(value = "Timestamp indicating the scale time of the NS, i.e. the NS will be scaled at this timestamp. Cardinality \"0\" indicates the NS scaling takes place immediately\". ")
  public String getScaleTime() {
    return scaleTime;
  }

  public void setScaleTime(String scaleTime) {
    this.scaleTime = scaleTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaleNsRequest scaleNsRequest = (ScaleNsRequest) o;
    return Objects.equals(this.scaleType, scaleNsRequest.scaleType) &&
        Objects.equals(this.scaleNsData, scaleNsRequest.scaleNsData) &&
        Objects.equals(this.scaleVnfData, scaleNsRequest.scaleVnfData) &&
        Objects.equals(this.scaleTime, scaleNsRequest.scaleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaleType, scaleNsData, scaleVnfData, scaleTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaleNsRequest {\n");
    
    sb.append("    scaleType: ").append(toIndentedString(scaleType)).append("\n");
    sb.append("    scaleNsData: ").append(toIndentedString(scaleNsData)).append("\n");
    sb.append("    scaleVnfData: ").append(toIndentedString(scaleVnfData)).append("\n");
    sb.append("    scaleTime: ").append(toIndentedString(scaleTime)).append("\n");
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

