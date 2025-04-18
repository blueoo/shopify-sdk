package com.shopify.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shopify.model.adapters.EscapedStringAdapter;
import com.shopify.model.adapters.InventoryPolicyAdapter;
import com.shopify.model.adapters.InventoryPolicyDeserializer;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyVariant {

	private String id;
	@XmlElement(name = "product_id")
	@JsonProperty(value = "product_id")
	private String productId;
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String title;
	private BigDecimal price;
	@XmlElement(name = "compare_at_price")
	@JsonProperty(value = "compare_at_price")
	private BigDecimal compareAtPrice;
	private String sku;
	private String barcode;
	private int position;
	private Long grams;
	@XmlElement(name = "inventory_quantity")
	@JsonProperty(value = "inventory_quantity")
	private Long inventoryQuantity;
	@XmlElement(name = "image_id")
	@JsonProperty(value = "image_id")
	private String imageId;
	@XmlJavaTypeAdapter(InventoryPolicyAdapter.class)
	@XmlElement(name = "inventory_policy")
	@JsonProperty(value = "inventory_policy")
	@JsonDeserialize(converter = InventoryPolicyDeserializer.class)
	private InventoryPolicy inventoryPolicy;
	@XmlElement(name = "inventory_management")
	@JsonProperty(value = "inventory_management")
	private String inventoryManagement;
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String option1;
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String option2;
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String option3;
	@XmlElement(name = "fulfillment_service")
	@JsonProperty(value = "fulfillment_service")
	private String fulfillmentService;
	@XmlElement(name = "requires_shipping")
	@JsonProperty(value = "requires_shipping")
	private Boolean requiresShipping;
	private Boolean taxable;

	@XmlElement(name = "inventory_item_id")
	@JsonProperty(value = "inventory_item_id")
	private String inventoryItemId;

	private BigDecimal weight;

	@XmlElement(name = "weight_unit")
	@JsonProperty(value = "weight_unit")
	@XmlJavaTypeAdapter(EscapedStringAdapter.class)
	private String weightUnit;

	@XmlElement(name = "created_at")
	@JsonProperty(value = "created_at")
	private String createdAt;

	@XmlElement(name = "updated_at")
	@JsonProperty(value = "updated_at")
	private String updatedAt;

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(final String productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getCompareAtPrice() {
		return compareAtPrice;
	}

	public void setCompareAtPrice(final BigDecimal compareAtPrice) {
		this.compareAtPrice = compareAtPrice;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(final String sku) {
		this.sku = sku;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(final String barcode) {
		this.barcode = barcode;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(final int position) {
		this.position = position;
	}

	public Long getGrams() {
		return grams;
	}

	public void setGrams(final Long grams) {
		this.grams = grams;
	}

	public Long getInventoryQuantity() {
		return inventoryQuantity;
	}

	public void setInventoryQuantity(final Long inventoryQuantity) {
		this.inventoryQuantity = inventoryQuantity;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(final String imageId) {
		this.imageId = imageId;
	}

	public InventoryPolicy getInventoryPolicy() {
		return inventoryPolicy;
	}

	public void setInventoryPolicy(final InventoryPolicy inventoryPolicy) {
		this.inventoryPolicy = inventoryPolicy;
	}

	public String getInventoryManagement() {
		return inventoryManagement;
	}

	public void setInventoryManagement(final String inventoryManagement) {
		this.inventoryManagement = inventoryManagement;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(final String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(final String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(final String option3) {
		this.option3 = option3;
	}

	public String getFulfillmentService() {
		return fulfillmentService;
	}

	public void setFulfillmentService(final String fulfillmentService) {
		this.fulfillmentService = fulfillmentService;
	}

	public boolean isRequiresShipping() {
		return requiresShipping;
	}

	public void setRequiresShipping(final boolean requiresShipping) {
		this.requiresShipping = requiresShipping;
	}

	public boolean isTaxable() {
		return taxable;
	}

	public void setTaxable(final boolean taxable) {
		this.taxable = taxable;
	}

	public String getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(final String inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
}
