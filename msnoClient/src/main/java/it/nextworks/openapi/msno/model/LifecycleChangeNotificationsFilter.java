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
import it.nextworks.openapi.msno.model.LcmOpNameForChangeNotificationType;
import it.nextworks.openapi.msno.model.LcmOpOccStatusForChangeNotificationType;
import it.nextworks.openapi.msno.model.LcmOperationStateType;
import it.nextworks.openapi.msno.model.NsComponentType;
import it.nextworks.openapi.msno.model.NsInstanceSubscriptionFilter;
import it.nextworks.openapi.msno.model.NsLcmOpType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This type represents a subscription filter related to notifications about NS lifecycle changes. It shall comply with the provisions defined in Table 6.5.3.8-1. At a particular nesting level in the filter structure, the following applies: All attributes shall match in order for the filter to match (logical \&quot;and\&quot; between different filter attributes). If an attribute is an array, the attribute shall match if at least one of the values in the array matches (logical \&quot;or\&quot; between the values of one filter attribute). 
 */
@ApiModel(description = "This type represents a subscription filter related to notifications about NS lifecycle changes. It shall comply with the provisions defined in Table 6.5.3.8-1. At a particular nesting level in the filter structure, the following applies: All attributes shall match in order for the filter to match (logical \"and\" between different filter attributes). If an attribute is an array, the attribute shall match if at least one of the values in the array matches (logical \"or\" between the values of one filter attribute). ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-08T16:52:33.422+01:00")
public class LifecycleChangeNotificationsFilter {
  @SerializedName("nsInstanceSubscriptionFilter")
  private NsInstanceSubscriptionFilter nsInstanceSubscriptionFilter = null;

  /**
   * Gets or Sets notificationTypes
   */
  @JsonAdapter(NotificationTypesEnum.Adapter.class)
  public enum NotificationTypesEnum {
    NSLCMOPERATIONOCCURENCENOTIFICATION("NsLcmOperationOccurenceNotification"),
    
    NSIDENTIFIERCREATIONNOTIFICATION("NsIdentifierCreationNotification"),
    
    NSIDENTIFIERDELETIONNOTIFICATION("NsIdentifierDeletionNotification"),
    
    NSCHANGENOTIFICATION("NsChangeNotification");

    private String value;

    NotificationTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationTypesEnum fromValue(String text) {
      for (NotificationTypesEnum b : NotificationTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NotificationTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotificationTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotificationTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NotificationTypesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("notificationTypes")
  private List<NotificationTypesEnum> notificationTypes = null;

  @SerializedName("operationTypes")
  private List<NsLcmOpType> operationTypes = null;

  @SerializedName("operationStates")
  private List<LcmOperationStateType> operationStates = null;

  @SerializedName("nsComponentTypes")
  private List<NsComponentType> nsComponentTypes = null;

  @SerializedName("lcmOpNameImpactingNsComponent")
  private List<LcmOpNameForChangeNotificationType> lcmOpNameImpactingNsComponent = null;

  @SerializedName("lcmOpOccStatusImpactingNsComponent")
  private List<LcmOpOccStatusForChangeNotificationType> lcmOpOccStatusImpactingNsComponent = null;

  public LifecycleChangeNotificationsFilter nsInstanceSubscriptionFilter(NsInstanceSubscriptionFilter nsInstanceSubscriptionFilter) {
    this.nsInstanceSubscriptionFilter = nsInstanceSubscriptionFilter;
    return this;
  }

   /**
   * Filter criteria to select NS instances about which to notify. 
   * @return nsInstanceSubscriptionFilter
  **/
  @ApiModelProperty(value = "Filter criteria to select NS instances about which to notify. ")
  public NsInstanceSubscriptionFilter getNsInstanceSubscriptionFilter() {
    return nsInstanceSubscriptionFilter;
  }

  public void setNsInstanceSubscriptionFilter(NsInstanceSubscriptionFilter nsInstanceSubscriptionFilter) {
    this.nsInstanceSubscriptionFilter = nsInstanceSubscriptionFilter;
  }

  public LifecycleChangeNotificationsFilter notificationTypes(List<NotificationTypesEnum> notificationTypes) {
    this.notificationTypes = notificationTypes;
    return this;
  }

  public LifecycleChangeNotificationsFilter addNotificationTypesItem(NotificationTypesEnum notificationTypesItem) {
    if (this.notificationTypes == null) {
      this.notificationTypes = new ArrayList<NotificationTypesEnum>();
    }
    this.notificationTypes.add(notificationTypesItem);
    return this;
  }

   /**
   * Match particular notification types. Permitted values: - NsLcmOperationOccurenceNotification - NsIdentifierCreationNotification - NsIdentifierDeletionNotification - NsChangeNotification 
   * @return notificationTypes
  **/
  @ApiModelProperty(value = "Match particular notification types. Permitted values: - NsLcmOperationOccurenceNotification - NsIdentifierCreationNotification - NsIdentifierDeletionNotification - NsChangeNotification ")
  public List<NotificationTypesEnum> getNotificationTypes() {
    return notificationTypes;
  }

  public void setNotificationTypes(List<NotificationTypesEnum> notificationTypes) {
    this.notificationTypes = notificationTypes;
  }

  public LifecycleChangeNotificationsFilter operationTypes(List<NsLcmOpType> operationTypes) {
    this.operationTypes = operationTypes;
    return this;
  }

  public LifecycleChangeNotificationsFilter addOperationTypesItem(NsLcmOpType operationTypesItem) {
    if (this.operationTypes == null) {
      this.operationTypes = new ArrayList<NsLcmOpType>();
    }
    this.operationTypes.add(operationTypesItem);
    return this;
  }

   /**
   * Match particular NS lifecycle operation types for the notification of type NsLcmOperationOccurrenceNotification. May be present if the \&quot;notificationTypes\&quot; attribute contains the value \&quot;NsLcmOperationOccurrenceNotification\&quot;, and shall be absent otherwise. 
   * @return operationTypes
  **/
  @ApiModelProperty(value = "Match particular NS lifecycle operation types for the notification of type NsLcmOperationOccurrenceNotification. May be present if the \"notificationTypes\" attribute contains the value \"NsLcmOperationOccurrenceNotification\", and shall be absent otherwise. ")
  public List<NsLcmOpType> getOperationTypes() {
    return operationTypes;
  }

  public void setOperationTypes(List<NsLcmOpType> operationTypes) {
    this.operationTypes = operationTypes;
  }

  public LifecycleChangeNotificationsFilter operationStates(List<LcmOperationStateType> operationStates) {
    this.operationStates = operationStates;
    return this;
  }

  public LifecycleChangeNotificationsFilter addOperationStatesItem(LcmOperationStateType operationStatesItem) {
    if (this.operationStates == null) {
      this.operationStates = new ArrayList<LcmOperationStateType>();
    }
    this.operationStates.add(operationStatesItem);
    return this;
  }

   /**
   * Match particular LCM operation state values as reported in notifications of type NsLcmOperationOccurrenceNotification. May be present if the \&quot;notificationTypes\&quot; attribute contains the value \&quot;NsLcmOperationOccurrenceNotification\&quot;, and shall be absent otherwise. 
   * @return operationStates
  **/
  @ApiModelProperty(value = "Match particular LCM operation state values as reported in notifications of type NsLcmOperationOccurrenceNotification. May be present if the \"notificationTypes\" attribute contains the value \"NsLcmOperationOccurrenceNotification\", and shall be absent otherwise. ")
  public List<LcmOperationStateType> getOperationStates() {
    return operationStates;
  }

  public void setOperationStates(List<LcmOperationStateType> operationStates) {
    this.operationStates = operationStates;
  }

  public LifecycleChangeNotificationsFilter nsComponentTypes(List<NsComponentType> nsComponentTypes) {
    this.nsComponentTypes = nsComponentTypes;
    return this;
  }

  public LifecycleChangeNotificationsFilter addNsComponentTypesItem(NsComponentType nsComponentTypesItem) {
    if (this.nsComponentTypes == null) {
      this.nsComponentTypes = new ArrayList<NsComponentType>();
    }
    this.nsComponentTypes.add(nsComponentTypesItem);
    return this;
  }

   /**
   * Match particular NS component types for the notification of type NsChangeNotification. May be present if the \&quot;notificationTypes\&quot; attribute contains the value \&quot;NsChang. 
   * @return nsComponentTypes
  **/
  @ApiModelProperty(value = "Match particular NS component types for the notification of type NsChangeNotification. May be present if the \"notificationTypes\" attribute contains the value \"NsChang. ")
  public List<NsComponentType> getNsComponentTypes() {
    return nsComponentTypes;
  }

  public void setNsComponentTypes(List<NsComponentType> nsComponentTypes) {
    this.nsComponentTypes = nsComponentTypes;
  }

  public LifecycleChangeNotificationsFilter lcmOpNameImpactingNsComponent(List<LcmOpNameForChangeNotificationType> lcmOpNameImpactingNsComponent) {
    this.lcmOpNameImpactingNsComponent = lcmOpNameImpactingNsComponent;
    return this;
  }

  public LifecycleChangeNotificationsFilter addLcmOpNameImpactingNsComponentItem(LcmOpNameForChangeNotificationType lcmOpNameImpactingNsComponentItem) {
    if (this.lcmOpNameImpactingNsComponent == null) {
      this.lcmOpNameImpactingNsComponent = new ArrayList<LcmOpNameForChangeNotificationType>();
    }
    this.lcmOpNameImpactingNsComponent.add(lcmOpNameImpactingNsComponentItem);
    return this;
  }

   /**
   * Match particular LCM operation names for the notification of type NsChangeNotification. May be present if the \&quot;notificationTypes\&quot; attribute contains the value \&quot;NsChangeNotification\&quot;, and shall be absent otherwise. 
   * @return lcmOpNameImpactingNsComponent
  **/
  @ApiModelProperty(value = "Match particular LCM operation names for the notification of type NsChangeNotification. May be present if the \"notificationTypes\" attribute contains the value \"NsChangeNotification\", and shall be absent otherwise. ")
  public List<LcmOpNameForChangeNotificationType> getLcmOpNameImpactingNsComponent() {
    return lcmOpNameImpactingNsComponent;
  }

  public void setLcmOpNameImpactingNsComponent(List<LcmOpNameForChangeNotificationType> lcmOpNameImpactingNsComponent) {
    this.lcmOpNameImpactingNsComponent = lcmOpNameImpactingNsComponent;
  }

  public LifecycleChangeNotificationsFilter lcmOpOccStatusImpactingNsComponent(List<LcmOpOccStatusForChangeNotificationType> lcmOpOccStatusImpactingNsComponent) {
    this.lcmOpOccStatusImpactingNsComponent = lcmOpOccStatusImpactingNsComponent;
    return this;
  }

  public LifecycleChangeNotificationsFilter addLcmOpOccStatusImpactingNsComponentItem(LcmOpOccStatusForChangeNotificationType lcmOpOccStatusImpactingNsComponentItem) {
    if (this.lcmOpOccStatusImpactingNsComponent == null) {
      this.lcmOpOccStatusImpactingNsComponent = new ArrayList<LcmOpOccStatusForChangeNotificationType>();
    }
    this.lcmOpOccStatusImpactingNsComponent.add(lcmOpOccStatusImpactingNsComponentItem);
    return this;
  }

   /**
   * Match particular LCM operation status values as reported in notifications of type NsChangeNotification. May be present if the \&quot;notificationTypes\&quot; attribute contains the value \&quot;NsChangeNotification\&quot;, and shall be absent otherwise. 
   * @return lcmOpOccStatusImpactingNsComponent
  **/
  @ApiModelProperty(value = "Match particular LCM operation status values as reported in notifications of type NsChangeNotification. May be present if the \"notificationTypes\" attribute contains the value \"NsChangeNotification\", and shall be absent otherwise. ")
  public List<LcmOpOccStatusForChangeNotificationType> getLcmOpOccStatusImpactingNsComponent() {
    return lcmOpOccStatusImpactingNsComponent;
  }

  public void setLcmOpOccStatusImpactingNsComponent(List<LcmOpOccStatusForChangeNotificationType> lcmOpOccStatusImpactingNsComponent) {
    this.lcmOpOccStatusImpactingNsComponent = lcmOpOccStatusImpactingNsComponent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifecycleChangeNotificationsFilter lifecycleChangeNotificationsFilter = (LifecycleChangeNotificationsFilter) o;
    return Objects.equals(this.nsInstanceSubscriptionFilter, lifecycleChangeNotificationsFilter.nsInstanceSubscriptionFilter) &&
        Objects.equals(this.notificationTypes, lifecycleChangeNotificationsFilter.notificationTypes) &&
        Objects.equals(this.operationTypes, lifecycleChangeNotificationsFilter.operationTypes) &&
        Objects.equals(this.operationStates, lifecycleChangeNotificationsFilter.operationStates) &&
        Objects.equals(this.nsComponentTypes, lifecycleChangeNotificationsFilter.nsComponentTypes) &&
        Objects.equals(this.lcmOpNameImpactingNsComponent, lifecycleChangeNotificationsFilter.lcmOpNameImpactingNsComponent) &&
        Objects.equals(this.lcmOpOccStatusImpactingNsComponent, lifecycleChangeNotificationsFilter.lcmOpOccStatusImpactingNsComponent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsInstanceSubscriptionFilter, notificationTypes, operationTypes, operationStates, nsComponentTypes, lcmOpNameImpactingNsComponent, lcmOpOccStatusImpactingNsComponent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleChangeNotificationsFilter {\n");
    
    sb.append("    nsInstanceSubscriptionFilter: ").append(toIndentedString(nsInstanceSubscriptionFilter)).append("\n");
    sb.append("    notificationTypes: ").append(toIndentedString(notificationTypes)).append("\n");
    sb.append("    operationTypes: ").append(toIndentedString(operationTypes)).append("\n");
    sb.append("    operationStates: ").append(toIndentedString(operationStates)).append("\n");
    sb.append("    nsComponentTypes: ").append(toIndentedString(nsComponentTypes)).append("\n");
    sb.append("    lcmOpNameImpactingNsComponent: ").append(toIndentedString(lcmOpNameImpactingNsComponent)).append("\n");
    sb.append("    lcmOpOccStatusImpactingNsComponent: ").append(toIndentedString(lcmOpOccStatusImpactingNsComponent)).append("\n");
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

