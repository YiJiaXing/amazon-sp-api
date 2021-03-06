/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.vendorShipments;

import com.amazon.xingapi.client.ApiException;
import com.amazon.xingapi.api.vendorShipments.VendorShippingApi;
import com.amazon.xingapi.model.vendorShipments.SubmitShipmentConfirmationsRequest;
import com.amazon.xingapi.model.vendorShipments.SubmitShipmentConfirmationsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VendorShippingApi
 */
@Ignore
public class VendorShippingApiTest {

    private final VendorShippingApi api = new VendorShippingApi();

    
    /**
     * 
     *
     * Submits one or more shipment confirmations for vendor orders.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitShipmentConfirmationsTest() throws ApiException {
        SubmitShipmentConfirmationsRequest body = null;
        SubmitShipmentConfirmationsResponse response = api.submitShipmentConfirmations(body);

        // TODO: test validations
    }
    
}
