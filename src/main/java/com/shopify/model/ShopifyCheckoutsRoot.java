package com.shopify.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement
public class ShopifyCheckoutsRoot {

	private List<ShopifyAbandonedCheckouts> checkouts = new LinkedList<>();

	public List<ShopifyAbandonedCheckouts> getCheckouts() {
		return checkouts;
	}

	public void setCheckouts(List<ShopifyAbandonedCheckouts> checkouts) {
		this.checkouts = checkouts;
	}

}
