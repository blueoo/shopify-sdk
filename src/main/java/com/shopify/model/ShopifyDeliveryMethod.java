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
public class ShopifyDeliveryMethod {

    private String id;

    /**
     * local: A delivery to a customer's doorstep.
     * none: No delivery method.
     * pick_up: A delivery that a customer picks up at your retail store, curbside, or any location that you choose.
     * retail: Items delivered immediately in a retail store.
     * shipping: A delivery to a customer using a shipping carrier.
     */
    @XmlElement(name = "method_type")
    private String methodType;

    @XmlElement(name = "min_delivery_date_time")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime minDeliveryDateTime;

    @XmlElement(name = "max_delivery_date_time")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime maxDeliveryDateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public DateTime getMinDeliveryDateTime() {
        return minDeliveryDateTime;
    }

    public void setMinDeliveryDateTime(DateTime minDeliveryDateTime) {
        this.minDeliveryDateTime = minDeliveryDateTime;
    }

    public DateTime getMaxDeliveryDateTime() {
        return maxDeliveryDateTime;
    }

    public void setMaxDeliveryDateTime(DateTime maxDeliveryDateTime) {
        this.maxDeliveryDateTime = maxDeliveryDateTime;
    }
}
