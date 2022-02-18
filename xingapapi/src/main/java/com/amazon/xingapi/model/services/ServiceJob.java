/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.xingapi.model.services;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.xingapi.model.services.Appointment;
import com.amazon.xingapi.model.services.AppointmentTime;
import com.amazon.xingapi.model.services.AssociatedItem;
import com.amazon.xingapi.model.services.Buyer;
import com.amazon.xingapi.model.services.ScopeOfWork;
import com.amazon.xingapi.model.services.Seller;
import com.amazon.xingapi.model.services.ServiceJobProvider;
import com.amazon.xingapi.model.services.ServiceLocation;
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
 * The job details of a service.
 */
@ApiModel(description = "The job details of a service.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-26T15:44:39.169+08:00")
public class ServiceJob {
  @SerializedName("createTime")
  private OffsetDateTime createTime = null;

  @SerializedName("serviceJobId")
  private String serviceJobId = null;

  /**
   * The status of the service job.
   */
  @JsonAdapter(ServiceJobStatusEnum.Adapter.class)
  public enum ServiceJobStatusEnum {
    NOT_SERVICED("NOT_SERVICED"),
    
    CANCELLED("CANCELLED"),
    
    COMPLETED("COMPLETED"),
    
    PENDING_SCHEDULE("PENDING_SCHEDULE"),
    
    NOT_FULFILLABLE("NOT_FULFILLABLE"),
    
    HOLD("HOLD"),
    
    PAYMENT_DECLINED("PAYMENT_DECLINED");

    private String value;

    ServiceJobStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceJobStatusEnum fromValue(String text) {
      for (ServiceJobStatusEnum b : ServiceJobStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ServiceJobStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceJobStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceJobStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceJobStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("serviceJobStatus")
  private ServiceJobStatusEnum serviceJobStatus = null;

  @SerializedName("scopeOfWork")
  private ScopeOfWork scopeOfWork = null;

  @SerializedName("seller")
  private Seller seller = null;

  @SerializedName("serviceJobProvider")
  private ServiceJobProvider serviceJobProvider = null;

  @SerializedName("preferredAppointmentTimes")
  private List<AppointmentTime> preferredAppointmentTimes = null;

  @SerializedName("appointments")
  private List<Appointment> appointments = null;

  @SerializedName("serviceOrderId")
  private String serviceOrderId = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("buyer")
  private Buyer buyer = null;

  @SerializedName("associatedItems")
  private List<AssociatedItem> associatedItems = null;

  @SerializedName("serviceLocation")
  private ServiceLocation serviceLocation = null;

  public ServiceJob createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * The date and time of the creation of the job, in ISO 8601 format.
   * @return createTime
  **/
  @ApiModelProperty(value = "The date and time of the creation of the job, in ISO 8601 format.")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public ServiceJob serviceJobId(String serviceJobId) {
    this.serviceJobId = serviceJobId;
    return this;
  }

   /**
   * The service job identifier.
   * @return serviceJobId
  **/
  @ApiModelProperty(value = "The service job identifier.")
  public String getServiceJobId() {
    return serviceJobId;
  }

  public void setServiceJobId(String serviceJobId) {
    this.serviceJobId = serviceJobId;
  }

  public ServiceJob serviceJobStatus(ServiceJobStatusEnum serviceJobStatus) {
    this.serviceJobStatus = serviceJobStatus;
    return this;
  }

   /**
   * The status of the service job.
   * @return serviceJobStatus
  **/
  @ApiModelProperty(value = "The status of the service job.")
  public ServiceJobStatusEnum getServiceJobStatus() {
    return serviceJobStatus;
  }

  public void setServiceJobStatus(ServiceJobStatusEnum serviceJobStatus) {
    this.serviceJobStatus = serviceJobStatus;
  }

  public ServiceJob scopeOfWork(ScopeOfWork scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
    return this;
  }

   /**
   * The scope of work for the order.
   * @return scopeOfWork
  **/
  @ApiModelProperty(value = "The scope of work for the order.")
  public ScopeOfWork getScopeOfWork() {
    return scopeOfWork;
  }

  public void setScopeOfWork(ScopeOfWork scopeOfWork) {
    this.scopeOfWork = scopeOfWork;
  }

  public ServiceJob seller(Seller seller) {
    this.seller = seller;
    return this;
  }

   /**
   * Information about the seller of the service job.
   * @return seller
  **/
  @ApiModelProperty(value = "Information about the seller of the service job.")
  public Seller getSeller() {
    return seller;
  }

  public void setSeller(Seller seller) {
    this.seller = seller;
  }

  public ServiceJob serviceJobProvider(ServiceJobProvider serviceJobProvider) {
    this.serviceJobProvider = serviceJobProvider;
    return this;
  }

   /**
   * Information about the service job provider.
   * @return serviceJobProvider
  **/
  @ApiModelProperty(value = "Information about the service job provider.")
  public ServiceJobProvider getServiceJobProvider() {
    return serviceJobProvider;
  }

  public void setServiceJobProvider(ServiceJobProvider serviceJobProvider) {
    this.serviceJobProvider = serviceJobProvider;
  }

  public ServiceJob preferredAppointmentTimes(List<AppointmentTime> preferredAppointmentTimes) {
    this.preferredAppointmentTimes = preferredAppointmentTimes;
    return this;
  }

  public ServiceJob addPreferredAppointmentTimesItem(AppointmentTime preferredAppointmentTimesItem) {
    if (this.preferredAppointmentTimes == null) {
      this.preferredAppointmentTimes = new ArrayList<AppointmentTime>();
    }
    this.preferredAppointmentTimes.add(preferredAppointmentTimesItem);
    return this;
  }

   /**
   * A list of appointment windows preferred by the buyer. Included only if the buyer selected appointment windows when creating the order.
   * @return preferredAppointmentTimes
  **/
  @ApiModelProperty(value = "A list of appointment windows preferred by the buyer. Included only if the buyer selected appointment windows when creating the order.")
  public List<AppointmentTime> getPreferredAppointmentTimes() {
    return preferredAppointmentTimes;
  }

  public void setPreferredAppointmentTimes(List<AppointmentTime> preferredAppointmentTimes) {
    this.preferredAppointmentTimes = preferredAppointmentTimes;
  }

  public ServiceJob appointments(List<Appointment> appointments) {
    this.appointments = appointments;
    return this;
  }

  public ServiceJob addAppointmentsItem(Appointment appointmentsItem) {
    if (this.appointments == null) {
      this.appointments = new ArrayList<Appointment>();
    }
    this.appointments.add(appointmentsItem);
    return this;
  }

   /**
   * A list of appointments.
   * @return appointments
  **/
  @ApiModelProperty(value = "A list of appointments.")
  public List<Appointment> getAppointments() {
    return appointments;
  }

  public void setAppointments(List<Appointment> appointments) {
    this.appointments = appointments;
  }

  public ServiceJob serviceOrderId(String serviceOrderId) {
    this.serviceOrderId = serviceOrderId;
    return this;
  }

   /**
   * The Amazon-defined identifier for an order placed by the buyer, in 3-7-7 format.
   * @return serviceOrderId
  **/
  @ApiModelProperty(value = "The Amazon-defined identifier for an order placed by the buyer, in 3-7-7 format.")
  public String getServiceOrderId() {
    return serviceOrderId;
  }

  public void setServiceOrderId(String serviceOrderId) {
    this.serviceOrderId = serviceOrderId;
  }

  public ServiceJob marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(value = "The marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ServiceJob buyer(Buyer buyer) {
    this.buyer = buyer;
    return this;
  }

   /**
   * Information about the buyer.
   * @return buyer
  **/
  @ApiModelProperty(value = "Information about the buyer.")
  public Buyer getBuyer() {
    return buyer;
  }

  public void setBuyer(Buyer buyer) {
    this.buyer = buyer;
  }

  public ServiceJob associatedItems(List<AssociatedItem> associatedItems) {
    this.associatedItems = associatedItems;
    return this;
  }

  public ServiceJob addAssociatedItemsItem(AssociatedItem associatedItemsItem) {
    if (this.associatedItems == null) {
      this.associatedItems = new ArrayList<AssociatedItem>();
    }
    this.associatedItems.add(associatedItemsItem);
    return this;
  }

   /**
   * A list of items associated with the service job.
   * @return associatedItems
  **/
  @ApiModelProperty(value = "A list of items associated with the service job.")
  public List<AssociatedItem> getAssociatedItems() {
    return associatedItems;
  }

  public void setAssociatedItems(List<AssociatedItem> associatedItems) {
    this.associatedItems = associatedItems;
  }

  public ServiceJob serviceLocation(ServiceLocation serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

   /**
   * Information about the location of the service job.
   * @return serviceLocation
  **/
  @ApiModelProperty(value = "Information about the location of the service job.")
  public ServiceLocation getServiceLocation() {
    return serviceLocation;
  }

  public void setServiceLocation(ServiceLocation serviceLocation) {
    this.serviceLocation = serviceLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceJob serviceJob = (ServiceJob) o;
    return Objects.equals(this.createTime, serviceJob.createTime) &&
        Objects.equals(this.serviceJobId, serviceJob.serviceJobId) &&
        Objects.equals(this.serviceJobStatus, serviceJob.serviceJobStatus) &&
        Objects.equals(this.scopeOfWork, serviceJob.scopeOfWork) &&
        Objects.equals(this.seller, serviceJob.seller) &&
        Objects.equals(this.serviceJobProvider, serviceJob.serviceJobProvider) &&
        Objects.equals(this.preferredAppointmentTimes, serviceJob.preferredAppointmentTimes) &&
        Objects.equals(this.appointments, serviceJob.appointments) &&
        Objects.equals(this.serviceOrderId, serviceJob.serviceOrderId) &&
        Objects.equals(this.marketplaceId, serviceJob.marketplaceId) &&
        Objects.equals(this.buyer, serviceJob.buyer) &&
        Objects.equals(this.associatedItems, serviceJob.associatedItems) &&
        Objects.equals(this.serviceLocation, serviceJob.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, serviceJobId, serviceJobStatus, scopeOfWork, seller, serviceJobProvider, preferredAppointmentTimes, appointments, serviceOrderId, marketplaceId, buyer, associatedItems, serviceLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceJob {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    serviceJobId: ").append(toIndentedString(serviceJobId)).append("\n");
    sb.append("    serviceJobStatus: ").append(toIndentedString(serviceJobStatus)).append("\n");
    sb.append("    scopeOfWork: ").append(toIndentedString(scopeOfWork)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    serviceJobProvider: ").append(toIndentedString(serviceJobProvider)).append("\n");
    sb.append("    preferredAppointmentTimes: ").append(toIndentedString(preferredAppointmentTimes)).append("\n");
    sb.append("    appointments: ").append(toIndentedString(appointments)).append("\n");
    sb.append("    serviceOrderId: ").append(toIndentedString(serviceOrderId)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    associatedItems: ").append(toIndentedString(associatedItems)).append("\n");
    sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
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

