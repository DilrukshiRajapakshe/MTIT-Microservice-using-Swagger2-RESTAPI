package com.mtit.assignment.locationservice.controller;

import com.mtit.assignment.locationservice.dto.LocationRequest;
import com.mtit.assignment.locationservice.dto.LocationResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/locations")
public class LocationController {

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody LocationResponse createLocation(@RequestBody LocationRequest locationRequest){

        System.out.println("Location Details" + locationRequest);

        var locationResponse = new LocationResponse();
        locationResponse.setLocationId(UUID.randomUUID().toString());
        locationResponse.setLocationAddress("Gampaha");
        locationResponse.setCustomerName("D.A.M Disanayake");

        return locationResponse;
    }
}
