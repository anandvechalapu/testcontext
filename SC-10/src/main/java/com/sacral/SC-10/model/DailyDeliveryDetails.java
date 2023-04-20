package com.sacral.SC-10.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DailyDeliveryDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String deliveryDate;
	private String title;
	private int deliveryQuantity;
	private double RRP;
	private String deliveryStatus;
	private String expectedDeliveryTimeAndDate;
	private String notificationsForDeliveryProcess;
	
	public DailyDeliveryDetails() {
		
	}
	
	public DailyDeliveryDetails(String deliveryDate, String title, int deliveryQuantity, double RRP,
			String deliveryStatus, String expectedDeliveryTimeAndDate, String notificationsForDeliveryProcess) {
		this.deliveryDate = deliveryDate;
		this.title = title;
		this.deliveryQuantity = deliveryQuantity;
		this.RRP = RRP;
		this.deliveryStatus = deliveryStatus;
		this.expectedDeliveryTimeAndDate = expectedDeliveryTimeAndDate;
		this.notificationsForDeliveryProcess = notificationsForDeliveryProcess;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDeliveryQuantity() {
		return deliveryQuantity;
	}

	public void setDeliveryQuantity(int deliveryQuantity) {
		this.deliveryQuantity = deliveryQuantity;
	}

	public double getRRP() {
		return RRP;
	}

	public void setRRP(double rRP) {
		RRP = rRP;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getExpectedDeliveryTimeAndDate() {
		return expectedDeliveryTimeAndDate;
	}

	public void setExpectedDeliveryTimeAndDate(String expectedDeliveryTimeAndDate) {
		this.expectedDeliveryTimeAndDate = expectedDeliveryTimeAndDate;
	}

	public String getNotificationsForDeliveryProcess() {
		return notificationsForDeliveryProcess;
	}

	public void setNotificationsForDeliveryProcess(String notificationsForDeliveryProcess) {
		this.notificationsForDeliveryProcess = notificationsForDeliveryProcess;
	}
	
	
	

}