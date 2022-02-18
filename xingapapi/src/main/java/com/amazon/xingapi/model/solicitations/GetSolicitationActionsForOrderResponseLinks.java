/*
 * Selling Partner API for Solicitations
 * With the Solicitations API you can build applications that send non-critical solicitations to buyers. You can get a list of solicitation types that are available for an order that you specify, then call an operation that sends a solicitation to the buyer for that order. Buyers cannot respond to solicitations sent by this API, and these solicitations do not appear in the Messaging section of Seller Central or in the recipient's Message Center. The Solicitations API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.solicitations;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.solicitations.LinkObject;
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
 * GetSolicitationActionsForOrderResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:47.852+08:00")
public class GetSolicitationActionsForOrderResponseLinks {
  @SerializedName("self")
  private LinkObject self = null;

  @SerializedName("actions")
  private List<LinkObject> actions = new ArrayList<LinkObject>();

  public GetSolicitationActionsForOrderResponseLinks self(LinkObject self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(required = true, value = "")
  public LinkObject getSelf() {
    return self;
  }

  public void setSelf(LinkObject self) {
    this.self = self;
  }

  public GetSolicitationActionsForOrderResponseLinks actions(List<LinkObject> actions) {
    this.actions = actions;
    return this;
  }

  public GetSolicitationActionsForOrderResponseLinks addActionsItem(LinkObject actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Eligible actions for the specified amazonOrderId.
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "Eligible actions for the specified amazonOrderId.")
  public List<LinkObject> getActions() {
    return actions;
  }

  public void setActions(List<LinkObject> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSolicitationActionsForOrderResponseLinks getSolicitationActionsForOrderResponseLinks = (GetSolicitationActionsForOrderResponseLinks) o;
    return Objects.equals(this.self, getSolicitationActionsForOrderResponseLinks.self) &&
        Objects.equals(this.actions, getSolicitationActionsForOrderResponseLinks.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSolicitationActionsForOrderResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

