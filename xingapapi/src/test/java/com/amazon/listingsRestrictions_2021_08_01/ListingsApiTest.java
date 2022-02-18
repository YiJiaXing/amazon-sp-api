/*
 * Selling Partner API for Listings Restrictions
 * The Selling Partner API for Listings Restrictions provides programmatic access to restrictions on Amazon catalog listings.  For more information, see the [Listings Restrictions API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/listings-restrictions-api-use-case-guide/listings-restrictions-api-use-case-guide_2021-08-01.md).
 *
 * OpenAPI spec version: 2021-08-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.listingsRestrictions_2021_08_01;

import com.amazon.xingapi.client.ApiException;
import com.amazon.xingapi.api.listingsRestrictions_2021_08_01.ListingsApi;
import com.amazon.xingapi.model.listingsRestrictions_2021_08_01.ErrorList;
import com.amazon.xingapi.model.listingsRestrictions_2021_08_01.RestrictionList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ListingsApi
 */
@Ignore
public class ListingsApiTest {

    private final ListingsApi api = new ListingsApi();

    
    /**
     * 
     *
     * Returns listing restrictions for an item in the Amazon Catalog.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListingsRestrictionsTest() throws ApiException {
        String asin = null;
        String sellerId = null;
        List<String> marketplaceIds = null;
        String conditionType = null;
        String reasonLocale = null;
        RestrictionList response = api.getListingsRestrictions(asin, sellerId, marketplaceIds, conditionType, reasonLocale);

        // TODO: test validations
    }
    
}
