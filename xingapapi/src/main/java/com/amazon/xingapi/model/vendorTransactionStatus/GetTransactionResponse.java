/*
 * Selling Partner API for Retail Procurement Transaction Status
 * The Selling Partner API for Retail Procurement Transaction Status provides programmatic access to status information on specific asynchronous POST transactions for vendors.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.vendorTransactionStatus;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.vendorTransactionStatus.ErrorList;
import com.amazon.xingapi.model.vendorTransactionStatus.TransactionStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the getTransaction operation.
 */
@ApiModel(description = "The response schema for the getTransaction operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:45:23.438+08:00")
public class GetTransactionResponse {
  @SerializedName("payload")
  private TransactionStatus payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetTransactionResponse payload(TransactionStatus payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The response payload for the getTransaction operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The response payload for the getTransaction operation.")
  public TransactionStatus getPayload() {
    return payload;
  }

  public void setPayload(TransactionStatus payload) {
    this.payload = payload;
  }

  public GetTransactionResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
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
    GetTransactionResponse getTransactionResponse = (GetTransactionResponse) o;
    return Objects.equals(this.payload, getTransactionResponse.payload) &&
        Objects.equals(this.errors, getTransactionResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionResponse {\n");
    
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
