/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, see the [Catalog Items API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/catalog-items-api-use-case-guide/catalog-items-api-use-case-guide_2020-12-01.md).
 *
 * OpenAPI spec version: 2020-12-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.catalogItems_2020_12_01;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.catalogItems_2020_12_01.BrandRefinement;
import com.amazon.xingapi.model.catalogItems_2020_12_01.ClassificationRefinement;
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
 * Search refinements.
 */
@ApiModel(description = "Search refinements.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:43:59.305+08:00")
public class Refinements {
  @SerializedName("brands")
  private List<BrandRefinement> brands = new ArrayList<BrandRefinement>();

  @SerializedName("classifications")
  private List<ClassificationRefinement> classifications = new ArrayList<ClassificationRefinement>();

  public Refinements brands(List<BrandRefinement> brands) {
    this.brands = brands;
    return this;
  }

  public Refinements addBrandsItem(BrandRefinement brandsItem) {
    this.brands.add(brandsItem);
    return this;
  }

   /**
   * Brand search refinements.
   * @return brands
  **/
  @ApiModelProperty(required = true, value = "Brand search refinements.")
  public List<BrandRefinement> getBrands() {
    return brands;
  }

  public void setBrands(List<BrandRefinement> brands) {
    this.brands = brands;
  }

  public Refinements classifications(List<ClassificationRefinement> classifications) {
    this.classifications = classifications;
    return this;
  }

  public Refinements addClassificationsItem(ClassificationRefinement classificationsItem) {
    this.classifications.add(classificationsItem);
    return this;
  }

   /**
   * Classification search refinements.
   * @return classifications
  **/
  @ApiModelProperty(required = true, value = "Classification search refinements.")
  public List<ClassificationRefinement> getClassifications() {
    return classifications;
  }

  public void setClassifications(List<ClassificationRefinement> classifications) {
    this.classifications = classifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Refinements refinements = (Refinements) o;
    return Objects.equals(this.brands, refinements.brands) &&
        Objects.equals(this.classifications, refinements.classifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brands, classifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Refinements {\n");
    
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
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

