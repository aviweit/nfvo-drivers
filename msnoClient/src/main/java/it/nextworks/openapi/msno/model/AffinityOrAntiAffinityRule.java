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
 * This type describes the additional affinity or anti-affinity rule applicable between the VNF instances to be instantiated in the NS instantiation operation request or between the VNF instances to be instantiated in the NS instantiation operation request and the existing VNF instances.. 
 */
@ApiModel(description = "This type describes the additional affinity or anti-affinity rule applicable between the VNF instances to be instantiated in the NS instantiation operation request or between the VNF instances to be instantiated in the NS instantiation operation request and the existing VNF instances.. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T16:52:33.422+01:00")
public class AffinityOrAntiAffinityRule {
  @SerializedName("vnfdId")
  private List<String> vnfdId = null;

  @SerializedName("vnfProfileId")
  private List<String> vnfProfileId = null;

  @SerializedName("vnfInstanceId")
  private List<String> vnfInstanceId = null;

  /**
   * The type of the constraint. Permitted values: AFFINITY ANTI_AFFINITY. 
   */
  @JsonAdapter(AffinityOrAntiAffiintyEnum.Adapter.class)
  public enum AffinityOrAntiAffiintyEnum {
    AFFINITY("AFFINITY"),
    
    ANTI_AFFINITY("ANTI_AFFINITY");

    private String value;

    AffinityOrAntiAffiintyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AffinityOrAntiAffiintyEnum fromValue(String text) {
      for (AffinityOrAntiAffiintyEnum b : AffinityOrAntiAffiintyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AffinityOrAntiAffiintyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AffinityOrAntiAffiintyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AffinityOrAntiAffiintyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AffinityOrAntiAffiintyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("affinityOrAntiAffiinty")
  private AffinityOrAntiAffiintyEnum affinityOrAntiAffiinty = null;

  /**
   * Specifies the scope of the rule where the placement constraint applies. Permitted values: NFVI_POP ZONE ZONE_GROUP NFVI_NODE. 
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    NFVI_POP("NFVI_POP"),
    
    ZONE("ZONE"),
    
    ZONE_GROUP("ZONE_GROUP"),
    
    NFVI_NODE("NFVI_NODE");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScopeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("scope")
  private ScopeEnum scope = null;

  public AffinityOrAntiAffinityRule vnfdId(List<String> vnfdId) {
    this.vnfdId = vnfdId;
    return this;
  }

  public AffinityOrAntiAffinityRule addVnfdIdItem(String vnfdIdItem) {
    if (this.vnfdId == null) {
      this.vnfdId = new ArrayList<String>();
    }
    this.vnfdId.add(vnfdIdItem);
    return this;
  }

   /**
   * Reference to a VNFD. When the VNFD which is not used to instantiate VNF, it presents all VNF instances of this type as the subjects of the affinity or anti-affinity rule. The VNF instance which the VNFD presents is not necessary as a part of the NS to be instantiated. 
   * @return vnfdId
  **/
  @ApiModelProperty(value = "Reference to a VNFD. When the VNFD which is not used to instantiate VNF, it presents all VNF instances of this type as the subjects of the affinity or anti-affinity rule. The VNF instance which the VNFD presents is not necessary as a part of the NS to be instantiated. ")
  public List<String> getVnfdId() {
    return vnfdId;
  }

  public void setVnfdId(List<String> vnfdId) {
    this.vnfdId = vnfdId;
  }

  public AffinityOrAntiAffinityRule vnfProfileId(List<String> vnfProfileId) {
    this.vnfProfileId = vnfProfileId;
    return this;
  }

  public AffinityOrAntiAffinityRule addVnfProfileIdItem(String vnfProfileIdItem) {
    if (this.vnfProfileId == null) {
      this.vnfProfileId = new ArrayList<String>();
    }
    this.vnfProfileId.add(vnfProfileIdItem);
    return this;
  }

   /**
   * Reference to a vnfProfile defined in the NSD. At least one VnfProfile which is used to instantiate VNF for the NS to be instantiated as the subject of the affinity or anti-affinity rule shall be present. When the VnfProfile which is not used to instantiate VNF, it presents all VNF instances of this type as the subjects of the affinity or anti-affinity rule. The VNF instance which the VnfProfile presents is not necessary as a part of the NS to be instantiated. 
   * @return vnfProfileId
  **/
  @ApiModelProperty(value = "Reference to a vnfProfile defined in the NSD. At least one VnfProfile which is used to instantiate VNF for the NS to be instantiated as the subject of the affinity or anti-affinity rule shall be present. When the VnfProfile which is not used to instantiate VNF, it presents all VNF instances of this type as the subjects of the affinity or anti-affinity rule. The VNF instance which the VnfProfile presents is not necessary as a part of the NS to be instantiated. ")
  public List<String> getVnfProfileId() {
    return vnfProfileId;
  }

  public void setVnfProfileId(List<String> vnfProfileId) {
    this.vnfProfileId = vnfProfileId;
  }

  public AffinityOrAntiAffinityRule vnfInstanceId(List<String> vnfInstanceId) {
    this.vnfInstanceId = vnfInstanceId;
    return this;
  }

  public AffinityOrAntiAffinityRule addVnfInstanceIdItem(String vnfInstanceIdItem) {
    if (this.vnfInstanceId == null) {
      this.vnfInstanceId = new ArrayList<String>();
    }
    this.vnfInstanceId.add(vnfInstanceIdItem);
    return this;
  }

   /**
   * Reference to the existing VNF instance as the subject of the affinity or anti-affinity rule. The existing VNF instance is not necessary as a part of the NS to be instantiated. 
   * @return vnfInstanceId
  **/
  @ApiModelProperty(value = "Reference to the existing VNF instance as the subject of the affinity or anti-affinity rule. The existing VNF instance is not necessary as a part of the NS to be instantiated. ")
  public List<String> getVnfInstanceId() {
    return vnfInstanceId;
  }

  public void setVnfInstanceId(List<String> vnfInstanceId) {
    this.vnfInstanceId = vnfInstanceId;
  }

  public AffinityOrAntiAffinityRule affinityOrAntiAffiinty(AffinityOrAntiAffiintyEnum affinityOrAntiAffiinty) {
    this.affinityOrAntiAffiinty = affinityOrAntiAffiinty;
    return this;
  }

   /**
   * The type of the constraint. Permitted values: AFFINITY ANTI_AFFINITY. 
   * @return affinityOrAntiAffiinty
  **/
  @ApiModelProperty(required = true, value = "The type of the constraint. Permitted values: AFFINITY ANTI_AFFINITY. ")
  public AffinityOrAntiAffiintyEnum getAffinityOrAntiAffiinty() {
    return affinityOrAntiAffiinty;
  }

  public void setAffinityOrAntiAffiinty(AffinityOrAntiAffiintyEnum affinityOrAntiAffiinty) {
    this.affinityOrAntiAffiinty = affinityOrAntiAffiinty;
  }

  public AffinityOrAntiAffinityRule scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Specifies the scope of the rule where the placement constraint applies. Permitted values: NFVI_POP ZONE ZONE_GROUP NFVI_NODE. 
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "Specifies the scope of the rule where the placement constraint applies. Permitted values: NFVI_POP ZONE ZONE_GROUP NFVI_NODE. ")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffinityOrAntiAffinityRule affinityOrAntiAffinityRule = (AffinityOrAntiAffinityRule) o;
    return Objects.equals(this.vnfdId, affinityOrAntiAffinityRule.vnfdId) &&
        Objects.equals(this.vnfProfileId, affinityOrAntiAffinityRule.vnfProfileId) &&
        Objects.equals(this.vnfInstanceId, affinityOrAntiAffinityRule.vnfInstanceId) &&
        Objects.equals(this.affinityOrAntiAffiinty, affinityOrAntiAffinityRule.affinityOrAntiAffiinty) &&
        Objects.equals(this.scope, affinityOrAntiAffinityRule.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vnfdId, vnfProfileId, vnfInstanceId, affinityOrAntiAffiinty, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffinityOrAntiAffinityRule {\n");
    
    sb.append("    vnfdId: ").append(toIndentedString(vnfdId)).append("\n");
    sb.append("    vnfProfileId: ").append(toIndentedString(vnfProfileId)).append("\n");
    sb.append("    vnfInstanceId: ").append(toIndentedString(vnfInstanceId)).append("\n");
    sb.append("    affinityOrAntiAffiinty: ").append(toIndentedString(affinityOrAntiAffiinty)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
