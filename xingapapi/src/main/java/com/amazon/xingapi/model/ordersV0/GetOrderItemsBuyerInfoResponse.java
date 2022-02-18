/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.ordersV0;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.ordersV0.ErrorList;
import com.amazon.xingapi.model.ordersV0.OrderItemsBuyerInfoList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the getOrderItemsBuyerInfo operation.
 */
@ApiModel(description = "The response schema for the getOrderItemsBuyerInfo operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:21.398+08:00")
public class GetOrderItemsBuyerInfoResponse {
  @SerializedName("payload")
  private OrderItemsBuyerInfoList payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetOrderItemsBuyerInfoResponse payload(OrderItemsBuyerInfoList payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getOrderItemsBuyerInfo operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the getOrderItemsBuyerInfo operation.")
  public OrderItemsBuyerInfoList getPayload() {
    return payload;
  }

  public void setPayload(OrderItemsBuyerInfoList payload) {
    this.payload = payload;
  }

  public GetOrderItemsBuyerInfoResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the getOrderItemsBuyerInfo operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the getOrderItemsBuyerInfo operation.")
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
    GetOrderItemsBuyerInfoResponse getOrderItemsBuyerInfoResponse = (GetOrderItemsBuyerInfoResponse) o;
    return Objects.equals(this.payload, getOrderItemsBuyerInfoResponse.payload) &&
        Objects.equals(this.errors, getOrderItemsBuyerInfoResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderItemsBuyerInfoResponse {\n");
    
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

