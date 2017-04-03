/*
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CallNotifications;
import io.swagger.client.model.CallerIdPhoneNumber;
import io.swagger.client.model.SmsForwardingParams;

/**
 * ReplacePhoneNumberParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-03T15:39:58.948Z")
public class ReplacePhoneNumberParams {
  @SerializedName("route")
  private Object route = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("block_incoming")
  private Boolean blockIncoming = null;

  @SerializedName("block_anonymous")
  private Boolean blockAnonymous = null;

  @SerializedName("caller_id")
  private CallerIdPhoneNumber callerId = null;

  @SerializedName("sms_forwarding")
  private SmsForwardingParams smsForwarding = null;

  @SerializedName("pool_item")
  private Object poolItem = null;

  @SerializedName("call_notifications")
  private CallNotifications callNotifications = null;

  public ReplacePhoneNumberParams route(Object route) {
    this.route = route;
    return this;
  }

   /**
   * Route lookup object
   * @return route
  **/
  @ApiModelProperty(example = "null", value = "Route lookup object")
  public Object getRoute() {
    return route;
  }

  public void setRoute(Object route) {
    this.route = route;
  }

  public ReplacePhoneNumberParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Phone Name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Phone Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReplacePhoneNumberParams blockIncoming(Boolean blockIncoming) {
    this.blockIncoming = blockIncoming;
    return this;
  }

   /**
   * Block incoming calls
   * @return blockIncoming
  **/
  @ApiModelProperty(example = "null", value = "Block incoming calls")
  public Boolean getBlockIncoming() {
    return blockIncoming;
  }

  public void setBlockIncoming(Boolean blockIncoming) {
    this.blockIncoming = blockIncoming;
  }

  public ReplacePhoneNumberParams blockAnonymous(Boolean blockAnonymous) {
    this.blockAnonymous = blockAnonymous;
    return this;
  }

   /**
   * Block anonymous calls
   * @return blockAnonymous
  **/
  @ApiModelProperty(example = "null", value = "Block anonymous calls")
  public Boolean getBlockAnonymous() {
    return blockAnonymous;
  }

  public void setBlockAnonymous(Boolean blockAnonymous) {
    this.blockAnonymous = blockAnonymous;
  }

  public ReplacePhoneNumberParams callerId(CallerIdPhoneNumber callerId) {
    this.callerId = callerId;
    return this;
  }

   /**
   * Caller ID object
   * @return callerId
  **/
  @ApiModelProperty(example = "null", value = "Caller ID object")
  public CallerIdPhoneNumber getCallerId() {
    return callerId;
  }

  public void setCallerId(CallerIdPhoneNumber callerId) {
    this.callerId = callerId;
  }

  public ReplacePhoneNumberParams smsForwarding(SmsForwardingParams smsForwarding) {
    this.smsForwarding = smsForwarding;
    return this;
  }

   /**
   * SMS Forwarding Object, or NULL
   * @return smsForwarding
  **/
  @ApiModelProperty(example = "null", value = "SMS Forwarding Object, or NULL")
  public SmsForwardingParams getSmsForwarding() {
    return smsForwarding;
  }

  public void setSmsForwarding(SmsForwardingParams smsForwarding) {
    this.smsForwarding = smsForwarding;
  }

  public ReplacePhoneNumberParams poolItem(Object poolItem) {
    this.poolItem = poolItem;
    return this;
  }

   /**
   * Pool lookup object
   * @return poolItem
  **/
  @ApiModelProperty(example = "null", value = "Pool lookup object")
  public Object getPoolItem() {
    return poolItem;
  }

  public void setPoolItem(Object poolItem) {
    this.poolItem = poolItem;
  }

  public ReplacePhoneNumberParams callNotifications(CallNotifications callNotifications) {
    this.callNotifications = callNotifications;
    return this;
  }

   /**
   * Call Notifications object
   * @return callNotifications
  **/
  @ApiModelProperty(example = "null", value = "Call Notifications object")
  public CallNotifications getCallNotifications() {
    return callNotifications;
  }

  public void setCallNotifications(CallNotifications callNotifications) {
    this.callNotifications = callNotifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplacePhoneNumberParams replacePhoneNumberParams = (ReplacePhoneNumberParams) o;
    return Objects.equals(this.route, replacePhoneNumberParams.route) &&
        Objects.equals(this.name, replacePhoneNumberParams.name) &&
        Objects.equals(this.blockIncoming, replacePhoneNumberParams.blockIncoming) &&
        Objects.equals(this.blockAnonymous, replacePhoneNumberParams.blockAnonymous) &&
        Objects.equals(this.callerId, replacePhoneNumberParams.callerId) &&
        Objects.equals(this.smsForwarding, replacePhoneNumberParams.smsForwarding) &&
        Objects.equals(this.poolItem, replacePhoneNumberParams.poolItem) &&
        Objects.equals(this.callNotifications, replacePhoneNumberParams.callNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(route, name, blockIncoming, blockAnonymous, callerId, smsForwarding, poolItem, callNotifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplacePhoneNumberParams {\n");
    
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    blockIncoming: ").append(toIndentedString(blockIncoming)).append("\n");
    sb.append("    blockAnonymous: ").append(toIndentedString(blockAnonymous)).append("\n");
    sb.append("    callerId: ").append(toIndentedString(callerId)).append("\n");
    sb.append("    smsForwarding: ").append(toIndentedString(smsForwarding)).append("\n");
    sb.append("    poolItem: ").append(toIndentedString(poolItem)).append("\n");
    sb.append("    callNotifications: ").append(toIndentedString(callNotifications)).append("\n");
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

