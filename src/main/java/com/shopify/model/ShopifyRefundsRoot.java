package com.shopify.model;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ShopifyRefundsRoot {
	private List<ShopifyRefund> refunds = new LinkedList<>();

	public List<ShopifyRefund> getRefunds() {
		return refunds;
	}

	public void setRefunds(final List<ShopifyRefund> refunds) {
		this.refunds = refunds;
	}
}
