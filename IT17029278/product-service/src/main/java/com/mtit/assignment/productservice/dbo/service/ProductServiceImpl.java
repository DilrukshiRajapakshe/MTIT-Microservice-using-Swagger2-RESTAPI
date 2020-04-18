package com.mtit.assignment.productservice.dbo.service;

import com.mtit.assignment.productservice.dbo.ProductRequest;
import com.mtit.assignment.productservice.dbo.ProductResponse;
import com.mtit.assignment.productservice.dbo.StockCreationRequest;
import com.mtit.assignment.productservice.dbo.StockCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class ProductServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public ProductResponse createProduct(ProductRequest productRequest){


        var stockCreationRequest = new StockCreationRequest();
        stockCreationRequest.setProductName(productRequest.getProductName());
        stockCreationRequest.setProductType(productRequest.getProductType());
        ResponseEntity<StockCreationResponse> stockCreationResponse = restTemplate.postForEntity("http://localhost:8484/stocks", stockCreationRequest, StockCreationResponse.class);

        var productResponse = new ProductResponse();
        productResponse.setProductId(UUID.randomUUID().toString());
        productResponse.setStockId(stockCreationResponse.getBody().getStockId());
        productResponse.setStockName(stockCreationResponse.getBody().toString());
        productResponse.setMessage("Successfully added the Product");

        return productResponse;
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
