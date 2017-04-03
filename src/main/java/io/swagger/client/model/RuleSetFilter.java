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
import io.swagger.client.model.ContactSummary;
import io.swagger.client.model.GroupSummary;
import io.swagger.client.model.ScheduleSummary;

/**
 * Filter Object. Optional. See below for details.
 */
@ApiModel(description = "Filter Object. Optional. See below for details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-03T15:39:58.948Z")
public class RuleSetFilter {
  @SerializedName("type")
  private String type = null;

  @SerializedName("schedule")
  private ScheduleSummary schedule = null;

  @SerializedName("contact")
  private ContactSummary contact = null;

  @SerializedName("group")
  private GroupSummary group = null;

  public RuleSetFilter type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Required.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Required.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RuleSetFilter schedule(ScheduleSummary schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Schedule that this filter refers to. Output is a Schedule Summary Object. Input must be a Schedule Lookup Object. Required.
   * @return schedule
  **/
  @ApiModelProperty(example = "null", value = "Schedule that this filter refers to. Output is a Schedule Summary Object. Input must be a Schedule Lookup Object. Required.")
  public ScheduleSummary getSchedule() {
    return schedule;
  }

  public void setSchedule(ScheduleSummary schedule) {
    this.schedule = schedule;
  }

  public RuleSetFilter contact(ContactSummary contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Address Book Contact that this filter refers to. Output is a Contact Summary Object. Input must be a Contact Lookup Object. Required.
   * @return contact
  **/
  @ApiModelProperty(example = "null", value = "Address Book Contact that this filter refers to. Output is a Contact Summary Object. Input must be a Contact Lookup Object. Required.")
  public ContactSummary getContact() {
    return contact;
  }

  public void setContact(ContactSummary contact) {
    this.contact = contact;
  }

  public RuleSetFilter group(GroupSummary group) {
    this.group = group;
    return this;
  }

   /**
   * Address Book Group that this filter refers to. Output is a Contact Group Summary Object. Input must be a Contact Group Lookup Object. Required.
   * @return group
  **/
  @ApiModelProperty(example = "null", value = "Address Book Group that this filter refers to. Output is a Contact Group Summary Object. Input must be a Contact Group Lookup Object. Required.")
  public GroupSummary getGroup() {
    return group;
  }

  public void setGroup(GroupSummary group) {
    this.group = group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleSetFilter ruleSetFilter = (RuleSetFilter) o;
    return Objects.equals(this.type, ruleSetFilter.type) &&
        Objects.equals(this.schedule, ruleSetFilter.schedule) &&
        Objects.equals(this.contact, ruleSetFilter.contact) &&
        Objects.equals(this.group, ruleSetFilter.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, schedule, contact, group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSetFilter {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

