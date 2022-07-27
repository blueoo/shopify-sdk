package com.shopify.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @CLassname ShopifyProductListRequest
 * @Description 获取产品列表
 * @Author blueo
 * @Date 2022/7/5 16:41
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.ALWAYS)
public class ShopifyProductListRequest {

    @XmlElement(name = "collection_id")
    private String collectionId;

    @XmlElement(name = "created_at_max")
    private DateTime createdAtMax;

    @XmlElement(name = "created_at_max")
    private DateTime createdAtMin;

    private String ids;

    @XmlElement(name = "published_at_max")
    private DateTime publishedAtMax;

    @XmlElement(name = "published_at_min")
    private DateTime publishedAtMin;

    @XmlElement(name = "published_status")
    private String publishedStatus;

    private String status;

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public DateTime getCreatedAtMax() {
        return createdAtMax;
    }

    public void setCreatedAtMax(DateTime createdAtMax) {
        this.createdAtMax = createdAtMax;
    }

    public DateTime getCreatedAtMin() {
        return createdAtMin;
    }

    public void setCreatedAtMin(DateTime createdAtMin) {
        this.createdAtMin = createdAtMin;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public DateTime getPublishedAtMax() {
        return publishedAtMax;
    }

    public void setPublishedAtMax(DateTime publishedAtMax) {
        this.publishedAtMax = publishedAtMax;
    }

    public DateTime getPublishedAtMin() {
        return publishedAtMin;
    }

    public void setPublishedAtMin(DateTime publishedAtMin) {
        this.publishedAtMin = publishedAtMin;
    }

    public String getPublishedStatus() {
        return publishedStatus;
    }

    public void setPublishedStatus(String publishedStatus) {
        this.publishedStatus = publishedStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
