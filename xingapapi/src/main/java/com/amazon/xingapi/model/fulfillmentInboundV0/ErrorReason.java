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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The reason that the ASIN is invalid.
 */
@JsonAdapter(ErrorReason.Adapter.class)
public enum ErrorReason {
  
  DOESNOTEXIST("DoesNotExist"),
  
  INVALIDASIN("InvalidASIN");

  private String value;

  ErrorReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ErrorReason fromValue(String text) {
    for (ErrorReason b : ErrorReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ErrorReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final ErrorReason enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ErrorReason read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ErrorReason.fromValue(String.valueOf(value));
    }
  }
}

