/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.services;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.services.ErrorList;
import com.amazon.xingapi.model.services.ServiceJob;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the GetServiceJobByServiceJobId operation.
 */
@ApiModel(description = "The response schema for the GetServiceJobByServiceJobId operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:39.169+08:00")
public class GetServiceJobByServiceJobIdResponse {
  @SerializedName("payload")
  private ServiceJob payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetServiceJobByServiceJobIdResponse payload(ServiceJob payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the GetServiceJobByServiceJobId operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the GetServiceJobByServiceJobId operation.")
  public ServiceJob getPayload() {
    return payload;
  }

  public void setPayload(ServiceJob payload) {
    this.payload = payload;
  }

  public GetServiceJobByServiceJobIdResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * An unexpected condition occurred during the GetServiceJobByServiceJobId operation.
   * @return errors
  **/
  @ApiModelProperty(value = "An unexpected condition occurred during the GetServiceJobByServiceJobId operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetServiceJobByServiceJobIdResponse getServiceJobByServiceJobIdResponse = (GetServiceJobByServiceJobIdResponse) o;
    return Objects.equals(this.payload, getServiceJobByServiceJobIdResponse.payload) &&
        Objects.equals(this.errors, getServiceJobByServiceJobIdResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServiceJobByServiceJobIdResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
