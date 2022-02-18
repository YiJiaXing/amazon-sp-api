/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.services;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.services.ErrorList;
import com.amazon.xingapi.model.services.WarningList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response schema for add or reschedule appointment operation.
 */
@ApiModel(description = "Response schema for add or reschedule appointment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:39.169+08:00")
public class SetAppointmentResponse {
  @SerializedName("appointmentId")
  private String appointmentId = null;

  @SerializedName("warnings")
  private WarningList warnings = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public SetAppointmentResponse appointmentId(String appointmentId) {
    this.appointmentId = appointmentId;
    return this;
  }

   /**
   * New appointment id generated during add or reschedule appointment operation.
   * @return appointmentId
  **/
  @ApiModelProperty(value = "New appointment id generated during add or reschedule appointment operation.")
  public String getAppointmentId() {
    return appointmentId;
  }

  public void setAppointmentId(String appointmentId) {
    this.appointmentId = appointmentId;
  }

  public SetAppointmentResponse warnings(WarningList warnings) {
    this.warnings = warnings;
    return this;
  }

   /**
   * Warnings generated during add or reschedule appointment operation.
   * @return warnings
  **/
  @ApiModelProperty(value = "Warnings generated during add or reschedule appointment operation.")
  public WarningList getWarnings() {
    return warnings;
  }

  public void setWarnings(WarningList warnings) {
    this.warnings = warnings;
  }

  public SetAppointmentResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Errors occurred during during add or reschedule appointment operation.
   * @return errors
  **/
  @ApiModelProperty(value = "Errors occurred during during add or reschedule appointment operation.")
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
    SetAppointmentResponse setAppointmentResponse = (SetAppointmentResponse) o;
    return Objects.equals(this.appointmentId, setAppointmentResponse.appointmentId) &&
        Objects.equals(this.warnings, setAppointmentResponse.warnings) &&
        Objects.equals(this.errors, setAppointmentResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentId, warnings, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetAppointmentResponse {\n");
    
    sb.append("    appointmentId: ").append(toIndentedString(appointmentId)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
