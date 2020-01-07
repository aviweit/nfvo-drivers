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
import it.nextworks.openapi.msno.model.SubscriptionAuthenticationParamsBasic;
import it.nextworks.openapi.msno.model.SubscriptionAuthenticationParamsOauth2ClientCredentials;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SubscriptionAuthentication
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T16:52:33.422+01:00")
public class SubscriptionAuthentication {
  /**
   * Gets or Sets authType
   */
  @JsonAdapter(AuthTypeEnum.Adapter.class)
  public enum AuthTypeEnum {
    BASIC("BASIC"),
    
    OAUTH2_CLIENT_CREDENTIALS("OAUTH2_CLIENT_CREDENTIALS"),
    
    TLS_CERT("TLS_CERT");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthTypeEnum fromValue(String text) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("authType")
  private List<AuthTypeEnum> authType = new ArrayList<AuthTypeEnum>();

  @SerializedName("paramsBasic")
  private SubscriptionAuthenticationParamsBasic paramsBasic = null;

  @SerializedName("paramsOauth2ClientCredentials")
  private SubscriptionAuthenticationParamsOauth2ClientCredentials paramsOauth2ClientCredentials = null;

  public SubscriptionAuthentication authType(List<AuthTypeEnum> authType) {
    this.authType = authType;
    return this;
  }

  public SubscriptionAuthentication addAuthTypeItem(AuthTypeEnum authTypeItem) {
    this.authType.add(authTypeItem);
    return this;
  }

   /**
   * Defines the types of Authentication / Authorization which the API consumer is willing to accept when receiving a notification. Permitted values: - BASIC: In every HTTP request to the notification endpoint, use   HTTP Basic authentication with the client credentials. - OAUTH2_CLIENT_CREDENTIALS: In every HTTP request to the   notification endpoint, use an OAuth 2.0 Bearer token, obtained   using the client credentials grant type. - TLS_CERT: Every HTTP request to the notification endpoint is sent   over a mutually authenticated TLS session, i.e. not only the   server is authenticated, but also the client is authenticated   during the TLS tunnel setup. 
   * @return authType
  **/
  @ApiModelProperty(required = true, value = "Defines the types of Authentication / Authorization which the API consumer is willing to accept when receiving a notification. Permitted values: - BASIC: In every HTTP request to the notification endpoint, use   HTTP Basic authentication with the client credentials. - OAUTH2_CLIENT_CREDENTIALS: In every HTTP request to the   notification endpoint, use an OAuth 2.0 Bearer token, obtained   using the client credentials grant type. - TLS_CERT: Every HTTP request to the notification endpoint is sent   over a mutually authenticated TLS session, i.e. not only the   server is authenticated, but also the client is authenticated   during the TLS tunnel setup. ")
  public List<AuthTypeEnum> getAuthType() {
    return authType;
  }

  public void setAuthType(List<AuthTypeEnum> authType) {
    this.authType = authType;
  }

  public SubscriptionAuthentication paramsBasic(SubscriptionAuthenticationParamsBasic paramsBasic) {
    this.paramsBasic = paramsBasic;
    return this;
  }

   /**
   * Get paramsBasic
   * @return paramsBasic
  **/
  @ApiModelProperty(value = "")
  public SubscriptionAuthenticationParamsBasic getParamsBasic() {
    return paramsBasic;
  }

  public void setParamsBasic(SubscriptionAuthenticationParamsBasic paramsBasic) {
    this.paramsBasic = paramsBasic;
  }

  public SubscriptionAuthentication paramsOauth2ClientCredentials(SubscriptionAuthenticationParamsOauth2ClientCredentials paramsOauth2ClientCredentials) {
    this.paramsOauth2ClientCredentials = paramsOauth2ClientCredentials;
    return this;
  }

   /**
   * Get paramsOauth2ClientCredentials
   * @return paramsOauth2ClientCredentials
  **/
  @ApiModelProperty(value = "")
  public SubscriptionAuthenticationParamsOauth2ClientCredentials getParamsOauth2ClientCredentials() {
    return paramsOauth2ClientCredentials;
  }

  public void setParamsOauth2ClientCredentials(SubscriptionAuthenticationParamsOauth2ClientCredentials paramsOauth2ClientCredentials) {
    this.paramsOauth2ClientCredentials = paramsOauth2ClientCredentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionAuthentication subscriptionAuthentication = (SubscriptionAuthentication) o;
    return Objects.equals(this.authType, subscriptionAuthentication.authType) &&
        Objects.equals(this.paramsBasic, subscriptionAuthentication.paramsBasic) &&
        Objects.equals(this.paramsOauth2ClientCredentials, subscriptionAuthentication.paramsOauth2ClientCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, paramsBasic, paramsOauth2ClientCredentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAuthentication {\n");
    
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    paramsBasic: ").append(toIndentedString(paramsBasic)).append("\n");
    sb.append("    paramsOauth2ClientCredentials: ").append(toIndentedString(paramsOauth2ClientCredentials)).append("\n");
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
