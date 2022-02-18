/*
 * Selling Partner API for Reports
 * The Selling Partner API for Reports lets you retrieve and manage a variety of reports that can help selling partners manage their businesses.
 *
 * OpenAPI spec version: 2020-09-04
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.reports_2020_09_04;

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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Report
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:28.054+08:00")
public class Report {
  @SerializedName("marketplaceIds")
  private List<String> marketplaceIds = null;

  @SerializedName("reportId")
  private String reportId = null;

  @SerializedName("reportType")
  private String reportType = null;

  @SerializedName("dataStartTime")
  private OffsetDateTime dataStartTime = null;

  @SerializedName("dataEndTime")
  private OffsetDateTime dataEndTime = null;

  @SerializedName("reportScheduleId")
  private String reportScheduleId = null;

  @SerializedName("createdTime")
  private OffsetDateTime createdTime = null;

  /**
   * The processing status of the report.
   */
  @JsonAdapter(ProcessingStatusEnum.Adapter.class)
  public enum ProcessingStatusEnum {
    CANCELLED("CANCELLED"),
    
    DONE("DONE"),
    
    FATAL("FATAL"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    IN_QUEUE("IN_QUEUE");

    private String value;

    ProcessingStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProcessingStatusEnum fromValue(String text) {
      for (ProcessingStatusEnum b : ProcessingStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProcessingStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProcessingStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProcessingStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProcessingStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("processingStatus")
  private ProcessingStatusEnum processingStatus = null;

  @SerializedName("processingStartTime")
  private OffsetDateTime processingStartTime = null;

  @SerializedName("processingEndTime")
  private OffsetDateTime processingEndTime = null;

  @SerializedName("reportDocumentId")
  private String reportDocumentId = null;

  public Report marketplaceIds(List<String> marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
    return this;
  }

  public Report addMarketplaceIdsItem(String marketplaceIdsItem) {
    if (this.marketplaceIds == null) {
      this.marketplaceIds = new ArrayList<String>();
    }
    this.marketplaceIds.add(marketplaceIdsItem);
    return this;
  }

   /**
   * A list of marketplace identifiers for the report.
   * @return marketplaceIds
  **/
  @ApiModelProperty(value = "A list of marketplace identifiers for the report.")
  public List<String> getMarketplaceIds() {
    return marketplaceIds;
  }

  public void setMarketplaceIds(List<String> marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
  }

  public Report reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * The identifier for the report. This identifier is unique only in combination with a seller ID.
   * @return reportId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the report. This identifier is unique only in combination with a seller ID.")
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public Report reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * The report type.
   * @return reportType
  **/
  @ApiModelProperty(required = true, value = "The report type.")
  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public Report dataStartTime(OffsetDateTime dataStartTime) {
    this.dataStartTime = dataStartTime;
    return this;
  }

   /**
   * The start of a date and time range used for selecting the data to report.
   * @return dataStartTime
  **/
  @ApiModelProperty(value = "The start of a date and time range used for selecting the data to report.")
  public OffsetDateTime getDataStartTime() {
    return dataStartTime;
  }

  public void setDataStartTime(OffsetDateTime dataStartTime) {
    this.dataStartTime = dataStartTime;
  }

  public Report dataEndTime(OffsetDateTime dataEndTime) {
    this.dataEndTime = dataEndTime;
    return this;
  }

   /**
   * The end of a date and time range used for selecting the data to report.
   * @return dataEndTime
  **/
  @ApiModelProperty(value = "The end of a date and time range used for selecting the data to report.")
  public OffsetDateTime getDataEndTime() {
    return dataEndTime;
  }

  public void setDataEndTime(OffsetDateTime dataEndTime) {
    this.dataEndTime = dataEndTime;
  }

  public Report reportScheduleId(String reportScheduleId) {
    this.reportScheduleId = reportScheduleId;
    return this;
  }

   /**
   * The identifier of the report schedule that created this report (if any). This identifier is unique only in combination with a seller ID.
   * @return reportScheduleId
  **/
  @ApiModelProperty(value = "The identifier of the report schedule that created this report (if any). This identifier is unique only in combination with a seller ID.")
  public String getReportScheduleId() {
    return reportScheduleId;
  }

  public void setReportScheduleId(String reportScheduleId) {
    this.reportScheduleId = reportScheduleId;
  }

  public Report createdTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * The date and time when the report was created.
   * @return createdTime
  **/
  @ApiModelProperty(required = true, value = "The date and time when the report was created.")
  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public Report processingStatus(ProcessingStatusEnum processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

   /**
   * The processing status of the report.
   * @return processingStatus
  **/
  @ApiModelProperty(required = true, value = "The processing status of the report.")
  public ProcessingStatusEnum getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(ProcessingStatusEnum processingStatus) {
    this.processingStatus = processingStatus;
  }

  public Report processingStartTime(OffsetDateTime processingStartTime) {
    this.processingStartTime = processingStartTime;
    return this;
  }

   /**
   * The date and time when the report processing started, in ISO 8601 date time format.
   * @return processingStartTime
  **/
  @ApiModelProperty(value = "The date and time when the report processing started, in ISO 8601 date time format.")
  public OffsetDateTime getProcessingStartTime() {
    return processingStartTime;
  }

  public void setProcessingStartTime(OffsetDateTime processingStartTime) {
    this.processingStartTime = processingStartTime;
  }

  public Report processingEndTime(OffsetDateTime processingEndTime) {
    this.processingEndTime = processingEndTime;
    return this;
  }

   /**
   * The date and time when the report processing completed, in ISO 8601 date time format.
   * @return processingEndTime
  **/
  @ApiModelProperty(value = "The date and time when the report processing completed, in ISO 8601 date time format.")
  public OffsetDateTime getProcessingEndTime() {
    return processingEndTime;
  }

  public void setProcessingEndTime(OffsetDateTime processingEndTime) {
    this.processingEndTime = processingEndTime;
  }

  public Report reportDocumentId(String reportDocumentId) {
    this.reportDocumentId = reportDocumentId;
    return this;
  }

   /**
   * The identifier for the report document. Pass this into the getReportDocument operation to get the information you will need to retrieve and decrypt the report document&#39;s contents.
   * @return reportDocumentId
  **/
  @ApiModelProperty(value = "The identifier for the report document. Pass this into the getReportDocument operation to get the information you will need to retrieve and decrypt the report document's contents.")
  public String getReportDocumentId() {
    return reportDocumentId;
  }

  public void setReportDocumentId(String reportDocumentId) {
    this.reportDocumentId = reportDocumentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.marketplaceIds, report.marketplaceIds) &&
        Objects.equals(this.reportId, report.reportId) &&
        Objects.equals(this.reportType, report.reportType) &&
        Objects.equals(this.dataStartTime, report.dataStartTime) &&
        Objects.equals(this.dataEndTime, report.dataEndTime) &&
        Objects.equals(this.reportScheduleId, report.reportScheduleId) &&
        Objects.equals(this.createdTime, report.createdTime) &&
        Objects.equals(this.processingStatus, report.processingStatus) &&
        Objects.equals(this.processingStartTime, report.processingStartTime) &&
        Objects.equals(this.processingEndTime, report.processingEndTime) &&
        Objects.equals(this.reportDocumentId, report.reportDocumentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceIds, reportId, reportType, dataStartTime, dataEndTime, reportScheduleId, createdTime, processingStatus, processingStartTime, processingEndTime, reportDocumentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    
    sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    dataStartTime: ").append(toIndentedString(dataStartTime)).append("\n");
    sb.append("    dataEndTime: ").append(toIndentedString(dataEndTime)).append("\n");
    sb.append("    reportScheduleId: ").append(toIndentedString(reportScheduleId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    processingStartTime: ").append(toIndentedString(processingStartTime)).append("\n");
    sb.append("    processingEndTime: ").append(toIndentedString(processingEndTime)).append("\n");
    sb.append("    reportDocumentId: ").append(toIndentedString(reportDocumentId)).append("\n");
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
