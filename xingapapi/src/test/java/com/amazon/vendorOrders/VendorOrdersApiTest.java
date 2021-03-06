/*
 * Selling Partner API for Retail Procurement Orders
 * The Selling Partner API for Retail Procurement Orders provides programmatic access to vendor orders data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.vendorOrders;

import com.amazon.xingapi.client.ApiException;
import com.amazon.xingapi.api.vendorOrders.VendorOrdersApi;
import com.amazon.xingapi.model.vendorOrders.GetPurchaseOrderResponse;
import com.amazon.xingapi.model.vendorOrders.GetPurchaseOrdersResponse;
import com.amazon.xingapi.model.vendorOrders.GetPurchaseOrdersStatusResponse;
import org.threeten.bp.OffsetDateTime;
import com.amazon.xingapi.model.vendorOrders.SubmitAcknowledgementRequest;
import com.amazon.xingapi.model.vendorOrders.SubmitAcknowledgementResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VendorOrdersApi
 */
@Ignore
public class VendorOrdersApiTest {

    private final VendorOrdersApi api = new VendorOrdersApi();

    
    /**
     * 
     *
     * Returns a purchase order based on the purchaseOrderNumber value that you specify.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPurchaseOrderTest() throws ApiException {
        String purchaseOrderNumber = null;
        GetPurchaseOrderResponse response = api.getPurchaseOrder(purchaseOrderNumber);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of purchase orders created or changed during the time frame that you specify. You define the time frame using the createdAfter, createdBefore, changedAfter and changedBefore parameters. The date range to search must not be more than 7 days. You can choose to get only the purchase order numbers by setting includeDetails to false. You can then use the getPurchaseOrder operation to receive details for a specific purchase order.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPurchaseOrdersTest() throws ApiException {
        Long limit = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        String sortOrder = null;
        String nextToken = null;
        String includeDetails = null;
        OffsetDateTime changedAfter = null;
        OffsetDateTime changedBefore = null;
        String poItemState = null;
        String isPOChanged = null;
        String purchaseOrderState = null;
        String orderingVendorCode = null;
        GetPurchaseOrdersResponse response = api.getPurchaseOrders(limit, createdAfter, createdBefore, sortOrder, nextToken, includeDetails, changedAfter, changedBefore, poItemState, isPOChanged, purchaseOrderState, orderingVendorCode);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns purchase order statuses based on the filters that you specify. Date range to search must not be more than 7 days. You can return a list of purchase order statuses using the available filters, or a single purchase order status by providing the purchase order number.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPurchaseOrdersStatusTest() throws ApiException {
        Long limit = null;
        String sortOrder = null;
        String nextToken = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        OffsetDateTime updatedAfter = null;
        OffsetDateTime updatedBefore = null;
        String purchaseOrderNumber = null;
        String purchaseOrderStatus = null;
        String itemConfirmationStatus = null;
        String orderingVendorCode = null;
        String shipToPartyId = null;
        GetPurchaseOrdersStatusResponse response = api.getPurchaseOrdersStatus(limit, sortOrder, nextToken, createdAfter, createdBefore, updatedAfter, updatedBefore, purchaseOrderNumber, purchaseOrderStatus, itemConfirmationStatus, orderingVendorCode, shipToPartyId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Submits acknowledgements for one or more purchase orders.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitAcknowledgementTest() throws ApiException {
        SubmitAcknowledgementRequest body = null;
        SubmitAcknowledgementResponse response = api.submitAcknowledgement(body);

        // TODO: test validations
    }
    
}
