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
public class ShopifyLineItem {

	private String id;
	@XmlElement(name = "variant_id")
	private String variantId;
	private String title;
	private long quantity;

	private BigDecimal price;

	@XmlElement(name = "price_set")
	private ShopifyMoneySet priceSet;

	private Long grams;
	private String sku;
	@XmlElement(name = "variant_title")
	private String variantTitle;
	private String vendor;
	@XmlElement(name = "product_id")
	private String productId;
	@XmlElement(name = "requires_shipping")
	private Boolean requiresShipping;
	private Boolean taxable;
	@XmlElement(name = "gift_card")
	private Boolean giftCard;
	private String name;
	@XmlElement(name = "variant_inventory_management")
	private String variantInventoryManagement;
	@XmlElement(name = "fulfillable_quantity")
	private long fulfillableQuantity;

	@XmlElement(name = "total_discount")
	private BigDecimal totalDiscount;

	@XmlElement(name = "total_discount_set")
	private ShopifyMoneySet totalDiscountSet;

	@XmlElement(name = "fulfillment_status")
	private String fulfillmentStatus;
	@XmlElement(name = "fulfillment_service")
	private String fulfillmentService;
	@XmlElement(name = "tax_lines")
	private List<ShopifyTaxLine> taxLines = new LinkedList<>();
	@XmlElement(name = "discount_allocations")
	private List<ShopifyDiscountAllocations> discountAllocations = new LinkedList<>();

	@XmlElement(name = "product_exists")
	private Boolean productExists;

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getVariantId() {
		return variantId;
	}

	public void setVariantId(final String variantId) {
		this.variantId = variantId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(final long quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	public long getGrams() {
		return grams;
	}

	public void setGrams(final Long grams) {
		this.grams = grams;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(final String sku) {
		this.sku = sku;
	}

	public String getVariantTitle() {
		return variantTitle;
	}

	public void setVariantTitle(final String variantTitle) {
		this.variantTitle = variantTitle;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(final String vendor) {
		this.vendor = vendor;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(final String productId) {
		this.productId = productId;
	}

	public boolean isRequiresShipping() {
		return requiresShipping;
	}

	public void setRequiresShipping(final Boolean requiresShipping) {
		this.requiresShipping = requiresShipping;
	}

	public boolean isTaxable() {
		return taxable;
	}

	public void setTaxable(final Boolean taxable) {
		this.taxable = taxable;
	}

	public boolean isGiftCard() {
		return giftCard;
	}

	public void setGiftCard(final Boolean giftCard) {
		this.giftCard = giftCard;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getVariantInventoryManagement() {
		return variantInventoryManagement;
	}

	public void setVariantInventoryManagement(final String variantInventoryManagement) {
		this.variantInventoryManagement = variantInventoryManagement;
	}

	public long getFulfillableQuantity() {
		return fulfillableQuantity;
	}

	public void setFulfillableQuantity(final long fulfillableQuantity) {
		this.fulfillableQuantity = fulfillableQuantity;
	}

	public BigDecimal getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(final BigDecimal totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public String getFulfillmentStatus() {
		return fulfillmentStatus;
	}

	public void setFulfillmentStatus(final String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	public String getFulfillmentService() {
		return fulfillmentService;
	}

	public void setFulfillmentService(final String fulfillmentService) {
		this.fulfillmentService = fulfillmentService;
	}

	public List<ShopifyTaxLine> getTaxLines() {
		return taxLines;
	}

	public void setTaxLines(final List<ShopifyTaxLine> taxLines) {
		this.taxLines = taxLines;
	}

	public List<ShopifyDiscountAllocations> getDiscountAllocations() {
		return discountAllocations;
	}

	public void setDiscountAllocations(final List<ShopifyDiscountAllocations> discountAllocations) {
		this.discountAllocations = discountAllocations;
	}

	public boolean isProductExists() {
		return productExists;
	}

	public void setProductExists(final Boolean productExists) {
		this.productExists = productExists;
	}

	public ShopifyMoneySet getTotalDiscountSet() {
		return totalDiscountSet;
	}

	public void setTotalDiscountSet(ShopifyMoneySet totalDiscountSet) {
		this.totalDiscountSet = totalDiscountSet;
	}

	public ShopifyMoneySet getPriceSet() {
		return priceSet;
	}

	public void setPriceSet(ShopifyMoneySet priceSet) {
		this.priceSet = priceSet;
	}
}
