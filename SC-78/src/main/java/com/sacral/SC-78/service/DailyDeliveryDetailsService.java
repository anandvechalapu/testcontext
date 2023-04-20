package com.sacral.SC-78.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.SC-78.entity.DailyDeliveryDetails;
import com.sacral.SC-78.repository.DailyDeliveryDetailsRepository;

@Service
public class DailyDeliveryDetailsService {

    @Autowired
    private DailyDeliveryDetailsRepository dailyDeliveryDetailsRepository;

    public List<DailyDeliveryDetails> findByTitleContaining(String title) {
        return dailyDeliveryDetailsRepository.findByTitleContaining(title);
    }

    public List<DailyDeliveryDetails> findByRRPContaining(String RRP) {
        return dailyDeliveryDetailsRepository.findByRRPContaining(RRP);
    }

    public List<DailyDeliveryDetails> findByDeliveredQuantityContaining(String deliveredQuantity) {
        return dailyDeliveryDetailsRepository.findByDeliveredQuantityContaining(deliveredQuantity);
    }

    public List<DailyDeliveryDetails> findByDeliveryStatusContaining(String deliveryStatus) {
        return dailyDeliveryDetailsRepository.findByDeliveryStatusContaining(deliveryStatus);
    }

    public List<DailyDeliveryDetails> findByDeliveryTimeContaining(String deliveryTime) {
        return dailyDeliveryDetailsRepository.findByDeliveryTimeContaining(deliveryTime);
    }

    public List<DailyDeliveryDetails> findByExpectedDeliveryTimeAndDateContaining(String expectedDeliveryTimeAndDate) {
        return dailyDeliveryDetailsRepository.findByExpectedDeliveryTimeAndDateContaining(expectedDeliveryTimeAndDate);
    }

    public void deleteByTitle(String title) {
        dailyDeliveryDetailsRepository.deleteByTitle(title);
    }

    public void deleteByRRP(String RRP) {
        dailyDeliveryDetailsRepository.deleteByRRP(RRP);
    }

    public void deleteByDeliveredQuantity(String deliveredQuantity) {
        dailyDeliveryDetailsRepository.deleteByDeliveredQuantity(deliveredQuantity);
    }

    public void deleteByDeliveryStatus(String deliveryStatus) {
        dailyDeliveryDetailsRepository.deleteByDeliveryStatus(deliveryStatus);
    }

    public void deleteByDeliveryTime(String deliveryTime) {
        dailyDeliveryDetailsRepository.deleteByDeliveryTime(deliveryTime);
    }

    public void deleteByExpectedDeliveryTimeAndDate(String expectedDeliveryTimeAndDate) {
        dailyDeliveryDetailsRepository.deleteByExpectedDeliveryTimeAndDate(expectedDeliveryTimeAndDate);
    }
}