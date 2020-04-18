package com.mtit.assignment.order.orderservice.service;

import com.mtit.assignment.order.orderservice.dto.OrderRequest;
import com.mtit.assignment.order.orderservice.dto.OrderResponse;
import com.mtit.assignment.order.orderservice.dto.UserCreationRequest;
import com.mtit.assignment.order.orderservice.dto.UserCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class OrderServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public OrderResponse createOrder(OrderRequest orderRequest){

    var userCreationRequest = new UserCreationRequest();
    userCreationRequest.setItemName(orderRequest.getItemName());
    userCreationRequest.setQuantity(orderRequest.getQuantity());
    ResponseEntity<UserCreationResponse> userCreationResponse = restTemplate.postForEntity("http://localhost:8080/user",userCreationRequest,UserCreationResponse.class);

    var orderResponse = new OrderResponse();
    orderResponse.setItemId(UUID.randomUUID().toString());
    orderResponse.setCusId(userCreationResponse.getBody().getCusId());
    orderResponse.setMessage("Successfully Created Order");

    return orderResponse;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){

        return builder.build();
    }
}
