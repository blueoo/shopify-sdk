package com.shopify.model;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyShippingLine {
	private String id;

	@XmlElement(name = "carrier_identifier")
	private String carrierIdentifier;

	private String code;

	@XmlElement(name = "discounted_price")
	private BigDecimal discountedPrice;

	@XmlElement(name = "discounted_price_set")
	private ShopifyMoneySet discountedPriceSet;

	@XmlElement(name = "is_removed")
	private Boolean isRemoved;

	private String phone;

	private BigDecimal price;

	@XmlElement(name = "price_set")
	private ShopifyMoneySet priceSet;

	@XmlElement(name = "requested_fulfillment_service_id")
	private String requestedFulfillmentServiceId;

	private String source;

	private String title;

	@XmlElement(name = "tax_lines")
	private List<ShopifyTaxLine> taxLines = new LinkedList<>();

	@XmlElement(name = "discount_allocations")
	private List<ShopifyDiscountAllocations> discountAllocations = new LinkedList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCarrierIdentifier() {
		return carrierIdentifier;
	}

	public void setCarrierIdentifier(String carrierIdentifier) {
		this.carrierIdentifier = carrierIdentifier;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(BigDecimal discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public ShopifyMoneySet getDiscountedPriceSet() {
		return discountedPriceSet;
	}

	public void setDiscountedPriceSet(ShopifyMoneySet discountedPriceSet) {
		this.discountedPriceSet = discountedPriceSet;
	}

	public Boolean getIsRemoved() {
		return isRemoved;
	}

	public void setIsRemoved(Boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public ShopifyMoneySet getPriceSet() {
		return priceSet;
	}

	public void setPriceSet(ShopifyMoneySet priceSet) {
		this.priceSet = priceSet;
	}

	public String getRequestedFulfillmentServiceId() {
		return requestedFulfillmentServiceId;
	}

	public void setRequestedFulfillmentServiceId(String requestedFulfillmentServiceId) {
		this.requestedFulfillmentServiceId = requestedFulfillmentServiceId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ShopifyTaxLine> getTaxLines() {
		return taxLines;
	}

	public void setTaxLines(List<ShopifyTaxLine> taxLines) {
		this.taxLines = taxLines;
	}

	public List<ShopifyDiscountAllocations> getDiscountAllocations() {
		return discountAllocations;
	}

	public void setDiscountAllocations(final List<ShopifyDiscountAllocations> discountAllocations) {
		this.discountAllocations = discountAllocations;
	}
}
