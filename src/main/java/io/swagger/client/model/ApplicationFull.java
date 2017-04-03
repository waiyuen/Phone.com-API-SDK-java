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
 * The Full Application Object is identical to the Application Summary Object. See above for details.
 */
@ApiModel(description = "The Full Application Object is identical to the Application Summary Object. See above for details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-03T15:39:58.948Z")
public class ApplicationFull {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  public ApplicationFull id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Application ID. Read-only.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Application ID. Read-only.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ApplicationFull name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Application name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Application name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationFull applicationFull = (ApplicationFull) o;
    return Objects.equals(this.id, applicationFull.id) &&
        Objects.equals(this.name, applicationFull.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

