/*
 * Fortify Software Security Center API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1:18.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fortify.ssc.restclient.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Trigger in a request or response that identifies a vulnerability
 */
@ApiModel(description = "Trigger in a request or response that identifies a vulnerability")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class Trigger {
  @SerializedName("length")
  private Integer length = null;

  @SerializedName("location")
  private Integer location = null;

  @SerializedName("triggerString")
  private String triggerString = null;

  public Trigger length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public Trigger location(Integer location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public Integer getLocation() {
    return location;
  }

  public void setLocation(Integer location) {
    this.location = location;
  }

  public Trigger triggerString(String triggerString) {
    this.triggerString = triggerString;
    return this;
  }

   /**
   * Get triggerString
   * @return triggerString
  **/
  @ApiModelProperty(value = "")
  public String getTriggerString() {
    return triggerString;
  }

  public void setTriggerString(String triggerString) {
    this.triggerString = triggerString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trigger trigger = (Trigger) o;
    return Objects.equals(this.length, trigger.length) &&
        Objects.equals(this.location, trigger.location) &&
        Objects.equals(this.triggerString, trigger.triggerString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, location, triggerString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trigger {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    triggerString: ").append(toIndentedString(triggerString)).append("\n");
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
