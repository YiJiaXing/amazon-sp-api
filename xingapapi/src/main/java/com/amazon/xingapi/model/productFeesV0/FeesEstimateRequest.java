/*
 * Selling Partner API for Product Fees
 * The Selling Partner API for Product Fees lets you programmatically retrieve estimated fees for a product. You can then account for those fees in your pricing.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.productFeesV0;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.productFeesV0.OptionalFulfillmentProgram;
import com.amazon.xingapi.model.productFeesV0.PriceToEstimateFees;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FeesEstimateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:23.143+08:00")
public class FeesEstimateRequest {
  @SerializedName("MarketplaceId")
  private String marketplaceId = null;

  @SerializedName("IsAmazonFulfilled")
  private Boolean isAmazonFulfilled = null;

  @SerializedName("PriceToEstimateFees")
  private PriceToEstimateFees priceToEstimateFees = null;

  @SerializedName("Identifier")
  private String identifier = null;

  @SerializedName("OptionalFulfillmentProgram")
  private OptionalFulfillmentProgram optionalFulfillmentProgram = null;

  public FeesEstimateRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * A marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "A marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public FeesEstimateRequest isAmazonFulfilled(Boolean isAmazonFulfilled) {
    this.isAmazonFulfilled = isAmazonFulfilled;
    return this;
  }

   /**
   * When true, the offer is fulfilled by Amazon.
   * @return isAmazonFulfilled
  **/
  @ApiModelProperty(value = "When true, the offer is fulfilled by Amazon.")
  public Boolean isIsAmazonFulfilled() {
    return isAmazonFulfilled;
  }

  public void setIsAmazonFulfilled(Boolean isAmazonFulfilled) {
    this.isAmazonFulfilled = isAmazonFulfilled;
  }

  public FeesEstimateRequest priceToEstimateFees(PriceToEstimateFees priceToEstimateFees) {
    this.priceToEstimateFees = priceToEstimateFees;
    return this;
  }

   /**
   * The product price that the fee estimate is based on.
   * @return priceToEstimateFees
  **/
  @ApiModelProperty(required = true, value = "The product price that the fee estimate is based on.")
  public PriceToEstimateFees getPriceToEstimateFees() {
    return priceToEstimateFees;
  }

  public void setPriceToEstimateFees(PriceToEstimateFees priceToEstimateFees) {
    this.priceToEstimateFees = priceToEstimateFees;
  }

  public FeesEstimateRequest identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * A unique identifier provided by the caller to track this request.
   * @return identifier
  **/
  @ApiModelProperty(required = true, value = "A unique identifier provided by the caller to track this request.")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public FeesEstimateRequest optionalFulfillmentProgram(OptionalFulfillmentProgram optionalFulfillmentProgram) {
    this.optionalFulfillmentProgram = optionalFulfillmentProgram;
    return this;
  }

   /**
   * Get optionalFulfillmentProgram
   * @return optionalFulfillmentProgram
  **/
  @ApiModelProperty(value = "")
  public OptionalFulfillmentProgram getOptionalFulfillmentProgram() {
    return optionalFulfillmentProgram;
  }

  public void setOptionalFulfillmentProgram(OptionalFulfillmentProgram optionalFulfillmentProgram) {
    this.optionalFulfillmentProgram = optionalFulfillmentProgram;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeesEstimateRequest feesEstimateRequest = (FeesEstimateRequest) o;
    return Objects.equals(this.marketplaceId, feesEstimateRequest.marketplaceId) &&
        Objects.equals(this.isAmazonFulfilled, feesEstimateRequest.isAmazonFulfilled) &&
        Objects.equals(this.priceToEstimateFees, feesEstimateRequest.priceToEstimateFees) &&
        Objects.equals(this.identifier, feesEstimateRequest.identifier) &&
        Objects.equals(this.optionalFulfillmentProgram, feesEstimateRequest.optionalFulfillmentProgram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, isAmazonFulfilled, priceToEstimateFees, identifier, optionalFulfillmentProgram);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeesEstimateRequest {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    isAmazonFulfilled: ").append(toIndentedString(isAmazonFulfilled)).append("\n");
    sb.append("    priceToEstimateFees: ").append(toIndentedString(priceToEstimateFees)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    optionalFulfillmentProgram: ").append(toIndentedString(optionalFulfillmentProgram)).append("\n");
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

