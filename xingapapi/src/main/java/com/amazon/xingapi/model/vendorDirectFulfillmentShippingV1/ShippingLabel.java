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
import com.amazon.xingapi.model.vendorDirectFulfillmentShippingV1.LabelData;
import com.amazon.xingapi.model.vendorDirectFulfillmentShippingV1.PartyIdentification;
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
 * ShippingLabel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:45:00.794+08:00")
public class ShippingLabel {
  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("sellingParty")
  private PartyIdentification sellingParty = null;

  @SerializedName("shipFromParty")
  private PartyIdentification shipFromParty = null;

  /**
   * Format of the label.
   */
  @JsonAdapter(LabelFormatEnum.Adapter.class)
  public enum LabelFormatEnum {
    PNG("PNG"),
    
    ZPL("ZPL");

    private String value;

    LabelFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LabelFormatEnum fromValue(String text) {
      for (LabelFormatEnum b : LabelFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LabelFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LabelFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LabelFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LabelFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("labelFormat")
  private LabelFormatEnum labelFormat = null;

  @SerializedName("labelData")
  private List<LabelData> labelData = new ArrayList<LabelData>();

  public ShippingLabel purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * This field will contain the Purchase Order Number for this order.
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(required = true, value = "This field will contain the Purchase Order Number for this order.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public ShippingLabel sellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
    return this;
  }

   /**
   * ID of the selling party or vendor.
   * @return sellingParty
  **/
  @ApiModelProperty(required = true, value = "ID of the selling party or vendor.")
  public PartyIdentification getSellingParty() {
    return sellingParty;
  }

  public void setSellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
  }

  public ShippingLabel shipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
    return this;
  }

   /**
   * Warehouse code of vendor.
   * @return shipFromParty
  **/
  @ApiModelProperty(required = true, value = "Warehouse code of vendor.")
  public PartyIdentification getShipFromParty() {
    return shipFromParty;
  }

  public void setShipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
  }

  public ShippingLabel labelFormat(LabelFormatEnum labelFormat) {
    this.labelFormat = labelFormat;
    return this;
  }

   /**
   * Format of the label.
   * @return labelFormat
  **/
  @ApiModelProperty(required = true, value = "Format of the label.")
  public LabelFormatEnum getLabelFormat() {
    return labelFormat;
  }

  public void setLabelFormat(LabelFormatEnum labelFormat) {
    this.labelFormat = labelFormat;
  }

  public ShippingLabel labelData(List<LabelData> labelData) {
    this.labelData = labelData;
    return this;
  }

  public ShippingLabel addLabelDataItem(LabelData labelDataItem) {
    this.labelData.add(labelDataItem);
    return this;
  }

   /**
   * Provides the details of the packages in this shipment.
   * @return labelData
  **/
  @ApiModelProperty(required = true, value = "Provides the details of the packages in this shipment.")
  public List<LabelData> getLabelData() {
    return labelData;
  }

  public void setLabelData(List<LabelData> labelData) {
    this.labelData = labelData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingLabel shippingLabel = (ShippingLabel) o;
    return Objects.equals(this.purchaseOrderNumber, shippingLabel.purchaseOrderNumber) &&
        Objects.equals(this.sellingParty, shippingLabel.sellingParty) &&
        Objects.equals(this.shipFromParty, shippingLabel.shipFromParty) &&
        Objects.equals(this.labelFormat, shippingLabel.labelFormat) &&
        Objects.equals(this.labelData, shippingLabel.labelData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderNumber, sellingParty, shipFromParty, labelFormat, labelData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingLabel {\n");
    
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    sellingParty: ").append(toIndentedString(sellingParty)).append("\n");
    sb.append("    shipFromParty: ").append(toIndentedString(shipFromParty)).append("\n");
    sb.append("    labelFormat: ").append(toIndentedString(labelFormat)).append("\n");
    sb.append("    labelData: ").append(toIndentedString(labelData)).append("\n");
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

