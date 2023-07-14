package com.shopify.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ShopifyFulfillmentRequestRoot {

	private ShopifyFulfillmentCreateRequest fulfillment;

	public ShopifyFulfillmentCreateRequest getFulfillment() {
		return fulfillment;
	}

	public void setFulfillment(ShopifyFulfillmentCreateRequest fulfillment) {
		this.fulfillment = fulfillment;
	}

}