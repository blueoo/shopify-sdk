package com.shopify.model;

import com.shopify.model.adapters.DateTimeAdapter;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyEmailMarketingConsent {

    private String state;

    @XmlElement(name = "opt_in_level")
    private String optInLevel;

    @XmlElement(name = "consent_updated_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime consentUpdatedAt;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOptInLevel() {
        return optInLevel;
    }

    public void setOptInLevel(String optInLevel) {
        this.optInLevel = optInLevel;
    }

    public DateTime getConsentUpdatedAt() {
        return consentUpdatedAt;
    }

    public void setConsentUpdatedAt(DateTime consentUpdatedAt) {
        this.consentUpdatedAt = consentUpdatedAt;
    }
}
