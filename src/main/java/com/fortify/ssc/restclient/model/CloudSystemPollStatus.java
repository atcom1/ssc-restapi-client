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
import org.threeten.bp.OffsetDateTime;

/**
 * Cloudscan system poll status
 */
@ApiModel(description = "Cloudscan system poll status")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class CloudSystemPollStatus {
  @SerializedName("lastPollSuccessful")
  private Boolean lastPollSuccessful = null;

  @SerializedName("lastPollTime")
  private OffsetDateTime lastPollTime = null;

  @SerializedName("lastSuccessfulPollTime")
  private OffsetDateTime lastSuccessfulPollTime = null;

   /**
   * Get lastPollSuccessful
   * @return lastPollSuccessful
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean isLastPollSuccessful() {
    return lastPollSuccessful;
  }

   /**
   * Get lastPollTime
   * @return lastPollTime
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getLastPollTime() {
    return lastPollTime;
  }

   /**
   * Get lastSuccessfulPollTime
   * @return lastSuccessfulPollTime
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getLastSuccessfulPollTime() {
    return lastSuccessfulPollTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudSystemPollStatus cloudSystemPollStatus = (CloudSystemPollStatus) o;
    return Objects.equals(this.lastPollSuccessful, cloudSystemPollStatus.lastPollSuccessful) &&
        Objects.equals(this.lastPollTime, cloudSystemPollStatus.lastPollTime) &&
        Objects.equals(this.lastSuccessfulPollTime, cloudSystemPollStatus.lastSuccessfulPollTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastPollSuccessful, lastPollTime, lastSuccessfulPollTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudSystemPollStatus {\n");
    
    sb.append("    lastPollSuccessful: ").append(toIndentedString(lastPollSuccessful)).append("\n");
    sb.append("    lastPollTime: ").append(toIndentedString(lastPollTime)).append("\n");
    sb.append("    lastSuccessfulPollTime: ").append(toIndentedString(lastSuccessfulPollTime)).append("\n");
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
