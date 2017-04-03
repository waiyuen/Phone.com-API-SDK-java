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
import io.swagger.client.model.RuleSetAction;
import io.swagger.client.model.RuleSetFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * RuleSet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-03T15:39:58.948Z")
public class RuleSet {
  @SerializedName("filter")
  private RuleSetFilter filter = null;

  @SerializedName("actions")
  private List<RuleSetAction> actions = new ArrayList<RuleSetAction>();

  public RuleSet filter(RuleSetFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(example = "null", value = "")
  public RuleSetFilter getFilter() {
    return filter;
  }

  public void setFilter(RuleSetFilter filter) {
    this.filter = filter;
  }

  public RuleSet actions(List<RuleSetAction> actions) {
    this.actions = actions;
    return this;
  }

  public RuleSet addActionsItem(RuleSetAction actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Array of Action Objects. Required. Routes have rule sets, and rule sets have one or more actions. The supported actions are described below:
   * @return actions
  **/
  @ApiModelProperty(example = "null", value = "Array of Action Objects. Required. Routes have rule sets, and rule sets have one or more actions. The supported actions are described below:")
  public List<RuleSetAction> getActions() {
    return actions;
  }

  public void setActions(List<RuleSetAction> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleSet ruleSet = (RuleSet) o;
    return Objects.equals(this.filter, ruleSet.filter) &&
        Objects.equals(this.actions, ruleSet.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSet {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

