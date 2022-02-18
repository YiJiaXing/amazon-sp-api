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
import com.amazon.xingapi.model.fulfillmentInboundV0.GuidanceReasonList;
import com.amazon.xingapi.model.fulfillmentInboundV0.InboundGuidance;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Reasons why a given ASIN is not recommended for shipment to Amazon&#39;s fulfillment network.
 */
@ApiModel(description = "Reasons why a given ASIN is not recommended for shipment to Amazon's fulfillment network.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:08.527+08:00")
public class ASINInboundGuidance {
  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("InboundGuidance")
  private InboundGuidance inboundGuidance = null;

  @SerializedName("GuidanceReasonList")
  private GuidanceReasonList guidanceReasonList = null;

  public ASINInboundGuidance ASIN(String ASIN) {
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return ASIN
  **/
  @ApiModelProperty(required = true, value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getASIN() {
    return ASIN;
  }

  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }

  public ASINInboundGuidance inboundGuidance(InboundGuidance inboundGuidance) {
    this.inboundGuidance = inboundGuidance;
    return this;
  }

   /**
   * Get inboundGuidance
   * @return inboundGuidance
  **/
  @ApiModelProperty(required = true, value = "")
  public InboundGuidance getInboundGuidance() {
    return inboundGuidance;
  }

  public void setInboundGuidance(InboundGuidance inboundGuidance) {
    this.inboundGuidance = inboundGuidance;
  }

  public ASINInboundGuidance guidanceReasonList(GuidanceReasonList guidanceReasonList) {
    this.guidanceReasonList = guidanceReasonList;
    return this;
  }

   /**
   * A list of reasons for the current inbound guidance for this item.
   * @return guidanceReasonList
  **/
  @ApiModelProperty(value = "A list of reasons for the current inbound guidance for this item.")
  public GuidanceReasonList getGuidanceReasonList() {
    return guidanceReasonList;
  }

  public void setGuidanceReasonList(GuidanceReasonList guidanceReasonList) {
    this.guidanceReasonList = guidanceReasonList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ASINInboundGuidance asINInboundGuidance = (ASINInboundGuidance) o;
    return Objects.equals(this.ASIN, asINInboundGuidance.ASIN) &&
        Objects.equals(this.inboundGuidance, asINInboundGuidance.inboundGuidance) &&
        Objects.equals(this.guidanceReasonList, asINInboundGuidance.guidanceReasonList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASIN, inboundGuidance, guidanceReasonList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ASINInboundGuidance {\n");
    
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    inboundGuidance: ").append(toIndentedString(inboundGuidance)).append("\n");
    sb.append("    guidanceReasonList: ").append(toIndentedString(guidanceReasonList)).append("\n");
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

