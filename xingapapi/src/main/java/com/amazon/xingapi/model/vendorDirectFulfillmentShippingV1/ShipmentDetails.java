/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.vendorDirectFulfillmentShippingV1;

import java.util.Objects;
import java.util.Arrays;
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
 * Details about a shipment.
 */
@ApiModel(description = "Details about a shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:45:00.794+08:00")
public class ShipmentDetails {
  @SerializedName("shippedDate")
  private OffsetDateTime shippedDate = null;

  /**
   * Indicate the shipment status.
   */
  @JsonAdapter(ShipmentStatusEnum.Adapter.class)
  public enum ShipmentStatusEnum {
    SHIPPED("SHIPPED"),
    
    FLOOR_DENIAL("FLOOR_DENIAL");

    private String value;

    ShipmentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShipmentStatusEnum fromValue(String text) {
      for (ShipmentStatusEnum b : ShipmentStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ShipmentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShipmentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShipmentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ShipmentStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("shipmentStatus")
  private ShipmentStatusEnum shipmentStatus = null;

  @SerializedName("isPriorityShipment")
  private Boolean isPriorityShipment = null;

  @SerializedName("vendorOrderNumber")
  private String vendorOrderNumber = null;

  @SerializedName("estimatedDeliveryDate")
  private OffsetDateTime estimatedDeliveryDate = null;

  public ShipmentDetails shippedDate(OffsetDateTime shippedDate) {
    this.shippedDate = shippedDate;
    return this;
  }

   /**
   * This field indicates the date of the departure of the shipment from vendor&#39;s location. Vendors are requested to send ASNs within 30 minutes of departure from their warehouse/distribution center or at least 6 hours prior to the appointment time at the Amazon destination warehouse, whichever is sooner. Shipped date mentioned in the Shipment Confirmation should not be in the future.
   * @return shippedDate
  **/
  @ApiModelProperty(required = true, value = "This field indicates the date of the departure of the shipment from vendor's location. Vendors are requested to send ASNs within 30 minutes of departure from their warehouse/distribution center or at least 6 hours prior to the appointment time at the Amazon destination warehouse, whichever is sooner. Shipped date mentioned in the Shipment Confirmation should not be in the future.")
  public OffsetDateTime getShippedDate() {
    return shippedDate;
  }

  public void setShippedDate(OffsetDateTime shippedDate) {
    this.shippedDate = shippedDate;
  }

  public ShipmentDetails shipmentStatus(ShipmentStatusEnum shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
    return this;
  }

   /**
   * Indicate the shipment status.
   * @return shipmentStatus
  **/
  @ApiModelProperty(required = true, value = "Indicate the shipment status.")
  public ShipmentStatusEnum getShipmentStatus() {
    return shipmentStatus;
  }

  public void setShipmentStatus(ShipmentStatusEnum shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }

  public ShipmentDetails isPriorityShipment(Boolean isPriorityShipment) {
    this.isPriorityShipment = isPriorityShipment;
    return this;
  }

   /**
   * Provide the priority of the shipment.
   * @return isPriorityShipment
  **/
  @ApiModelProperty(value = "Provide the priority of the shipment.")
  public Boolean isIsPriorityShipment() {
    return isPriorityShipment;
  }

  public void setIsPriorityShipment(Boolean isPriorityShipment) {
    this.isPriorityShipment = isPriorityShipment;
  }

  public ShipmentDetails vendorOrderNumber(String vendorOrderNumber) {
    this.vendorOrderNumber = vendorOrderNumber;
    return this;
  }

   /**
   * The vendor order number is a unique identifier generated by a vendor for their reference.
   * @return vendorOrderNumber
  **/
  @ApiModelProperty(value = "The vendor order number is a unique identifier generated by a vendor for their reference.")
  public String getVendorOrderNumber() {
    return vendorOrderNumber;
  }

  public void setVendorOrderNumber(String vendorOrderNumber) {
    this.vendorOrderNumber = vendorOrderNumber;
  }

  public ShipmentDetails estimatedDeliveryDate(OffsetDateTime estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
    return this;
  }

   /**
   * Date on which the shipment is expected to reach the buyer&#39;s warehouse. It needs to be an estimate based on the average transit time between the ship-from location and the destination. The exact appointment time will be provided by buyer and is potentially not known when creating the shipment confirmation.
   * @return estimatedDeliveryDate
  **/
  @ApiModelProperty(value = "Date on which the shipment is expected to reach the buyer's warehouse. It needs to be an estimate based on the average transit time between the ship-from location and the destination. The exact appointment time will be provided by buyer and is potentially not known when creating the shipment confirmation.")
  public OffsetDateTime getEstimatedDeliveryDate() {
    return estimatedDeliveryDate;
  }

  public void setEstimatedDeliveryDate(OffsetDateTime estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentDetails shipmentDetails = (ShipmentDetails) o;
    return Objects.equals(this.shippedDate, shipmentDetails.shippedDate) &&
        Objects.equals(this.shipmentStatus, shipmentDetails.shipmentStatus) &&
        Objects.equals(this.isPriorityShipment, shipmentDetails.isPriorityShipment) &&
        Objects.equals(this.vendorOrderNumber, shipmentDetails.vendorOrderNumber) &&
        Objects.equals(this.estimatedDeliveryDate, shipmentDetails.estimatedDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippedDate, shipmentStatus, isPriorityShipment, vendorOrderNumber, estimatedDeliveryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentDetails {\n");
    
    sb.append("    shippedDate: ").append(toIndentedString(shippedDate)).append("\n");
    sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
    sb.append("    isPriorityShipment: ").append(toIndentedString(isPriorityShipment)).append("\n");
    sb.append("    vendorOrderNumber: ").append(toIndentedString(vendorOrderNumber)).append("\n");
    sb.append("    estimatedDeliveryDate: ").append(toIndentedString(estimatedDeliveryDate)).append("\n");
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

