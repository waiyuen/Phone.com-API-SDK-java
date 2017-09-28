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
import io.swagger.client.model.ApplicationSummary;
import io.swagger.client.model.ExtensionSummary;

/**
 * SMS Forwarding Object, or NULL
 */
@ApiModel(description = "SMS Forwarding Object, or NULL")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-31T14:54:48.237Z")
public class SmsForwarding {
  @SerializedName("type")
  private String type = null;

  @SerializedName("extension")
  private ExtensionSummary extension = null;

  @SerializedName("application")
  private ApplicationSummary application = null;

  public SmsForwarding type(String type) {
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

  public SmsForwarding extension(ExtensionSummary extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Required if type = \"extension\". Extension that messages should be directed to. Output is an Extension Summary Object. Input must be an Extension Lookup Object.
   * @return extension
  **/
  @ApiModelProperty(example = "null", value = "Required if type = \"extension\". Extension that messages should be directed to. Output is an Extension Summary Object. Input must be an Extension Lookup Object.")
  public ExtensionSummary getExtension() {
    return extension;
  }

  public void setExtension(ExtensionSummary extension) {
    this.extension = extension;
  }

  public SmsForwarding application(ApplicationSummary application) {
    this.application = application;
    return this;
  }

   /**
   * Required if type = \"application\". Application that messages should be directed to. Output is an Application Summary Object. Input must be an Application Lookup Object.
   * @return application
  **/
  @ApiModelProperty(example = "null", value = "Required if type = \"application\". Application that messages should be directed to. Output is an Application Summary Object. Input must be an Application Lookup Object.")
  public ApplicationSummary getApplication() {
    return application;
  }

  public void setApplication(ApplicationSummary application) {
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
    SmsForwarding smsForwarding = (SmsForwarding) o;
    return Objects.equals(this.type, smsForwarding.type) &&
        Objects.equals(this.extension, smsForwarding.extension) &&
        Objects.equals(this.application, smsForwarding.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, extension, application);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsForwarding {\n");
    
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

