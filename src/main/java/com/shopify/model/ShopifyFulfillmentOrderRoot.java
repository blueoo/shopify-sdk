package com.shopify.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class ShopifyFulfillmentOrderRoot {

    @XmlElement(name = "fulfillment_orders")
    private List<ShopifyFulfillmentOrder> fulfillmentOrders;

    public List<ShopifyFulfillmentOrder> getFulfillmentOrders() {
        return fulfillmentOrders;
    }

    public void setFulfillmentOrders(List<ShopifyFulfillmentOrder> fulfillmentOrders) {
        this.fulfillmentOrders = fulfillmentOrders;
    }
}
