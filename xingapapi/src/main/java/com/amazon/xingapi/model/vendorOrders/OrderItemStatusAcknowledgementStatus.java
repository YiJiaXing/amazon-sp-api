/*
 * Selling Partner API for Retail Procurement Orders
 * The Selling Partner API for Retail Procurement Orders provides programmatic access to vendor orders data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.vendorOrders;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.vendorOrders.AcknowledgementStatusDetails;
import com.amazon.xingapi.model.vendorOrders.ItemQuantity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Acknowledgement status information.
 */
@ApiModel(description = "Acknowledgement status information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:45:12.914+08:00")
public class OrderItemStatusAcknowledgementStatus {
  /**
   * Confirmation status of line item.
   */
  @JsonAdapter(ConfirmationStatusEnum.Adapter.class)
  public enum ConfirmationStatusEnum {
    ACCEPTED("ACCEPTED"),
    
    PARTIALLY_ACCEPTED("PARTIALLY_ACCEPTED"),
    
    REJECTED("REJECTED"),
    
    UNCONFIRMED("UNCONFIRMED");

    private String value;

    ConfirmationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfirmationStatusEnum fromValue(String text) {
      for (ConfirmationStatusEnum b : ConfirmationStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConfirmationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfirmationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfirmationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConfirmationStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("confirmationStatus")
  private ConfirmationStatusEnum confirmationStatus = null;

  @SerializedName("acceptedQuantity")
  private ItemQuantity acceptedQuantity = null;

  @SerializedName("rejectedQuantity")
  private ItemQuantity rejectedQuantity = null;

  @SerializedName("acknowledgementStatusDetails")
  private List<AcknowledgementStatusDetails> acknowledgementStatusDetails = null;

  public OrderItemStatusAcknowledgementStatus confirmationStatus(ConfirmationStatusEnum confirmationStatus) {
    this.confirmationStatus = confirmationStatus;
    return this;
  }

   /**
   * Confirmation status of line item.
   * @return confirmationStatus
  **/
  @ApiModelProperty(value = "Confirmation status of line item.")
  public ConfirmationStatusEnum getConfirmationStatus() {
    return confirmationStatus;
  }

  public void setConfirmationStatus(ConfirmationStatusEnum confirmationStatus) {
    this.confirmationStatus = confirmationStatus;
  }

  public OrderItemStatusAcknowledgementStatus acceptedQuantity(ItemQuantity acceptedQuantity) {
    this.acceptedQuantity = acceptedQuantity;
    return this;
  }

   /**
   * Item quantities accepted by vendor to be shipped.
   * @return acceptedQuantity
  **/
  @ApiModelProperty(value = "Item quantities accepted by vendor to be shipped.")
  public ItemQuantity getAcceptedQuantity() {
    return acceptedQuantity;
  }

  public void setAcceptedQuantity(ItemQuantity acceptedQuantity) {
    this.acceptedQuantity = acceptedQuantity;
  }

  public OrderItemStatusAcknowledgementStatus rejectedQuantity(ItemQuantity rejectedQuantity) {
    this.rejectedQuantity = rejectedQuantity;
    return this;
  }

   /**
   * Item quantities rejected by vendor.
   * @return rejectedQuantity
  **/
  @ApiModelProperty(value = "Item quantities rejected by vendor.")
  public ItemQuantity getRejectedQuantity() {
    return rejectedQuantity;
  }

  public void setRejectedQuantity(ItemQuantity rejectedQuantity) {
    this.rejectedQuantity = rejectedQuantity;
  }

  public OrderItemStatusAcknowledgementStatus acknowledgementStatusDetails(List<AcknowledgementStatusDetails> acknowledgementStatusDetails) {
    this.acknowledgementStatusDetails = acknowledgementStatusDetails;
    return this;
  }

  public OrderItemStatusAcknowledgementStatus addAcknowledgementStatusDetailsItem(AcknowledgementStatusDetails acknowledgementStatusDetailsItem) {
    if (this.acknowledgementStatusDetails == null) {
      this.acknowledgementStatusDetails = new ArrayList<AcknowledgementStatusDetails>();
    }
    this.acknowledgementStatusDetails.add(acknowledgementStatusDetailsItem);
    return this;
  }

   /**
   * Details of item quantity confirmed.
   * @return acknowledgementStatusDetails
  **/
  @ApiModelProperty(value = "Details of item quantity confirmed.")
  public List<AcknowledgementStatusDetails> getAcknowledgementStatusDetails() {
    return acknowledgementStatusDetails;
  }

  public void setAcknowledgementStatusDetails(List<AcknowledgementStatusDetails> acknowledgementStatusDetails) {
    this.acknowledgementStatusDetails = acknowledgementStatusDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemStatusAcknowledgementStatus orderItemStatusAcknowledgementStatus = (OrderItemStatusAcknowledgementStatus) o;
    return Objects.equals(this.confirmationStatus, orderItemStatusAcknowledgementStatus.confirmationStatus) &&
        Objects.equals(this.acceptedQuantity, orderItemStatusAcknowledgementStatus.acceptedQuantity) &&
        Objects.equals(this.rejectedQuantity, orderItemStatusAcknowledgementStatus.rejectedQuantity) &&
        Objects.equals(this.acknowledgementStatusDetails, orderItemStatusAcknowledgementStatus.acknowledgementStatusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmationStatus, acceptedQuantity, rejectedQuantity, acknowledgementStatusDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemStatusAcknowledgementStatus {\n");
    
    sb.append("    confirmationStatus: ").append(toIndentedString(confirmationStatus)).append("\n");
    sb.append("    acceptedQuantity: ").append(toIndentedString(acceptedQuantity)).append("\n");
    sb.append("    rejectedQuantity: ").append(toIndentedString(rejectedQuantity)).append("\n");
    sb.append("    acknowledgementStatusDetails: ").append(toIndentedString(acknowledgementStatusDetails)).append("\n");
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

