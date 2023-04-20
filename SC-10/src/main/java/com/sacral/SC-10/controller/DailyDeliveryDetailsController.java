package com.sacral.SC-10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SC-10.entity.DailyDeliveryDetails;
import com.sacral.SC-10.service.DailyDeliveryDetailsService;

@RestController
public class DailyDeliveryDetailsController {

	@Autowired
	DailyDeliveryDetailsService dailyDeliveryDetailsService;
	
	@GetMapping("/dailyDeliveryDetails/{deliveryDate}")
	public DailyDeliveryDetails getDailyDeliveryDetailsByDeliveryDate(@PathVariable String deliveryDate) {
		return dailyDeliveryDetailsService.findByDeliveryDate(deliveryDate);
	}
	
	@DeleteMapping("/dailyDeliveryDetails/{deliveryDate}")
	public void deleteDailyDeliveryDetailsByDeliveryDate(@PathVariable String deliveryDate) {
		dailyDeliveryDetailsService.deleteByDeliveryDate(deliveryDate);
	}
	
	@GetMapping("/dailyDeliveryDetails/title/{title}")
	public DailyDeliveryDetails getDailyDeliveryDetailsByTitle(@PathVariable String title) {
		return dailyDeliveryDetailsService.findByTitle(title);
	}
	
	@DeleteMapping("/dailyDeliveryDetails/title/{title}")
	public void deleteDailyDeliveryDetailsByTitle(@PathVariable String title) {
		dailyDeliveryDetailsService.deleteByTitle(title);
	}
	
	@GetMapping("/dailyDeliveryDetails/deliveryQuantity/{deliveryQuantity}")
	public DailyDeliveryDetails getDailyDeliveryDetailsByDeliveryQuantity(@PathVariable int deliveryQuantity) {
		return dailyDeliveryDetailsService.findByDeliveryQuantity(deliveryQuantity);
	}
	
	@DeleteMapping("/dailyDeliveryDetails/deliveryQuantity/{deliveryQuantity}")
	public void deleteDailyDeliveryDetailsByDeliveryQuantity(@PathVariable int deliveryQuantity) {
		dailyDeliveryDetailsService.deleteByDeliveryQuantity(deliveryQuantity);
	}
	
	@GetMapping("/dailyDeliveryDetails/RRP/{RRP}")
	public DailyDeliveryDetails getDailyDeliveryDetailsByRRP(@PathVariable double RRP) {
		return dailyDeliveryDetailsService.findByRRP(RRP);
	}
	
	@DeleteMapping("/dailyDeliveryDetails/RRP/{RRP}")
	public void deleteDailyDeliveryDetailsByRRP(@PathVariable double RRP) {
		dailyDeliveryDetailsService.deleteByRRP(RRP);
	}
	
	@GetMapping("/dailyDeliveryDetails/deliveryStatus/{deliveryStatus}")
	public DailyDeliveryDetails getDailyDeliveryDetailsByDeliveryStatus(@PathVariable String deliveryStatus) {
		return dailyDeliveryDetailsService.findByDeliveryStatus(deliveryStatus);
	}
	
	@DeleteMapping("/dailyDeliveryDetails/deliveryStatus/{deliveryStatus}")
	public void deleteDailyDeliveryDetailsByDeliveryStatus(@PathVariable String deliveryStatus) {
		dailyDeliveryDetailsService.deleteByDeliveryStatus(deliveryStatus);
	}
	
	@GetMapping("/dailyDeliveryDetails/expectedDeliveryTimeAndDate/{expectedDeliveryTimeAndDate}")
	public DailyDeliveryDetails getDailyDeliveryDetailsByExpectedDeliveryTimeAndDate(@PathVariable String expectedDeliveryTimeAndDate) {
		return dailyDeliveryDetailsService.findByExpectedDeliveryTimeAndDate(expectedDeliveryTimeAndDate);
	}
	
	@DeleteMapping("/dailyDeliveryDetails/expectedDeliveryTimeAndDate/{expectedDeliveryTimeAndDate}")
	public void deleteDailyDeliveryDetailsByExpectedDeliveryTimeAndDate(@PathVariable String expectedDeliveryTimeAndDate) {
		dailyDeliveryDetailsService.deleteByExpectedDeliveryTimeAndDate(expectedDeliveryTimeAndDate);
	}
	
	@GetMapping("/dailyDeliveryDetails/notificationsForDeliveryProcess/{notificationsForDeliveryProcess