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
import com.fortify.ssc.restclient.model.CloudPool;
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
 * Cloudscan worker
 */
@ApiModel(description = "Cloudscan worker")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class CloudWorker {
  @SerializedName("availableProcessors")
  private Integer availableProcessors = null;

  @SerializedName("cloudPool")
  private CloudPool cloudPool = null;

  @SerializedName("hostName")
  private String hostName = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("lastActivity")
  private String lastActivity = null;

  @SerializedName("lastSeen")
  private OffsetDateTime lastSeen = null;

  @SerializedName("osArchitecture")
  private String osArchitecture = null;

  @SerializedName("osName")
  private String osName = null;

  @SerializedName("osVersion")
  private String osVersion = null;

  @SerializedName("processUuid")
  private String processUuid = null;

  @SerializedName("scaVersion")
  private String scaVersion = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("totalPhysicalMemory")
  private Long totalPhysicalMemory = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("vmName")
  private String vmName = null;

  @SerializedName("workerExpiryTime")
  private OffsetDateTime workerExpiryTime = null;

  @SerializedName("workerStartTime")
  private OffsetDateTime workerStartTime = null;

   /**
   * Get availableProcessors
   * @return availableProcessors
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAvailableProcessors() {
    return availableProcessors;
  }

  public CloudWorker cloudPool(CloudPool cloudPool) {
    this.cloudPool = cloudPool;
    return this;
  }

   /**
   * Get cloudPool
   * @return cloudPool
  **/
  @ApiModelProperty(required = true, value = "")
  public CloudPool getCloudPool() {
    return cloudPool;
  }

  public void setCloudPool(CloudPool cloudPool) {
    this.cloudPool = cloudPool;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getHostName() {
    return hostName;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIpAddress() {
    return ipAddress;
  }

   /**
   * Get lastActivity
   * @return lastActivity
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLastActivity() {
    return lastActivity;
  }

   /**
   * Get lastSeen
   * @return lastSeen
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getLastSeen() {
    return lastSeen;
  }

   /**
   * Get osArchitecture
   * @return osArchitecture
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOsArchitecture() {
    return osArchitecture;
  }

   /**
   * Get osName
   * @return osName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOsName() {
    return osName;
  }

   /**
   * Get osVersion
   * @return osVersion
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOsVersion() {
    return osVersion;
  }

   /**
   * Get processUuid
   * @return processUuid
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProcessUuid() {
    return processUuid;
  }

   /**
   * Get scaVersion
   * @return scaVersion
  **/
  @ApiModelProperty(required = true, value = "")
  public String getScaVersion() {
    return scaVersion;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  public String getState() {
    return state;
  }

   /**
   * Get totalPhysicalMemory
   * @return totalPhysicalMemory
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getTotalPhysicalMemory() {
    return totalPhysicalMemory;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUuid() {
    return uuid;
  }

   /**
   * Get vmName
   * @return vmName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getVmName() {
    return vmName;
  }

   /**
   * Get workerExpiryTime
   * @return workerExpiryTime
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getWorkerExpiryTime() {
    return workerExpiryTime;
  }

   /**
   * Get workerStartTime
   * @return workerStartTime
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getWorkerStartTime() {
    return workerStartTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudWorker cloudWorker = (CloudWorker) o;
    return Objects.equals(this.availableProcessors, cloudWorker.availableProcessors) &&
        Objects.equals(this.cloudPool, cloudWorker.cloudPool) &&
        Objects.equals(this.hostName, cloudWorker.hostName) &&
        Objects.equals(this.ipAddress, cloudWorker.ipAddress) &&
        Objects.equals(this.lastActivity, cloudWorker.lastActivity) &&
        Objects.equals(this.lastSeen, cloudWorker.lastSeen) &&
        Objects.equals(this.osArchitecture, cloudWorker.osArchitecture) &&
        Objects.equals(this.osName, cloudWorker.osName) &&
        Objects.equals(this.osVersion, cloudWorker.osVersion) &&
        Objects.equals(this.processUuid, cloudWorker.processUuid) &&
        Objects.equals(this.scaVersion, cloudWorker.scaVersion) &&
        Objects.equals(this.state, cloudWorker.state) &&
        Objects.equals(this.totalPhysicalMemory, cloudWorker.totalPhysicalMemory) &&
        Objects.equals(this.uuid, cloudWorker.uuid) &&
        Objects.equals(this.vmName, cloudWorker.vmName) &&
        Objects.equals(this.workerExpiryTime, cloudWorker.workerExpiryTime) &&
        Objects.equals(this.workerStartTime, cloudWorker.workerStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableProcessors, cloudPool, hostName, ipAddress, lastActivity, lastSeen, osArchitecture, osName, osVersion, processUuid, scaVersion, state, totalPhysicalMemory, uuid, vmName, workerExpiryTime, workerStartTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudWorker {\n");
    
    sb.append("    availableProcessors: ").append(toIndentedString(availableProcessors)).append("\n");
    sb.append("    cloudPool: ").append(toIndentedString(cloudPool)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    osArchitecture: ").append(toIndentedString(osArchitecture)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    processUuid: ").append(toIndentedString(processUuid)).append("\n");
    sb.append("    scaVersion: ").append(toIndentedString(scaVersion)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    totalPhysicalMemory: ").append(toIndentedString(totalPhysicalMemory)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
    sb.append("    workerExpiryTime: ").append(toIndentedString(workerExpiryTime)).append("\n");
    sb.append("    workerStartTime: ").append(toIndentedString(workerStartTime)).append("\n");
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

