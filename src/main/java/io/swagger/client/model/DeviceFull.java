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
import io.swagger.client.model.Line;
import io.swagger.client.model.SipAuthentication;
import java.util.ArrayList;
import java.util.List;

/**
 * The Full Device Object includes the properties in the Device Summary Object, along with the following:
 */
@ApiModel(description = "The Full Device Object includes the properties in the Device Summary Object, along with the following:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-31T14:54:48.237Z")
public class DeviceFull {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sip_authentication")
  private SipAuthentication sipAuthentication = null;

  @SerializedName("lines")
  private List<Line> lines = new ArrayList<Line>();

  public DeviceFull id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DeviceFull name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User-supplied name, otherwise NULL
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "User-supplied name, otherwise NULL")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceFull sipAuthentication(SipAuthentication sipAuthentication) {
    this.sipAuthentication = sipAuthentication;
    return this;
  }

   /**
   * Get sipAuthentication
   * @return sipAuthentication
  **/
  @ApiModelProperty(example = "null", value = "")
  public SipAuthentication getSipAuthentication() {
    return sipAuthentication;
  }

  public void setSipAuthentication(SipAuthentication sipAuthentication) {
    this.sipAuthentication = sipAuthentication;
  }

  public DeviceFull lines(List<Line> lines) {
    this.lines = lines;
    return this;
  }

  public DeviceFull addLinesItem(Line linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Array of Line Objects showing which extensions are attached to this device, and their assigned line numbers. See below for details.
   * @return lines
  **/
  @ApiModelProperty(example = "null", value = "Array of Line Objects showing which extensions are attached to this device, and their assigned line numbers. See below for details.")
  public List<Line> getLines() {
    return lines;
  }

  public void setLines(List<Line> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceFull deviceFull = (DeviceFull) o;
    return Objects.equals(this.id, deviceFull.id) &&
        Objects.equals(this.name, deviceFull.name) &&
        Objects.equals(this.sipAuthentication, deviceFull.sipAuthentication) &&
        Objects.equals(this.lines, deviceFull.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sipAuthentication, lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sipAuthentication: ").append(toIndentedString(sipAuthentication)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

