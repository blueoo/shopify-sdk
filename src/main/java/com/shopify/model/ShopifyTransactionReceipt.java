package com.shopify.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyTransactionReceipt {

	@XmlElement(name = "apple_pay")
	private boolean applePay;

	private String id;

	@XmlElement(name = "payment_id")
	private String paymentId;

	@XmlElement(name = "transaction_id")
	private String transactionId;

	@XmlElement(name = "gift_card_id")
	private String giftCardId;

	public boolean isApplePay() {
		return applePay;
	}

	public void setApplePay(final boolean applePay) {
		this.applePay = applePay;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getGiftCardId() {
		return giftCardId;
	}

	public void setGiftCardId(String giftCardId) {
		this.giftCardId = giftCardId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
