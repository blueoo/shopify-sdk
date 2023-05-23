package com.shopify.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyRefundLineItem {

	private String id;
	@XmlElement(name = "line_item_id")
	private String lineItemId;
	@XmlElement(name = "location_id")
	private String locationId;
	private long quantity;
	@XmlElement(name = "restock_type")
	private String restockType;
	private BigDecimal subtotal;
	@XmlElement(name = "subtotal_set")
	private ShopifyMoneySet subtotalSet;
	@XmlElement(name = "total_tax")
	private BigDecimal totalTax;
	@XmlElement(name = "total_tax_set")
	private ShopifyMoneySet totalTaxSet;
	@XmlElement(name = "line_item")
	private ShopifyLineItem lineItem;

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(final long quantity) {
		this.quantity = quantity;
	}

	public String getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(final String lineItemId) {
		this.lineItemId = lineItemId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(final String locationId) {
		this.locationId = locationId;
	}

	public String getRestockType() {
		return restockType;
	}

	public void setRestockType(final String restockType) {
		this.restockType = restockType;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(final BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(final BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	public ShopifyLineItem getLineItem() {
		return lineItem;
	}

	public void setLineItem(final ShopifyLineItem lineItem) {
		this.lineItem = lineItem;
	}

	public ShopifyMoneySet getSubtotalSet() {
		return subtotalSet;
	}

	public void setSubtotalSet(ShopifyMoneySet subtotalSet) {
		this.subtotalSet = subtotalSet;
	}

	public ShopifyMoneySet getTotalTaxSet() {
		return totalTaxSet;
	}

	public void setTotalTaxSet(ShopifyMoneySet totalTaxSet) {
		this.totalTaxSet = totalTaxSet;
	}
}
