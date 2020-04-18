package com.mtit.assignment.cart.cartservice.controller;

import com.mtit.assignment.cart.cartservice.dto.UserRequest;
import com.mtit.assignment.cart.cartservice.dto.UserResponse;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@RestController
@RequestMapping("/cart")
public class CartController {

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody UserResponse createCart(@RequestBody UserRequest userRequest){

        System.out.println("Shopping Cart details : "+ userRequest);

        var userResponse = new UserResponse();
        userResponse.setCusId(UUID.randomUUID().toString());
        userResponse.setItemId(UUID.randomUUID().toString());
        userResponse.setMessage("Successfully created Shopping Cart");

        return userResponse;
    }
}
