package com.shopify.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LineItemsByFulfillmentOrder {

    @XmlElement(name = "fulfillment_order_id")
    private String fulfillmentOrderId;

    @XmlElement(name = "fulfillment_order_line_items")
    private List<FulfillmentOrderLineItem> fulfillmentOrderLineItems;

    public String getFulfillmentOrderId() {
        return fulfillmentOrderId;
    }

    public void setFulfillmentOrderId(String fulfillmentOrderId) {
        this.fulfillmentOrderId = fulfillmentOrderId;
    }

    public List<FulfillmentOrderLineItem> getFulfillmentOrderLineItems() {
        return fulfillmentOrderLineItems;
    }

    public void setFulfillmentOrderLineItems(List<FulfillmentOrderLineItem> fulfillmentOrderLineItems) {
        this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
    }
}