package com.shopify.model;

import com.shopify.model.adapters.CurrencyAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.util.Currency;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyMoney {

    private BigDecimal amount;

    @XmlJavaTypeAdapter(CurrencyAdapter.class)
    @XmlElement(name = "currency_code")
    private Currency currencyCode;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(Currency currencyCode) {
        this.currencyCode = currencyCode;
    }
}
