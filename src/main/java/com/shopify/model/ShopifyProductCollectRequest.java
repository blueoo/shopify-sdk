package com.shopify.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @CLassname ShopifyProductCollectRequest
 * @Description product collect request
 * @Author blueo
 * @Date 2022/7/8 12:23
 */
@XmlRootElement
public class ShopifyProductCollectRequest {

    private ShopifyProductCollect collect;

    public ShopifyProductCollect getCollect() {
        return collect;
    }

    public void setCollect(ShopifyProductCollect collect) {
        this.collect = collect;
    }
}
