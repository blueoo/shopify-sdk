package com.shopify.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyCustomerCreateRoot {

	private ShopifyCustomerCreateRequest customer;

	public ShopifyCustomerCreateRequest getCustomer() {
		return customer;
	}

	public void setCustomer(final ShopifyCustomerCreateRequest customer) {
		this.customer = customer;
	}

}
