package com.shopify.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyFulfillmentCreateRequest {

    @XmlElement(name = "line_items_by_fulfillment_order")
    private List<LineItemsByFulfillmentOrder> lineItemsByFulfillmentOrder;

    private String message;

    @XmlElement(name = "notify_customer")
    private boolean notifyCustomer;

    @XmlElement(name = "origin_address")
    private ShopifyAddress originAddress;

    @XmlElement(name = "tracking_info")
    private ShopifyTrackingInfo trackingInfo;

    public ShopifyTrackingInfo getTrackingInfo() {
        return trackingInfo;
    }

    public void setTrackingInfo(ShopifyTrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
    }

    public ShopifyAddress getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(ShopifyAddress originAddress) {
        this.originAddress = originAddress;
    }

    public boolean isNotifyCustomer() {
        return notifyCustomer;
    }

    public void setNotifyCustomer(boolean notifyCustomer) {
        this.notifyCustomer = notifyCustomer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<LineItemsByFulfillmentOrder> getLineItemsByFulfillmentOrder() {
        return lineItemsByFulfillmentOrder;
    }

    public void setLineItemsByFulfillmentOrder(List<LineItemsByFulfillmentOrder> lineItemsByFulfillmentOrder) {
        this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
    }
}
