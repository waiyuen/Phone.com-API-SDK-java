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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateQueueParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-03T15:39:58.948Z")
public class CreateQueueParams {
  @SerializedName("name")
  private String name = null;

  @SerializedName("greeting")
  private Object greeting = null;

  @SerializedName("hold_music")
  private Object holdMusic = null;

  @SerializedName("max_hold_time")
  private Integer maxHoldTime = null;

  @SerializedName("caller_id_type")
  private String callerIdType = null;

  @SerializedName("ring_time")
  private Integer ringTime = null;

  @SerializedName("members")
  private List<Object> members = new ArrayList<Object>();

  public CreateQueueParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of queue
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name of queue")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateQueueParams greeting(Object greeting) {
    this.greeting = greeting;
    return this;
  }

   /**
   * Recording lookup object
   * @return greeting
  **/
  @ApiModelProperty(example = "null", value = "Recording lookup object")
  public Object getGreeting() {
    return greeting;
  }

  public void setGreeting(Object greeting) {
    this.greeting = greeting;
  }

  public CreateQueueParams holdMusic(Object holdMusic) {
    this.holdMusic = holdMusic;
    return this;
  }

   /**
   * Recording lookup object
   * @return holdMusic
  **/
  @ApiModelProperty(example = "null", value = "Recording lookup object")
  public Object getHoldMusic() {
    return holdMusic;
  }

  public void setHoldMusic(Object holdMusic) {
    this.holdMusic = holdMusic;
  }

  public CreateQueueParams maxHoldTime(Integer maxHoldTime) {
    this.maxHoldTime = maxHoldTime;
    return this;
  }

   /**
   * Max seconds for hold
   * @return maxHoldTime
  **/
  @ApiModelProperty(example = "null", value = "Max seconds for hold")
  public Integer getMaxHoldTime() {
    return maxHoldTime;
  }

  public void setMaxHoldTime(Integer maxHoldTime) {
    this.maxHoldTime = maxHoldTime;
  }

  public CreateQueueParams callerIdType(String callerIdType) {
    this.callerIdType = callerIdType;
    return this;
  }

   /**
   * Type of caller id
   * @return callerIdType
  **/
  @ApiModelProperty(example = "null", value = "Type of caller id")
  public String getCallerIdType() {
    return callerIdType;
  }

  public void setCallerIdType(String callerIdType) {
    this.callerIdType = callerIdType;
  }

  public CreateQueueParams ringTime(Integer ringTime) {
    this.ringTime = ringTime;
    return this;
  }

   /**
   * Number of seconds to ring each member
   * @return ringTime
  **/
  @ApiModelProperty(example = "null", value = "Number of seconds to ring each member")
  public Integer getRingTime() {
    return ringTime;
  }

  public void setRingTime(Integer ringTime) {
    this.ringTime = ringTime;
  }

  public CreateQueueParams members(List<Object> members) {
    this.members = members;
    return this;
  }

  public CreateQueueParams addMembersItem(Object membersItem) {
    this.members.add(membersItem);
    return this;
  }

   /**
   * Extensions or phone numbers
   * @return members
  **/
  @ApiModelProperty(example = "null", value = "Extensions or phone numbers")
  public List<Object> getMembers() {
    return members;
  }

  public void setMembers(List<Object> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateQueueParams createQueueParams = (CreateQueueParams) o;
    return Objects.equals(this.name, createQueueParams.name) &&
        Objects.equals(this.greeting, createQueueParams.greeting) &&
        Objects.equals(this.holdMusic, createQueueParams.holdMusic) &&
        Objects.equals(this.maxHoldTime, createQueueParams.maxHoldTime) &&
        Objects.equals(this.callerIdType, createQueueParams.callerIdType) &&
        Objects.equals(this.ringTime, createQueueParams.ringTime) &&
        Objects.equals(this.members, createQueueParams.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, greeting, holdMusic, maxHoldTime, callerIdType, ringTime, members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateQueueParams {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("    holdMusic: ").append(toIndentedString(holdMusic)).append("\n");
    sb.append("    maxHoldTime: ").append(toIndentedString(maxHoldTime)).append("\n");
    sb.append("    callerIdType: ").append(toIndentedString(callerIdType)).append("\n");
    sb.append("    ringTime: ").append(toIndentedString(ringTime)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

