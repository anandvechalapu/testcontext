package com.sacral.SC-78.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.SC-78.entity.DailyDeliveryDetails;
import com.sacral.SC-78.service.DailyDeliveryDetailsService;

@RestController
public class DailyDeliveryDetailsController {

    @Autowired
    private DailyDeliveryDetailsService dailyDeliveryDetailsService;

    @GetMapping("/DailyDeliveryDetails/title/{title}")
    public List<DailyDeliveryDetails> findByTitleContaining(@PathVariable String title) {
        return dailyDeliveryDetailsService.findByTitleContaining(title);
    }

    @GetMapping("/DailyDeliveryDetails/RRP/{RRP}")
    public List<DailyDeliveryDetails> findByRRPContaining(@PathVariable String RRP) {
        return dailyDeliveryDetailsService.findByRRPContaining(RRP);
    }

    @GetMapping("/DailyDeliveryDetails/deliveredQuantity/{deliveredQuantity}")
    public List<DailyDeliveryDetails> findByDeliveredQuantityContaining(@PathVariable String deliveredQuantity) {
        return dailyDeliveryDetailsService.findByDeliveredQuantityContaining(deliveredQuantity);
    }

    @GetMapping("/DailyDeliveryDetails/deliveryStatus/{deliveryStatus}")
    public List<DailyDeliveryDetails> findByDeliveryStatusContaining(@PathVariable String deliveryStatus) {
        return dailyDeliveryDetailsService.findByDeliveryStatusContaining(deliveryStatus);
    }

    @GetMapping("/DailyDeliveryDetails/deliveryTime/{deliveryTime}")
    public List<DailyDeliveryDetails> findByDeliveryTimeContaining(@PathVariable String deliveryTime) {
        return dailyDeliveryDetailsService.findByDeliveryTimeContaining(deliveryTime);
    }

    @GetMapping("/DailyDeliveryDetails/expectedDeliveryTimeAndDate/{expectedDeliveryTimeAndDate}")
    public List<DailyDeliveryDetails> findByExpectedDeliveryTimeAndDateContaining(@PathVariable String expectedDeliveryTimeAndDate) {
        return dailyDeliveryDetailsService.findByExpectedDeliveryTimeAndDateContaining(expectedDeliveryTimeAndDate);
    }

    @DeleteMapping("/DailyDeliveryDetails/title/{title}")
    public void deleteByTitle(@PathVariable String title) {
        dailyDeliveryDetailsService.deleteByTitle(title);
    }

    @DeleteMapping("/DailyDeliveryDetails/RRP/{RRP}")
    public void deleteByRRP(@PathVariable String RRP) {
        dailyDeliveryDetailsService.deleteByRRP(RRP);
    }

    @DeleteMapping("/DailyDeliveryDetails/deliveredQuantity/{deliveredQuantity}")
    public void deleteByDeliveredQuantity(@PathVariable String deliveredQuantity) {
        dailyDeliveryDetailsService.deleteByDeliveredQuantity(deliveredQuantity);
    }

    @DeleteMapping("/DailyDeliveryDetails/deliveryStatus/{deliveryStatus}")
    public void deleteByDeliveryStatus(@PathVariable String deliveryStatus) {
        dailyDeliveryDetailsService.deleteByDeliveryStatus(deliveryStatus);
    }

    @DeleteMapping("/DailyDeliveryDetails/deliveryTime/{deliveryTime}")
    public void deleteByDeliveryTime(@PathVariable String deliveryTime) {
        dailyDeliveryDetailsService.deleteByDeliveryTime(deliveryTime);
    }

    @DeleteMapping("/DailyDeliveryDetails/expectedDeliveryTimeAndDate/{expectedDeliveryTimeAndDate}")
    public void deleteByExpectedDeliveryTimeAndDate(@PathVariable String expectedDeliveryTimeAndDate) {
        dailyDeliveryDetailsService.deleteByExpectedDeliveryTimeAndDate(expectedDeliveryTimeAndDate);
    }

}