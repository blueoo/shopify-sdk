package com.shopify.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @desc:
 * @author: H&M
 * @date: 2023-04-06 10:51
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyClientDetails {
    private String acceptLanguage;

    private String browserHeight;

    private String browserIp;

    private String browserWidth;

    private String sessionHash;

    private String userAgent;

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(final String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }


    public String getBrowserHeight() {
        return browserHeight;
    }

    public void setBrowserHeight(final String browserHeight) {
        this.browserHeight = browserHeight;
    }

    public String getBrowserIp() { return browserIp;}

    public void setBrowserIp(final String browserIp) { this.browserIp = browserIp; }

    public String getBrowserWidth() { return browserWidth;}

    public void setBrowserWidth(final String browserWidth) { this.browserWidth = browserWidth; }

    public String getSessionHash() { return sessionHash;}

    public void setSessionHash(final String sessionHash) { this.sessionHash = sessionHash; }

    public String getUserAgent() { return userAgent;}

    public void setUserAgent(final String userAgent) { this.userAgent = userAgent; }
}
