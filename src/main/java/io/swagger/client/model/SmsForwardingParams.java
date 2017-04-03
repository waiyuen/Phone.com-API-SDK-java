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
 * SMS Forwarding Object, or NULL
 */
@ApiModel(description = "SMS Forwarding Object, or NULL")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-03T15:39:58.948Z")
public class SmsForwardingParams {
  @SerializedName("type")
  private String type = null;

  @SerializedName("extension")
  private Integer extension = null;

  @SerializedName("application")
  private Integer application = null;

  public SmsForwardingParams type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Can be \"extension\" or \"application\"
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Can be \"extension\" or \"application\"")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SmsForwardingParams extension(Integer extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Required if type = \"extension\". Extension that messages should be directed to. Output is an Extension Summary Object. Input must be an Extension Lookup Object.
   * @return extension
  **/
  @ApiModelProperty(example = "null", value = "Required if type = \"extension\". Extension that messages should be directed to. Output is an Extension Summary Object. Input must be an Extension Lookup Object.")
  public Integer getExtension() {
    return extension;
  }

  public void setExtension(Integer extension) {
    this.extension = extension;
  }

  public SmsForwardingParams application(Integer application) {
    this.application = application;
    return this;
  }

   /**
   * Required if type = \"application\". Application that messages should be directed to. Output is an Application Summary Object. Input must be an Application Lookup Object.
   * @return application
  **/
  @ApiModelProperty(example = "null", value = "Required if type = \"application\". Application that messages should be directed to. Output is an Application Summary Object. Input must be an Application Lookup Object.")
  public Integer getApplication() {
    return application;
  }

  public void setApplication(Integer application) {
    this.application = application;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsForwardingParams smsForwardingParams = (SmsForwardingParams) o;
    return Objects.equals(this.type, smsForwardingParams.type) &&
        Objects.equals(this.extension, smsForwardingParams.extension) &&
        Objects.equals(this.application, smsForwardingParams.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, extension, application);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsForwardingParams {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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

