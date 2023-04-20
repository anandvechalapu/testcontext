package com.sacral.SC-10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.SC-10.entity.DailyDeliveryDetails;

@Repository
public interface DailyDeliveryDetailsRepository extends JpaRepository<DailyDeliveryDetails, Long> {
	
	DailyDeliveryDetails findByDeliveryDate(String deliveryDate);
	
	void deleteByDeliveryDate(String deliveryDate);
	
	DailyDeliveryDetails findByTitle(String title);
	
	void deleteByTitle(String title);
	
	DailyDeliveryDetails findByDeliveryQuantity(int deliveryQuantity);
	
	void deleteByDeliveryQuantity(int deliveryQuantity);
	
	DailyDeliveryDetails findByRRP(double RRP);
	
	void deleteByRRP(double RRP);
	
	DailyDeliveryDetails findByDeliveryStatus(String deliveryStatus);
	
	void deleteByDeliveryStatus(String deliveryStatus);
	
	DailyDeliveryDetails findByExpectedDeliveryTimeAndDate(String expectedDeliveryTimeAndDate);
	
	void deleteByExpectedDeliveryTimeAndDate(String expectedDeliveryTimeAndDate);
	
	DailyDeliveryDetails findByNotificationsForDeliveryProcess(String notificationsForDeliveryProcess);
	
	void deleteByNotificationsForDeliveryProcess(String notificationsForDeliveryProcess);

}