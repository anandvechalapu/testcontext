package com.sacral.SC-10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.SC-10.entity.DailyDeliveryDetails;
import com.sacral.SC-10.repository.DailyDeliveryDetailsRepository;

@Service
public class DailyDeliveryDetailsService {

	@Autowired
	DailyDeliveryDetailsRepository dailyDeliveryDetailsRepository;
	
	public DailyDeliveryDetails findByDeliveryDate(String deliveryDate) {
		return dailyDeliveryDetailsRepository.findByDeliveryDate(deliveryDate);
	}
	
	public void deleteByDeliveryDate(String deliveryDate) {
		dailyDeliveryDetailsRepository.deleteByDeliveryDate(deliveryDate);
	}
	
	public DailyDeliveryDetails findByTitle(String title) {
		return dailyDeliveryDetailsRepository.findByTitle(title);
	}
	
	public void deleteByTitle(String title) {
		dailyDeliveryDetailsRepository.deleteByTitle(title);
	}
	
	public DailyDeliveryDetails findByDeliveryQuantity(int deliveryQuantity) {
		return dailyDeliveryDetailsRepository.findByDeliveryQuantity(deliveryQuantity);
	}
	
	public void deleteByDeliveryQuantity(int deliveryQuantity) {
		dailyDeliveryDetailsRepository.deleteByDeliveryQuantity(deliveryQuantity);
	}
	
	public DailyDeliveryDetails findByRRP(double RRP) {
		return dailyDeliveryDetailsRepository.findByRRP(RRP);
	}
	
	public void deleteByRRP(double RRP) {
		dailyDeliveryDetailsRepository.deleteByRRP(RRP);
	}
	
	public DailyDeliveryDetails findByDeliveryStatus(String deliveryStatus) {
		return dailyDeliveryDetailsRepository.findByDeliveryStatus(deliveryStatus);
	}
	
	public void deleteByDeliveryStatus(String deliveryStatus) {
		dailyDeliveryDetailsRepository.deleteByDeliveryStatus(deliveryStatus);
	}
	
	public DailyDeliveryDetails findByExpectedDeliveryTimeAndDate(String expectedDeliveryTimeAndDate) {
		return dailyDeliveryDetailsRepository.findByExpectedDeliveryTimeAndDate(expectedDeliveryTimeAndDate);
	}
	
	public void deleteByExpectedDeliveryTimeAndDate(String expectedDeliveryTimeAndDate) {
		dailyDeliveryDetailsRepository.deleteByExpectedDeliveryTimeAndDate(expectedDeliveryTimeAndDate);
	}
	
	public DailyDeliveryDetails findByNotificationsForDeliveryProcess(String notificationsForDeliveryProcess) {
		return dailyDeliveryDetailsRepository.findByNotificationsForDeliveryProcess(notificationsForDeliveryProcess);
	}
	
	public void deleteByNotificationsForDeliveryProcess(String notificationsForDeliveryProcess) {
		dailyDeliveryDetailsRepository.deleteByNotificationsForDeliveryProcess(notificationsForDeliveryProcess);
	}
	
	public List<DailyDeliveryDetails> getAllDailyDeliveryDetails(){
		return dailyDeliveryDetailsRepository.findAll();
	}
	
	public void saveDailyDeliveryDetails(DailyDeliveryDetails dailyDeliveryDetails) {
		dailyDeliveryDetailsRepository.save(dailyDeliveryDetails);
	}
	
	public void deleteDailyDeliveryDetails(DailyDeliveryDetails dailyDeliveryDetails) {
		dailyDeliveryDetailsRepository.delete(dailyDeliveryDetails);
	}
}