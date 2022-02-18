/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.notifications;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.notifications.EventBridgeResourceSpecification;
import com.amazon.xingapi.model.notifications.SqsResource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The information required to create a destination resource. Applications should use one resource type (sqs or eventBridge) per destination.
 */
@ApiModel(description = "The information required to create a destination resource. Applications should use one resource type (sqs or eventBridge) per destination.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:19.921+08:00")
public class DestinationResourceSpecification {
  @SerializedName("sqs")
  private SqsResource sqs = null;

  @SerializedName("eventBridge")
  private EventBridgeResourceSpecification eventBridge = null;

  public DestinationResourceSpecification sqs(SqsResource sqs) {
    this.sqs = sqs;
    return this;
  }

   /**
   * The information required to create an Amazon Simple Queue Service (SQS) queue destination.
   * @return sqs
  **/
  @ApiModelProperty(value = "The information required to create an Amazon Simple Queue Service (SQS) queue destination.")
  public SqsResource getSqs() {
    return sqs;
  }

  public void setSqs(SqsResource sqs) {
    this.sqs = sqs;
  }

  public DestinationResourceSpecification eventBridge(EventBridgeResourceSpecification eventBridge) {
    this.eventBridge = eventBridge;
    return this;
  }

   /**
   * The information required to create an Amazon EventBridge destination.
   * @return eventBridge
  **/
  @ApiModelProperty(value = "The information required to create an Amazon EventBridge destination.")
  public EventBridgeResourceSpecification getEventBridge() {
    return eventBridge;
  }

  public void setEventBridge(EventBridgeResourceSpecification eventBridge) {
    this.eventBridge = eventBridge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationResourceSpecification destinationResourceSpecification = (DestinationResourceSpecification) o;
    return Objects.equals(this.sqs, destinationResourceSpecification.sqs) &&
        Objects.equals(this.eventBridge, destinationResourceSpecification.eventBridge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sqs, eventBridge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationResourceSpecification {\n");
    
    sb.append("    sqs: ").append(toIndentedString(sqs)).append("\n");
    sb.append("    eventBridge: ").append(toIndentedString(eventBridge)).append("\n");
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

