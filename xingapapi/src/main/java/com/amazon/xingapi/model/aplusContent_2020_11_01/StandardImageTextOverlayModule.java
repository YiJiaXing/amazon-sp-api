/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.aplusContent_2020_11_01;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.aplusContent_2020_11_01.ColorType;
import com.amazon.xingapi.model.aplusContent_2020_11_01.StandardImageTextBlock;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A standard background image with a floating text box.
 */
@ApiModel(description = "A standard background image with a floating text box.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:43:54.957+08:00")
public class StandardImageTextOverlayModule {
  @SerializedName("overlayColorType")
  private ColorType overlayColorType = null;

  @SerializedName("block")
  private StandardImageTextBlock block = null;

  public StandardImageTextOverlayModule overlayColorType(ColorType overlayColorType) {
    this.overlayColorType = overlayColorType;
    return this;
  }

   /**
   * Get overlayColorType
   * @return overlayColorType
  **/
  @ApiModelProperty(required = true, value = "")
  public ColorType getOverlayColorType() {
    return overlayColorType;
  }

  public void setOverlayColorType(ColorType overlayColorType) {
    this.overlayColorType = overlayColorType;
  }

  public StandardImageTextOverlayModule block(StandardImageTextBlock block) {
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/
  @ApiModelProperty(value = "")
  public StandardImageTextBlock getBlock() {
    return block;
  }

  public void setBlock(StandardImageTextBlock block) {
    this.block = block;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardImageTextOverlayModule standardImageTextOverlayModule = (StandardImageTextOverlayModule) o;
    return Objects.equals(this.overlayColorType, standardImageTextOverlayModule.overlayColorType) &&
        Objects.equals(this.block, standardImageTextOverlayModule.block);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overlayColorType, block);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardImageTextOverlayModule {\n");
    
    sb.append("    overlayColorType: ").append(toIndentedString(overlayColorType)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

