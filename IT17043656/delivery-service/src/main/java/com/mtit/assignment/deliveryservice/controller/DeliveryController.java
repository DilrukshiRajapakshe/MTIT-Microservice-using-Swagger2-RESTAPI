package com.mtit.assignment.deliveryservice.controller;

import com.mtit.assignment.deliveryservice.dto.DeliveryRequest;
import com.mtit.assignment.deliveryservice.dto.DeliveryResponse;
import com.mtit.assignment.deliveryservice.service.DeliverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    @Autowired
    private DeliverServiceImpl deliverService;
    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody DeliveryResponse createDelivery(@RequestBody DeliveryRequest request){
        System.out.println("Delivery Details : " + request);
        return deliverService.createDeliver(request);
    }


}
