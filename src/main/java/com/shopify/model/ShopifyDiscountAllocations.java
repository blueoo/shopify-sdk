package com.shopify.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement
public class ShopifyDiscountAllocations {

	private BigDecimal amount;

	@XmlElement(name = "amount_set")
	private ShopifyMoneySet amountSet;

	@XmlElement(name = "discount_application_index")
	private long discountApplicationIndex;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public ShopifyMoneySet getAmountSet() {
		return amountSet;
	}

	public void setAmountSet(ShopifyMoneySet amountSet) {
		this.amountSet = amountSet;
	}

	public long getDiscountApplicationIndex() {
		return discountApplicationIndex;
	}

	public void setDiscountApplicationIndex(long discountApplicationIndex) {
		this.discountApplicationIndex = discountApplicationIndex;
	}
}
