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
import io.swagger.client.model.DeviceSummary;

/**
 * Device Membership Object, or NULL. Read-only. See below for details.
 */
@ApiModel(description = "Device Membership Object, or NULL. Read-only. See below for details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-03T15:39:58.948Z")
public class DeviceMembership {
  @SerializedName("line")
  private Integer line = null;

  @SerializedName("device")
  private DeviceSummary device = null;

  public DeviceMembership line(Integer line) {
    this.line = line;
    return this;
  }

   /**
   * Line number to which this extension is assigned. Integer.
   * @return line
  **/
  @ApiModelProperty(example = "null", value = "Line number to which this extension is assigned. Integer.")
  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }

  public DeviceMembership device(DeviceSummary device) {
    this.device = device;
    return this;
  }

   /**
   * Device that this extension belongs to. Output is an Device Summary Object.
   * @return device
  **/
  @ApiModelProperty(example = "null", value = "Device that this extension belongs to. Output is an Device Summary Object.")
  public DeviceSummary getDevice() {
    return device;
  }

  public void setDevice(DeviceSummary device) {
    this.device = device;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceMembership deviceMembership = (DeviceMembership) o;
    return Objects.equals(this.line, deviceMembership.line) &&
        Objects.equals(this.device, deviceMembership.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line, device);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMembership {\n");
    
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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

