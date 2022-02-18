/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.vendorShipments;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.vendorShipments.Location;
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
 * Contractual or operational port or point relevant to the movement of the cargo.
 */
@ApiModel(description = "Contractual or operational port or point relevant to the movement of the cargo.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:45:21.236+08:00")
public class Stop {
  /**
   * Provide the function code.
   */
  @JsonAdapter(FunctionCodeEnum.Adapter.class)
  public enum FunctionCodeEnum {
    PORTOFDISCHARGE("PortOfDischarge"),
    
    FREIGHTPAYABLEAT("FreightPayableAt"),
    
    PORTOFLOADING("PortOfLoading");

    private String value;

    FunctionCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FunctionCodeEnum fromValue(String text) {
      for (FunctionCodeEnum b : FunctionCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FunctionCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FunctionCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FunctionCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FunctionCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("functionCode")
  private FunctionCodeEnum functionCode = null;

  @SerializedName("locationIdentification")
  private Location locationIdentification = null;

  @SerializedName("arrivalTime")
  private OffsetDateTime arrivalTime = null;

  @SerializedName("departureTime")
  private OffsetDateTime departureTime = null;

  public Stop functionCode(FunctionCodeEnum functionCode) {
    this.functionCode = functionCode;
    return this;
  }

   /**
   * Provide the function code.
   * @return functionCode
  **/
  @ApiModelProperty(required = true, value = "Provide the function code.")
  public FunctionCodeEnum getFunctionCode() {
    return functionCode;
  }

  public void setFunctionCode(FunctionCodeEnum functionCode) {
    this.functionCode = functionCode;
  }

  public Stop locationIdentification(Location locationIdentification) {
    this.locationIdentification = locationIdentification;
    return this;
  }

   /**
   * Get locationIdentification
   * @return locationIdentification
  **/
  @ApiModelProperty(value = "")
  public Location getLocationIdentification() {
    return locationIdentification;
  }

  public void setLocationIdentification(Location locationIdentification) {
    this.locationIdentification = locationIdentification;
  }

  public Stop arrivalTime(OffsetDateTime arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

   /**
   * Date and time of the arrival of the cargo.
   * @return arrivalTime
  **/
  @ApiModelProperty(value = "Date and time of the arrival of the cargo.")
  public OffsetDateTime getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(OffsetDateTime arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public Stop departureTime(OffsetDateTime departureTime) {
    this.departureTime = departureTime;
    return this;
  }

   /**
   * Date and time of the departure of the cargo.
   * @return departureTime
  **/
  @ApiModelProperty(value = "Date and time of the departure of the cargo.")
  public OffsetDateTime getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(OffsetDateTime departureTime) {
    this.departureTime = departureTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stop stop = (Stop) o;
    return Objects.equals(this.functionCode, stop.functionCode) &&
        Objects.equals(this.locationIdentification, stop.locationIdentification) &&
        Objects.equals(this.arrivalTime, stop.arrivalTime) &&
        Objects.equals(this.departureTime, stop.departureTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionCode, locationIdentification, arrivalTime, departureTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stop {\n");
    
    sb.append("    functionCode: ").append(toIndentedString(functionCode)).append("\n");
    sb.append("    locationIdentification: ").append(toIndentedString(locationIdentification)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
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

