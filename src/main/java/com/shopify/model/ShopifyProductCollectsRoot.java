package com.shopify.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement
public class ShopifyProductCollectsRoot {

	private List<ShopifyProductCollect> collects = new LinkedList<>();

	public List<ShopifyProductCollect> getCollects() {
		return collects;
	}

	public void setCollects(List<ShopifyProductCollect> collects) {
		this.collects = collects;
	}
}
