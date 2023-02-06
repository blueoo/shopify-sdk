package com.shopify.model;

import com.shopify.model.adapters.CurrencyAdapter;
import com.shopify.model.adapters.DateTimeAdapter;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.LinkedList;
import java.util.List;

/**
 * @CLassname ShopifyAbandonedCheckouts
 * @Description ShopifyAbandonedCheckouts
 * @Author blueo
 * @Date 2023/2/3 14:24
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyAbandonedCheckouts {

    @XmlElement(name = "abandoned_checkout_url")
    private String abandonedCheckoutUrl;

    @XmlElement(name = "billing_address")
    private ShopifyAddress billingAddress = new ShopifyAddress();

    @XmlElement(name = "buyer_accepts_marketing")
    private boolean buyerAcceptsMarketing;

    @XmlElement(name = "buyer_accepts_sms_marketing")
    private boolean buyerAcceptsSmsMarketing;

    @XmlElement(name = "cart_token")
    private String cartToken;

    @XmlElement(name = "closed_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime closedAt;

    @XmlElement(name = "completed_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime completedAt;

    @XmlElement(name = "created_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime createdAt;

    @XmlJavaTypeAdapter(CurrencyAdapter.class)
    private Currency currency;

    private ShopifyCustomer customer = new ShopifyCustomer();

    @XmlElement(name = "customer_locale")
    private String customerLocale;

    @XmlElement(name = "device_id")
    private String deviceId;

    @XmlElement(name = "discount_codes")
    private List<ShopifyDiscountCode> discountCodes = new LinkedList<>();

    private String email;

    private String gateway;

    private String id;

    @XmlElement(name = "landing_site")
    private String landingSite;

    @XmlElement(name = "line_items")
    private List<ShopifyLineItem> lineItems = new LinkedList<>();

    @XmlElement(name = "location_id")
    private String locationId;

    private String note;

    @XmlElement(name = "note_attributes")
    private List<ShopifyAttribute> noteAttributes = new LinkedList<>();

    private String phone;

    @XmlJavaTypeAdapter(CurrencyAdapter.class)
    @XmlElement(name = "presentment_currency")
    private Currency presentmentCurrency;

    @XmlElement(name = "referring_site")
    private String referringSite;

    @XmlElement(name = "shipping_address")
    private ShopifyAddress shippingAddress = new ShopifyAddress();

    @XmlElement(name = "sms_marketing_phone")
    private String smsMarketingPhone;

    @XmlElement(name = "shipping_lines")
    private List<ShopifyShippingLine> shippingLines = new LinkedList<>();

    @XmlElement(name = "source_name")
    private String sourceName;

    @XmlElement(name = "subtotal_price")
    private BigDecimal subtotalPrice;

    @XmlElement(name = "tax_lines")
    private List<ShopifyTaxLine> taxLines = new LinkedList<>();

    @XmlElement(name = "taxes_included")
    private boolean taxesIncluded;

    private String token;

    @XmlElement(name = "total_discounts")
    private BigDecimal totalDiscounts;

    @XmlElement(name = "total_duties")
    private BigDecimal totalDuties;

    @XmlElement(name = "total_line_items_price")
    private BigDecimal totalLineItemsPrice;

    @XmlElement(name = "total_price")
    private BigDecimal totalPrice;

    @XmlElement(name = "total_tax")
    private BigDecimal totalTax;

    @XmlElement(name = "total_weight")
    private long totalWeight;

    @XmlElement(name = "updated_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime updatedAt;

    @XmlElement(name = "user_id")
    private String userId;

    public String getAbandonedCheckoutUrl() {
        return abandonedCheckoutUrl;
    }

    public void setAbandonedCheckoutUrl(String abandonedCheckoutUrl) {
        this.abandonedCheckoutUrl = abandonedCheckoutUrl;
    }

    public ShopifyAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(ShopifyAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isBuyerAcceptsMarketing() {
        return buyerAcceptsMarketing;
    }

    public void setBuyerAcceptsMarketing(boolean buyerAcceptsMarketing) {
        this.buyerAcceptsMarketing = buyerAcceptsMarketing;
    }

    public boolean isBuyerAcceptsSmsMarketing() {
        return buyerAcceptsSmsMarketing;
    }

    public void setBuyerAcceptsSmsMarketing(boolean buyerAcceptsSmsMarketing) {
        this.buyerAcceptsSmsMarketing = buyerAcceptsSmsMarketing;
    }

    public String getCartToken() {
        return cartToken;
    }

    public void setCartToken(String cartToken) {
        this.cartToken = cartToken;
    }

    public DateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(DateTime closedAt) {
        this.closedAt = closedAt;
    }

    public DateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(DateTime completedAt) {
        this.completedAt = completedAt;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public ShopifyCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(ShopifyCustomer customer) {
        this.customer = customer;
    }

    public String getCustomerLocale() {
        return customerLocale;
    }

    public void setCustomerLocale(String customerLocale) {
        this.customerLocale = customerLocale;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public List<ShopifyDiscountCode> getDiscountCodes() {
        return discountCodes;
    }

    public void setDiscountCodes(List<ShopifyDiscountCode> discountCodes) {
        this.discountCodes = discountCodes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLandingSite() {
        return landingSite;
    }

    public void setLandingSite(String landingSite) {
        this.landingSite = landingSite;
    }

    public List<ShopifyLineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<ShopifyLineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<ShopifyAttribute> getNoteAttributes() {
        return noteAttributes;
    }

    public void setNoteAttributes(List<ShopifyAttribute> noteAttributes) {
        this.noteAttributes = noteAttributes;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Currency getPresentmentCurrency() {
        return presentmentCurrency;
    }

    public void setPresentmentCurrency(Currency presentmentCurrency) {
        this.presentmentCurrency = presentmentCurrency;
    }

    public String getReferringSite() {
        return referringSite;
    }

    public void setReferringSite(String referringSite) {
        this.referringSite = referringSite;
    }

    public ShopifyAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShopifyAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getSmsMarketingPhone() {
        return smsMarketingPhone;
    }

    public void setSmsMarketingPhone(String smsMarketingPhone) {
        this.smsMarketingPhone = smsMarketingPhone;
    }

    public List<ShopifyShippingLine> getShippingLines() {
        return shippingLines;
    }

    public void setShippingLines(List<ShopifyShippingLine> shippingLines) {
        this.shippingLines = shippingLines;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public BigDecimal getSubtotalPrice() {
        return subtotalPrice;
    }

    public void setSubtotalPrice(BigDecimal subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

    public List<ShopifyTaxLine> getTaxLines() {
        return taxLines;
    }

    public void setTaxLines(List<ShopifyTaxLine> taxLines) {
        this.taxLines = taxLines;
    }

    public boolean isTaxesIncluded() {
        return taxesIncluded;
    }

    public void setTaxesIncluded(boolean taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public BigDecimal getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(BigDecimal totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public BigDecimal getTotalDuties() {
        return totalDuties;
    }

    public void setTotalDuties(BigDecimal totalDuties) {
        this.totalDuties = totalDuties;
    }

    public BigDecimal getTotalLineItemsPrice() {
        return totalLineItemsPrice;
    }

    public void setTotalLineItemsPrice(BigDecimal totalLineItemsPrice) {
        this.totalLineItemsPrice = totalLineItemsPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public long getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(long totalWeight) {
        this.totalWeight = totalWeight;
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
