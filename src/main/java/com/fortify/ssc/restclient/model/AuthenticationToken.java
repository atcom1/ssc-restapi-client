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
 * Token to use for authentication
 */
@ApiModel(description = "Token to use for authentication")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class AuthenticationToken {
  @SerializedName("creationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("remainingUsages")
  private Integer remainingUsages = null;

  @SerializedName("terminalDate")
  private OffsetDateTime terminalDate = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("username")
  private String username = null;

   /**
   * Date and time the token was created (in ISO 8601 format)
   * @return creationDate
  **/
  @ApiModelProperty(example = "2017-09-22T19:08:42.000+0000", value = "Date and time the token was created (in ISO 8601 format)")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public AuthenticationToken description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Purpose for which the token was requested.
   * @return description
  **/
  @ApiModelProperty(value = "Purpose for which the token was requested.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * Unique identifier of token
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of token")
  public Long getId() {
    return id;
  }

   /**
   * The remaining number of api calls that can be made using this token. A value of -1 denotes unlimited number of calls.
   * @return remainingUsages
  **/
  @ApiModelProperty(value = "The remaining number of api calls that can be made using this token. A value of -1 denotes unlimited number of calls.")
  public Integer getRemainingUsages() {
    return remainingUsages;
  }

  public AuthenticationToken terminalDate(OffsetDateTime terminalDate) {
    this.terminalDate = terminalDate;
    return this;
  }

   /**
   * Date and time the token expires (in ISO 8601 format). If not specified, it will default to the maximum lifetime for this token type.
   * @return terminalDate
  **/
  @ApiModelProperty(example = "2017-11-29T22:40:11.000+0000", value = "Date and time the token expires (in ISO 8601 format). If not specified, it will default to the maximum lifetime for this token type.")
  public OffsetDateTime getTerminalDate() {
    return terminalDate;
  }

  public void setTerminalDate(OffsetDateTime terminalDate) {
    this.terminalDate = terminalDate;
  }

   /**
   * String that represents the authentication token. (For security reasons, this value is null except for a successful token creation response.)
   * @return token
  **/
  @ApiModelProperty(value = "String that represents the authentication token. (For security reasons, this value is null except for a successful token creation response.)")
  public String getToken() {
    return token;
  }

   /**
   * Token type
   * @return type
  **/
  @ApiModelProperty(example = "UnifiedLoginToken", required = true, value = "Token type")
  public String getType() {
    return type;
  }

   /**
   * Username of token owner
   * @return username
  **/
  @ApiModelProperty(value = "Username of token owner")
  public String getUsername() {
    return username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationToken authenticationToken = (AuthenticationToken) o;
    return Objects.equals(this.creationDate, authenticationToken.creationDate) &&
        Objects.equals(this.description, authenticationToken.description) &&
        Objects.equals(this.id, authenticationToken.id) &&
        Objects.equals(this.remainingUsages, authenticationToken.remainingUsages) &&
        Objects.equals(this.terminalDate, authenticationToken.terminalDate) &&
        Objects.equals(this.token, authenticationToken.token) &&
        Objects.equals(this.type, authenticationToken.type) &&
        Objects.equals(this.username, authenticationToken.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, description, id, remainingUsages, terminalDate, token, type, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationToken {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remainingUsages: ").append(toIndentedString(remainingUsages)).append("\n");
    sb.append("    terminalDate: ").append(toIndentedString(terminalDate)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
