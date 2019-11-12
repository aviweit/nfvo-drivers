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
 * This type provides information about added, deleted and modified PNFs. It shall comply with the provisions in Table 6.5.3.3-1. 
 */
@ApiModel(description = "This type provides information about added, deleted and modified PNFs. It shall comply with the provisions in Table 6.5.3.3-1. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T16:52:33.422+01:00")
public class AffectedPnf {
  @SerializedName("pnfId")
  private String pnfId = null;

  @SerializedName("pnfdId")
  private String pnfdId = null;

  @SerializedName("pnfProfileId")
  private String pnfProfileId = null;

  @SerializedName("pnfName")
  private String pnfName = null;

  @SerializedName("cpInstanceId")
  private List<String> cpInstanceId = new ArrayList<String>();

  /**
   * Signals the type of change. Permitted values: - ADD - REMOVE - MODIFY 
   */
  @JsonAdapter(ChangeTypeEnum.Adapter.class)
  public enum ChangeTypeEnum {
    ADD("ADD"),
    
    REMOVE("REMOVE"),
    
    MODIFY("MODIFY");

    private String value;

    ChangeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChangeTypeEnum fromValue(String text) {
      for (ChangeTypeEnum b : ChangeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChangeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChangeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChangeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChangeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("changeType")
  private ChangeTypeEnum changeType = null;

  /**
   * Signals the result of change identified by the \&quot;changeType\&quot; attribute. Permitted values: - COMPLETED - ROLLED_BACK - FAILED 
   */
  @JsonAdapter(ChangeResultEnum.Adapter.class)
  public enum ChangeResultEnum {
    COMPLETED("COMPLETED"),
    
    ROLLED_BACK("ROLLED_BACK"),
    
    FAILED("FAILED");

    private String value;

    ChangeResultEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChangeResultEnum fromValue(String text) {
      for (ChangeResultEnum b : ChangeResultEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChangeResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChangeResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChangeResultEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChangeResultEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("changeResult")
  private ChangeResultEnum changeResult = null;

  public AffectedPnf pnfId(String pnfId) {
    this.pnfId = pnfId;
    return this;
  }

   /**
   * Identifier of the affected PNF. This identifier is allocated by the OSS/BSS. 
   * @return pnfId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the affected PNF. This identifier is allocated by the OSS/BSS. ")
  public String getPnfId() {
    return pnfId;
  }

  public void setPnfId(String pnfId) {
    this.pnfId = pnfId;
  }

  public AffectedPnf pnfdId(String pnfdId) {
    this.pnfdId = pnfdId;
    return this;
  }

   /**
   * Identifier of the PNFD on which the PNF is based. 
   * @return pnfdId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the PNFD on which the PNF is based. ")
  public String getPnfdId() {
    return pnfdId;
  }

  public void setPnfdId(String pnfdId) {
    this.pnfdId = pnfdId;
  }

  public AffectedPnf pnfProfileId(String pnfProfileId) {
    this.pnfProfileId = pnfProfileId;
    return this;
  }

   /**
   * Identifier of the VNF profile of the NSD. 
   * @return pnfProfileId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the VNF profile of the NSD. ")
  public String getPnfProfileId() {
    return pnfProfileId;
  }

  public void setPnfProfileId(String pnfProfileId) {
    this.pnfProfileId = pnfProfileId;
  }

  public AffectedPnf pnfName(String pnfName) {
    this.pnfName = pnfName;
    return this;
  }

   /**
   * Name of the PNF. 
   * @return pnfName
  **/
  @ApiModelProperty(value = "Name of the PNF. ")
  public String getPnfName() {
    return pnfName;
  }

  public void setPnfName(String pnfName) {
    this.pnfName = pnfName;
  }

  public AffectedPnf cpInstanceId(List<String> cpInstanceId) {
    this.cpInstanceId = cpInstanceId;
    return this;
  }

  public AffectedPnf addCpInstanceIdItem(String cpInstanceIdItem) {
    this.cpInstanceId.add(cpInstanceIdItem);
    return this;
  }

   /**
   * Identifier of the CP in the scope of the PNF. 
   * @return cpInstanceId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the CP in the scope of the PNF. ")
  public List<String> getCpInstanceId() {
    return cpInstanceId;
  }

  public void setCpInstanceId(List<String> cpInstanceId) {
    this.cpInstanceId = cpInstanceId;
  }

  public AffectedPnf changeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
    return this;
  }

   /**
   * Signals the type of change. Permitted values: - ADD - REMOVE - MODIFY 
   * @return changeType
  **/
  @ApiModelProperty(value = "Signals the type of change. Permitted values: - ADD - REMOVE - MODIFY ")
  public ChangeTypeEnum getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
  }

  public AffectedPnf changeResult(ChangeResultEnum changeResult) {
    this.changeResult = changeResult;
    return this;
  }

   /**
   * Signals the result of change identified by the \&quot;changeType\&quot; attribute. Permitted values: - COMPLETED - ROLLED_BACK - FAILED 
   * @return changeResult
  **/
  @ApiModelProperty(value = "Signals the result of change identified by the \"changeType\" attribute. Permitted values: - COMPLETED - ROLLED_BACK - FAILED ")
  public ChangeResultEnum getChangeResult() {
    return changeResult;
  }

  public void setChangeResult(ChangeResultEnum changeResult) {
    this.changeResult = changeResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffectedPnf affectedPnf = (AffectedPnf) o;
    return Objects.equals(this.pnfId, affectedPnf.pnfId) &&
        Objects.equals(this.pnfdId, affectedPnf.pnfdId) &&
        Objects.equals(this.pnfProfileId, affectedPnf.pnfProfileId) &&
        Objects.equals(this.pnfName, affectedPnf.pnfName) &&
        Objects.equals(this.cpInstanceId, affectedPnf.cpInstanceId) &&
        Objects.equals(this.changeType, affectedPnf.changeType) &&
        Objects.equals(this.changeResult, affectedPnf.changeResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnfId, pnfdId, pnfProfileId, pnfName, cpInstanceId, changeType, changeResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffectedPnf {\n");
    
    sb.append("    pnfId: ").append(toIndentedString(pnfId)).append("\n");
    sb.append("    pnfdId: ").append(toIndentedString(pnfdId)).append("\n");
    sb.append("    pnfProfileId: ").append(toIndentedString(pnfProfileId)).append("\n");
    sb.append("    pnfName: ").append(toIndentedString(pnfName)).append("\n");
    sb.append("    cpInstanceId: ").append(toIndentedString(cpInstanceId)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    changeResult: ").append(toIndentedString(changeResult)).append("\n");
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

