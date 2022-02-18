/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.financesV0;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.financesV0.Currency;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A fee associated with the event.
 */
@ApiModel(description = "A fee associated with the event.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:06.882+08:00")
public class FeeComponent {
  @SerializedName("FeeType")
  private String feeType = null;

  @SerializedName("FeeAmount")
  private Currency feeAmount = null;

  public FeeComponent feeType(String feeType) {
    this.feeType = feeType;
    return this;
  }

   /**
   * The type of fee. For more information about Selling on Amazon fees, see [Selling on Amazon Fee Schedule](https://sellercentral.amazon.com/gp/help/200336920) on Seller Central. For more information about Fulfillment by Amazon fees, see [FBA features, services and fees](https://sellercentral.amazon.com/gp/help/201074400) on Seller Central.
   * @return feeType
  **/
  @ApiModelProperty(value = "The type of fee. For more information about Selling on Amazon fees, see [Selling on Amazon Fee Schedule](https://sellercentral.amazon.com/gp/help/200336920) on Seller Central. For more information about Fulfillment by Amazon fees, see [FBA features, services and fees](https://sellercentral.amazon.com/gp/help/201074400) on Seller Central.")
  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  public FeeComponent feeAmount(Currency feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * The amount of the fee.
   * @return feeAmount
  **/
  @ApiModelProperty(value = "The amount of the fee.")
  public Currency getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(Currency feeAmount) {
    this.feeAmount = feeAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeComponent feeComponent = (FeeComponent) o;
    return Objects.equals(this.feeType, feeComponent.feeType) &&
        Objects.equals(this.feeAmount, feeComponent.feeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, feeAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeComponent {\n");
    
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
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
