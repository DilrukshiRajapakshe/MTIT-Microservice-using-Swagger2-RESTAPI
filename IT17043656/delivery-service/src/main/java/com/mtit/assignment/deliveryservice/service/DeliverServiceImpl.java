package com.mtit.assignment.deliveryservice.service;
import com.mtit.assignment.deliveryservice.dto.DeliveryRequest;
import com.mtit.assignment.deliveryservice.dto.DeliveryResponse;
import com.mtit.assignment.deliveryservice.dto.LocationCreationRequest;
import com.mtit.assignment.deliveryservice.dto.LocationCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;
@Service
public class DeliverServiceImpl {
    @Autowired
    private RestTemplate restTemplate;

    public DeliveryResponse createDeliver(DeliveryRequest deliveryRequest){

        var locationCreationRequest = new LocationCreationRequest();
        locationCreationRequest.setAge(deliveryRequest.getAge());
        locationCreationRequest.setFullName(deliveryRequest.getFullName());
        ResponseEntity<LocationCreationResponse> locationCreationResponse =
                restTemplate.postForEntity("http://localhost:8182/locations",locationCreationRequest, LocationCreationResponse.class);
        var deliveryResponse = new  DeliveryResponse();
        deliveryResponse.setDeliveryId(UUID.randomUUID().toString());
        deliveryResponse.setProductId("P001");
        deliveryResponse.setLocationId(locationCreationResponse.getBody().getLocationId());
        deliveryResponse.setDeliveryDate("13/05/2020");
        deliveryResponse.setDeliveryDescription("This is an important item please deliver this item quickly.");
        deliveryResponse.setCustomerName(locationCreationResponse.getBody().getCustomerName());
        return deliveryResponse;
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
