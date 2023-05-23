package com.shopify.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyMoneySet {

    @XmlElement(name = "shop_money")
    private ShopifyMoney shopMoney;

    @XmlElement(name = "presentment_money")
    private ShopifyMoney presentmentMoney;

    public ShopifyMoney getShopMoney() {
        return shopMoney;
    }

    public void setShopMoney(ShopifyMoney shopMoney) {
        this.shopMoney = shopMoney;
    }

    public ShopifyMoney getPresentmentMoney() {
        return presentmentMoney;
    }

    public void setPresentmentMoney(ShopifyMoney presentmentMoney) {
        this.presentmentMoney = presentmentMoney;
    }
}
