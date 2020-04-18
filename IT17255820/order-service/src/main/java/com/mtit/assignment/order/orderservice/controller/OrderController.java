package com.mtit.assignment.order.orderservice.controller;

import com.mtit.assignment.order.orderservice.dto.OrderRequest;
import com.mtit.assignment.order.orderservice.dto.OrderResponse;
import com.mtit.assignment.order.orderservice.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    OrderResponse createOrder(@RequestBody OrderRequest request){

        System.out.println("Details about Order : "+request);

        var orderResponse = new OrderResponse();
        orderResponse.setItemId(UUID.randomUUID().toString());
        orderResponse.setCusId(UUID.randomUUID().toString());
        orderResponse.setMessage("Order Created Successfully ..!!");

        return orderResponse;
    }

}
