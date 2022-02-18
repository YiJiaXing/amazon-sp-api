/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.merchantFulfillmentV0;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.merchantFulfillmentV0.ShipmentRequestDetails;
import com.amazon.xingapi.model.merchantFulfillmentV0.ShippingOfferingFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request schema.
 */
@ApiModel(description = "Request schema.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:16.283+08:00")
public class GetEligibleShipmentServicesRequest {
  @SerializedName("ShipmentRequestDetails")
  private ShipmentRequestDetails shipmentRequestDetails = null;

  @SerializedName("ShippingOfferingFilter")
  private ShippingOfferingFilter shippingOfferingFilter = null;

  public GetEligibleShipmentServicesRequest shipmentRequestDetails(ShipmentRequestDetails shipmentRequestDetails) {
    this.shipmentRequestDetails = shipmentRequestDetails;
    return this;
  }

   /**
   * Shipment information required for requesting shipping service offers.
   * @return shipmentRequestDetails
  **/
  @ApiModelProperty(required = true, value = "Shipment information required for requesting shipping service offers.")
  public ShipmentRequestDetails getShipmentRequestDetails() {
    return shipmentRequestDetails;
  }

  public void setShipmentRequestDetails(ShipmentRequestDetails shipmentRequestDetails) {
    this.shipmentRequestDetails = shipmentRequestDetails;
  }

  public GetEligibleShipmentServicesRequest shippingOfferingFilter(ShippingOfferingFilter shippingOfferingFilter) {
    this.shippingOfferingFilter = shippingOfferingFilter;
    return this;
  }

   /**
   * Get shippingOfferingFilter
   * @return shippingOfferingFilter
  **/
  @ApiModelProperty(value = "")
  public ShippingOfferingFilter getShippingOfferingFilter() {
    return shippingOfferingFilter;
  }

  public void setShippingOfferingFilter(ShippingOfferingFilter shippingOfferingFilter) {
    this.shippingOfferingFilter = shippingOfferingFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEligibleShipmentServicesRequest getEligibleShipmentServicesRequest = (GetEligibleShipmentServicesRequest) o;
    return Objects.equals(this.shipmentRequestDetails, getEligibleShipmentServicesRequest.shipmentRequestDetails) &&
        Objects.equals(this.shippingOfferingFilter, getEligibleShipmentServicesRequest.shippingOfferingFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentRequestDetails, shippingOfferingFilter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEligibleShipmentServicesRequest {\n");
    
    sb.append("    shipmentRequestDetails: ").append(toIndentedString(shipmentRequestDetails)).append("\n");
    sb.append("    shippingOfferingFilter: ").append(toIndentedString(shippingOfferingFilter)).append("\n");
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
