package com.shopify.model;

import java.math.BigDecimal;

public class ShopifyRefundCreationRequest {

	private ShopifyRefund request;

	private BigDecimal amount;

	public ShopifyRefund getRequest() {
		return request;
	}

	public void setRequest(final ShopifyRefund request) {
		this.request = request;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
