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

/**
 * Here are all of the properties you can expect for Caller ID objects:
 */
@ApiModel(description = "Here are all of the properties you can expect for Caller ID objects:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-31T14:54:48.237Z")
public class CallerIdFull {
  @SerializedName("number")
  private String number = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public CallerIdFull number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Phone number, in E.164 format
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "Phone number, in E.164 format")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CallerIdFull name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name you have supplied for this number
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name you have supplied for this number")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CallerIdFull type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of Caller ID. account means this number is registered to your account, and extra refers to extra numbers which you have authorized, which are not managed under Phone.com.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of Caller ID. account means this number is registered to your account, and extra refers to extra numbers which you have authorized, which are not managed under Phone.com.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallerIdFull callerIdFull = (CallerIdFull) o;
    return Objects.equals(this.number, callerIdFull.number) &&
        Objects.equals(this.name, callerIdFull.name) &&
        Objects.equals(this.type, callerIdFull.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallerIdFull {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

