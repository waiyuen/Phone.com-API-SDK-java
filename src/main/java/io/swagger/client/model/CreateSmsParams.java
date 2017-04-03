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
 * CreateSmsParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-03T15:39:58.948Z")
public class CreateSmsParams {
  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("extension_id")
  private Integer extensionId = null;

  public CreateSmsParams from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Phone number of sender
   * @return from
  **/
  @ApiModelProperty(example = "null", required = true, value = "Phone number of sender")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public CreateSmsParams to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Outgoing destination numbers
   * @return to
  **/
  @ApiModelProperty(example = "null", required = true, value = "Outgoing destination numbers")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public CreateSmsParams text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text body of the outgoing SMS message. Maximum 160 characters per message.
   * @return text
  **/
  @ApiModelProperty(example = "null", required = true, value = "Text body of the outgoing SMS message. Maximum 160 characters per message.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateSmsParams extensionId(Integer extensionId) {
    this.extensionId = extensionId;
    return this;
  }

   /**
   * ID of Extension where the sms is saved
   * @return extensionId
  **/
  @ApiModelProperty(example = "null", value = "ID of Extension where the sms is saved")
  public Integer getExtensionId() {
    return extensionId;
  }

  public void setExtensionId(Integer extensionId) {
    this.extensionId = extensionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSmsParams createSmsParams = (CreateSmsParams) o;
    return Objects.equals(this.from, createSmsParams.from) &&
        Objects.equals(this.to, createSmsParams.to) &&
        Objects.equals(this.text, createSmsParams.text) &&
        Objects.equals(this.extensionId, createSmsParams.extensionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, text, extensionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSmsParams {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    extensionId: ").append(toIndentedString(extensionId)).append("\n");
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

