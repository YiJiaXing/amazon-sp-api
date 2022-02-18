/*
 * Selling Partner API for Retail Procurement Payments
 * The Selling Partner API for Retail Procurement Payments provides programmatic access to vendors payments data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.vendorInvoices;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.vendorInvoices.Address;
import com.amazon.xingapi.model.vendorInvoices.TaxRegistrationDetails;
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
 * PartyIdentification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:45:04.449+08:00")
public class PartyIdentification {
  @SerializedName("partyId")
  private String partyId = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("taxRegistrationDetails")
  private List<TaxRegistrationDetails> taxRegistrationDetails = null;

  public PartyIdentification partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

   /**
   * Assigned identification for the party.
   * @return partyId
  **/
  @ApiModelProperty(required = true, value = "Assigned identification for the party.")
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public PartyIdentification address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Identification of the party by address.
   * @return address
  **/
  @ApiModelProperty(value = "Identification of the party by address.")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public PartyIdentification taxRegistrationDetails(List<TaxRegistrationDetails> taxRegistrationDetails) {
    this.taxRegistrationDetails = taxRegistrationDetails;
    return this;
  }

  public PartyIdentification addTaxRegistrationDetailsItem(TaxRegistrationDetails taxRegistrationDetailsItem) {
    if (this.taxRegistrationDetails == null) {
      this.taxRegistrationDetails = new ArrayList<TaxRegistrationDetails>();
    }
    this.taxRegistrationDetails.add(taxRegistrationDetailsItem);
    return this;
  }

   /**
   * Tax registration details of the party.
   * @return taxRegistrationDetails
  **/
  @ApiModelProperty(value = "Tax registration details of the party.")
  public List<TaxRegistrationDetails> getTaxRegistrationDetails() {
    return taxRegistrationDetails;
  }

  public void setTaxRegistrationDetails(List<TaxRegistrationDetails> taxRegistrationDetails) {
    this.taxRegistrationDetails = taxRegistrationDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyIdentification partyIdentification = (PartyIdentification) o;
    return Objects.equals(this.partyId, partyIdentification.partyId) &&
        Objects.equals(this.address, partyIdentification.address) &&
        Objects.equals(this.taxRegistrationDetails, partyIdentification.taxRegistrationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, address, taxRegistrationDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyIdentification {\n");
    
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxRegistrationDetails: ").append(toIndentedString(taxRegistrationDetails)).append("\n");
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

