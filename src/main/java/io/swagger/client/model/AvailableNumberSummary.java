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
 * The Available Phone Number Summary Object is used to briefly represent a phone number. It can be seen in several places throughout this API. Here are the properties:
 */
@ApiModel(description = "The Available Phone Number Summary Object is used to briefly represent a phone number. It can be seen in several places throughout this API. Here are the properties:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-31T14:54:48.237Z")
public class AvailableNumberSummary {
  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("formatted")
  private String formatted = null;

  public AvailableNumberSummary phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number, in E.164 format
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", value = "Phone number, in E.164 format")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AvailableNumberSummary formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

   /**
   * Human-readable formatted version of the phone number
   * @return formatted
  **/
  @ApiModelProperty(example = "null", value = "Human-readable formatted version of the phone number")
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableNumberSummary availableNumberSummary = (AvailableNumberSummary) o;
    return Objects.equals(this.phoneNumber, availableNumberSummary.phoneNumber) &&
        Objects.equals(this.formatted, availableNumberSummary.formatted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, formatted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableNumberSummary {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
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

