package com.amazon.xingapi.SellingPartnerAPIAA;

import lombok.Data;

@Data
class LWAAccessTokenCacheItem {

    private String accessToken;
    private long accessTokenExpiredTime;

}
