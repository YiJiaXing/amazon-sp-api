/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items helps you programmatically retrieve item details for items in the catalog.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.catalogItemsV0;

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

/**
 * Categories
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:43:57.900+08:00")
public class Categories {
  @SerializedName("ProductCategoryId")
  private String productCategoryId = null;

  @SerializedName("ProductCategoryName")
  private String productCategoryName = null;

  @SerializedName("parent")
  private Object parent = null;

  public Categories productCategoryId(String productCategoryId) {
    this.productCategoryId = productCategoryId;
    return this;
  }

   /**
   * The identifier for the product category (or browse node).
   * @return productCategoryId
  **/
  @ApiModelProperty(value = "The identifier for the product category (or browse node).")
  public String getProductCategoryId() {
    return productCategoryId;
  }

  public void setProductCategoryId(String productCategoryId) {
    this.productCategoryId = productCategoryId;
  }

  public Categories productCategoryName(String productCategoryName) {
    this.productCategoryName = productCategoryName;
    return this;
  }

   /**
   * The name of the product category (or browse node).
   * @return productCategoryName
  **/
  @ApiModelProperty(value = "The name of the product category (or browse node).")
  public String getProductCategoryName() {
    return productCategoryName;
  }

  public void setProductCategoryName(String productCategoryName) {
    this.productCategoryName = productCategoryName;
  }

  public Categories parent(Object parent) {
    this.parent = parent;
    return this;
  }

   /**
   * The parent product category.
   * @return parent
  **/
  @ApiModelProperty(value = "The parent product category.")
  public Object getParent() {
    return parent;
  }

  public void setParent(Object parent) {
    this.parent = parent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Categories categories = (Categories) o;
    return Objects.equals(this.productCategoryId, categories.productCategoryId) &&
        Objects.equals(this.productCategoryName, categories.productCategoryName) &&
        Objects.equals(this.parent, categories.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCategoryId, productCategoryName, parent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Categories {\n");
    
    sb.append("    productCategoryId: ").append(toIndentedString(productCategoryId)).append("\n");
    sb.append("    productCategoryName: ").append(toIndentedString(productCategoryName)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

