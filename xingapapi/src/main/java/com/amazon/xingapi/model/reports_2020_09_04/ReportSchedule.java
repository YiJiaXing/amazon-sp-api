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
import com.amazon.xingapi.model.reports_2020_09_04.ReportOptions;
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
 * Detailed information about a report schedule.
 */
@ApiModel(description = "Detailed information about a report schedule.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:28.054+08:00")
public class ReportSchedule {
  @SerializedName("reportScheduleId")
  private String reportScheduleId = null;

  @SerializedName("reportType")
  private String reportType = null;

  @SerializedName("marketplaceIds")
  private List<String> marketplaceIds = null;

  @SerializedName("reportOptions")
  private ReportOptions reportOptions = null;

  @SerializedName("period")
  private String period = null;

  @SerializedName("nextReportCreationTime")
  private OffsetDateTime nextReportCreationTime = null;

  public ReportSchedule reportScheduleId(String reportScheduleId) {
    this.reportScheduleId = reportScheduleId;
    return this;
  }

   /**
   * The identifier for the report schedule. This identifier is unique only in combination with a seller ID.
   * @return reportScheduleId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the report schedule. This identifier is unique only in combination with a seller ID.")
  public String getReportScheduleId() {
    return reportScheduleId;
  }

  public void setReportScheduleId(String reportScheduleId) {
    this.reportScheduleId = reportScheduleId;
  }

  public ReportSchedule reportType(String reportType) {
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

  public ReportSchedule marketplaceIds(List<String> marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
    return this;
  }

  public ReportSchedule addMarketplaceIdsItem(String marketplaceIdsItem) {
    if (this.marketplaceIds == null) {
      this.marketplaceIds = new ArrayList<String>();
    }
    this.marketplaceIds.add(marketplaceIdsItem);
    return this;
  }

   /**
   * A list of marketplace identifiers. The report document&#39;s contents will contain data for all of the specified marketplaces, unless the report type indicates otherwise.
   * @return marketplaceIds
  **/
  @ApiModelProperty(value = "A list of marketplace identifiers. The report document's contents will contain data for all of the specified marketplaces, unless the report type indicates otherwise.")
  public List<String> getMarketplaceIds() {
    return marketplaceIds;
  }

  public void setMarketplaceIds(List<String> marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
  }

  public ReportSchedule reportOptions(ReportOptions reportOptions) {
    this.reportOptions = reportOptions;
    return this;
  }

   /**
   * Get reportOptions
   * @return reportOptions
  **/
  @ApiModelProperty(value = "")
  public ReportOptions getReportOptions() {
    return reportOptions;
  }

  public void setReportOptions(ReportOptions reportOptions) {
    this.reportOptions = reportOptions;
  }

  public ReportSchedule period(String period) {
    this.period = period;
    return this;
  }

   /**
   * An ISO 8601 period value that indicates how often a report should be created.
   * @return period
  **/
  @ApiModelProperty(required = true, value = "An ISO 8601 period value that indicates how often a report should be created.")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public ReportSchedule nextReportCreationTime(OffsetDateTime nextReportCreationTime) {
    this.nextReportCreationTime = nextReportCreationTime;
    return this;
  }

   /**
   * The date and time when the schedule will create its next report, in ISO 8601 date time format.
   * @return nextReportCreationTime
  **/
  @ApiModelProperty(value = "The date and time when the schedule will create its next report, in ISO 8601 date time format.")
  public OffsetDateTime getNextReportCreationTime() {
    return nextReportCreationTime;
  }

  public void setNextReportCreationTime(OffsetDateTime nextReportCreationTime) {
    this.nextReportCreationTime = nextReportCreationTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportSchedule reportSchedule = (ReportSchedule) o;
    return Objects.equals(this.reportScheduleId, reportSchedule.reportScheduleId) &&
        Objects.equals(this.reportType, reportSchedule.reportType) &&
        Objects.equals(this.marketplaceIds, reportSchedule.marketplaceIds) &&
        Objects.equals(this.reportOptions, reportSchedule.reportOptions) &&
        Objects.equals(this.period, reportSchedule.period) &&
        Objects.equals(this.nextReportCreationTime, reportSchedule.nextReportCreationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportScheduleId, reportType, marketplaceIds, reportOptions, period, nextReportCreationTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportSchedule {\n");
    
    sb.append("    reportScheduleId: ").append(toIndentedString(reportScheduleId)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
    sb.append("    reportOptions: ").append(toIndentedString(reportOptions)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    nextReportCreationTime: ").append(toIndentedString(nextReportCreationTime)).append("\n");
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

