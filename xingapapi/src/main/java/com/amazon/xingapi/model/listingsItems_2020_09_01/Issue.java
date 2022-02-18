/*
 * Selling Partner API for Listings Items
 * The Selling Partner API for Listings Items (Listings Items API) provides programmatic access to selling partner listings on Amazon. Use this API in collaboration with the Selling Partner API for Product Type Definitions, which you use to retrieve the information about Amazon product types needed to use the Listings Items API.  For more information, see the [Listing Items API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/listings-items-api-use-case-guide/listings-items-api-use-case-guide_2020-09-01.md).
 *
 * OpenAPI spec version: 2020-09-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.listingsItems_2020_09_01;

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
 * An issue with a listings item.
 */
@ApiModel(description = "An issue with a listings item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:12.301+08:00")
public class Issue {
  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  /**
   * The severity of the issue.
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    ERROR("ERROR"),
    
    WARNING("WARNING"),
    
    INFO("INFO");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SeverityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("severity")
  private SeverityEnum severity = null;

  @SerializedName("attributeName")
  private String attributeName = null;

  public Issue code(String code) {
    this.code = code;
    return this;
  }

   /**
   * An issue code that identifies the type of issue.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "An issue code that identifies the type of issue.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Issue message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A message that describes the issue.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "A message that describes the issue.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Issue severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

   /**
   * The severity of the issue.
   * @return severity
  **/
  @ApiModelProperty(required = true, value = "The severity of the issue.")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public Issue attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

   /**
   * Name of the attribute associated with the issue, if applicable.
   * @return attributeName
  **/
  @ApiModelProperty(value = "Name of the attribute associated with the issue, if applicable.")
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Issue issue = (Issue) o;
    return Objects.equals(this.code, issue.code) &&
        Objects.equals(this.message, issue.message) &&
        Objects.equals(this.severity, issue.severity) &&
        Objects.equals(this.attributeName, issue.attributeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, severity, attributeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issue {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
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

