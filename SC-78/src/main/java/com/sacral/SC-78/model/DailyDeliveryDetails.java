package com.sacral.SC-78.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DailyDeliveryDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String RRP;
    private String deliveredQuantity;
    private String deliveryStatus;
    private String deliveryTime;
    private String expectedDeliveryTimeAndDate;

    public DailyDeliveryDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRRP() {
        return RRP;
    }

    public void setRRP(String RRP) {
        this.RRP = RRP;
    }

    public String getDeliveredQuantity() {
        return deliveredQuantity;
    }

    public void setDeliveredQuantity(String deliveredQuantity) {
        this.deliveredQuantity = deliveredQuantity;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getExpectedDeliveryTimeAndDate() {
        return expectedDeliveryTimeAndDate;
    }

    public void setExpectedDeliveryTimeAndDate(String expectedDeliveryTimeAndDate) {
        this.expectedDeliveryTimeAndDate = expectedDeliveryTimeAndDate;
    }

}