/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.fulfillmentInboundV0;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.fulfillmentInboundV0.InboundShipmentHeader;
import com.amazon.xingapi.model.fulfillmentInboundV0.InboundShipmentItemList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The request schema for an inbound shipment.
 */
@ApiModel(description = "The request schema for an inbound shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:08.527+08:00")
public class InboundShipmentRequest {
  @SerializedName("InboundShipmentHeader")
  private InboundShipmentHeader inboundShipmentHeader = null;

  @SerializedName("InboundShipmentItems")
  private InboundShipmentItemList inboundShipmentItems = null;

  @SerializedName("MarketplaceId")
  private String marketplaceId = null;

  public InboundShipmentRequest inboundShipmentHeader(InboundShipmentHeader inboundShipmentHeader) {
    this.inboundShipmentHeader = inboundShipmentHeader;
    return this;
  }

   /**
   * Get inboundShipmentHeader
   * @return inboundShipmentHeader
  **/
  @ApiModelProperty(required = true, value = "")
  public InboundShipmentHeader getInboundShipmentHeader() {
    return inboundShipmentHeader;
  }

  public void setInboundShipmentHeader(InboundShipmentHeader inboundShipmentHeader) {
    this.inboundShipmentHeader = inboundShipmentHeader;
  }

  public InboundShipmentRequest inboundShipmentItems(InboundShipmentItemList inboundShipmentItems) {
    this.inboundShipmentItems = inboundShipmentItems;
    return this;
  }

   /**
   * Get inboundShipmentItems
   * @return inboundShipmentItems
  **/
  @ApiModelProperty(required = true, value = "")
  public InboundShipmentItemList getInboundShipmentItems() {
    return inboundShipmentItems;
  }

  public void setInboundShipmentItems(InboundShipmentItemList inboundShipmentItems) {
    this.inboundShipmentItems = inboundShipmentItems;
  }

  public InboundShipmentRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * A marketplace identifier. Specifies the marketplace where the product would be stored.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "A marketplace identifier. Specifies the marketplace where the product would be stored.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundShipmentRequest inboundShipmentRequest = (InboundShipmentRequest) o;
    return Objects.equals(this.inboundShipmentHeader, inboundShipmentRequest.inboundShipmentHeader) &&
        Objects.equals(this.inboundShipmentItems, inboundShipmentRequest.inboundShipmentItems) &&
        Objects.equals(this.marketplaceId, inboundShipmentRequest.marketplaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundShipmentHeader, inboundShipmentItems, marketplaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundShipmentRequest {\n");
    
    sb.append("    inboundShipmentHeader: ").append(toIndentedString(inboundShipmentHeader)).append("\n");
    sb.append("    inboundShipmentItems: ").append(toIndentedString(inboundShipmentItems)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
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

