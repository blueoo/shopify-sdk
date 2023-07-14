package com.shopify.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyFulfillmentOrder {

    public enum RequestStatus {

        UNSUBMITTED("unsubmitted"), SUBMITTED("submitted"), ACCEPTED("accepted"), REJECTED("rejected"),
        CANCELLATION_REQUESTED("cancellation_requested"), CANCELLATION_ACCEPTED("cancellation_accepted"),
        CANCELLATION_REJECTED("cancellation_rejected"), CLOSED("closed");

        static final String NO_MATCHING_ENUMS_ERROR_MESSAGE = "No matching enum found for status: %s";
        private final String value;

        private RequestStatus(final String value) {
            this.value = value;
        }

        public static RequestStatus toEnum(final String value) {
            if (UNSUBMITTED.toString().equals(value)) {
                return RequestStatus.UNSUBMITTED;
            } else if (SUBMITTED.toString().equals(value)) {
                return RequestStatus.SUBMITTED;
            } else if (ACCEPTED.toString().equals(value)) {
                return RequestStatus.ACCEPTED;
            } else if (REJECTED.toString().equals(value)) {
                return RequestStatus.REJECTED;
            } else if (CANCELLATION_REQUESTED.toString().equals(value)) {
                return RequestStatus.CANCELLATION_REQUESTED;
            } else if (CANCELLATION_ACCEPTED.toString().equals(value)) {
                return RequestStatus.CANCELLATION_ACCEPTED;
            }  else if (CANCELLATION_REJECTED.toString().equals(value)) {
                return RequestStatus.CANCELLATION_REJECTED;
            } else if (CLOSED.toString().equals(value)) {
                return RequestStatus.CLOSED;
            }

            throw new IllegalArgumentException(String.format(NO_MATCHING_ENUMS_ERROR_MESSAGE, value));
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private String id;

    @XmlElement(name = "shop_id")
    private String shopId;

    @XmlElement(name = "order_id")
    private String orderId;

    @XmlElement(name = "assigned_location_id")
    private String assignedLocationId;

    @XmlElement(name = "request_status")
    private String requestStatus;

    private String status;

    @XmlElement(name = "supported_actions")
    private List<String> supportedActions;

    private ShopifyDestination destination;

    @XmlElement(name = "line_items")
    private List<ShopifyFulfillmentLineItem> lineItems;

    @XmlElement(name = "fulfill_at")
    private String fulfillAt;

    @XmlElement(name = "fulfill_by")
    private String fulfillBy;

    @XmlElement(name = "international_duties")
    private ShopifyInternationalDuties internationalDuties;

    @XmlElement(name = "fulfillment_holds")
    private List<ShopifyFulfillmentHold> fulfillmentHolds;

    @XmlElement(name = "delivery_method")
    private ShopifyDeliveryMethod deliveryMethod;

    @XmlElement(name = "assigned_location")
    private ShopifyAssignedLocation assignedLocation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAssignedLocationId() {
        return assignedLocationId;
    }

    public void setAssignedLocationId(String assignedLocationId) {
        this.assignedLocationId = assignedLocationId;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getSupportedActions() {
        return supportedActions;
    }

    public void setSupportedActions(List<String> supportedActions) {
        this.supportedActions = supportedActions;
    }

    public ShopifyDestination getDestination() {
        return destination;
    }

    public void setDestination(ShopifyDestination destination) {
        this.destination = destination;
    }

    public List<ShopifyFulfillmentLineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<ShopifyFulfillmentLineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public String getFulfillAt() {
        return fulfillAt;
    }

    public void setFulfillAt(String fulfillAt) {
        this.fulfillAt = fulfillAt;
    }

    public String getFulfillBy() {
        return fulfillBy;
    }

    public void setFulfillBy(String fulfillBy) {
        this.fulfillBy = fulfillBy;
    }

    public ShopifyInternationalDuties getInternationalDuties() {
        return internationalDuties;
    }

    public void setInternationalDuties(ShopifyInternationalDuties internationalDuties) {
        this.internationalDuties = internationalDuties;
    }

    public ShopifyDeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(ShopifyDeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public ShopifyAssignedLocation getAssignedLocation() {
        return assignedLocation;
    }

    public void setAssignedLocation(ShopifyAssignedLocation assignedLocation) {
        this.assignedLocation = assignedLocation;
    }

    public List<ShopifyFulfillmentHold> getFulfillmentHolds() {
        return fulfillmentHolds;
    }

    public void setFulfillmentHolds(List<ShopifyFulfillmentHold> fulfillmentHolds) {
        this.fulfillmentHolds = fulfillmentHolds;
    }
}
