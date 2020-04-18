package com.mtit.assignment.stockservice.controller;

import com.mtit.assignment.stockservice.dbo.StockRequest;
import com.mtit.assignment.stockservice.dbo.StockResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/stocks")
public class StockController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    StockResponse createStock(@RequestBody StockRequest stockRequest){

        System.out.println("Stock Details : "+ stockRequest);

        var stockResponse = new StockResponse();
        stockResponse.setStockId(UUID.randomUUID().toString());
        stockResponse.setMessage("Successfully added the Stock");

        return stockResponse;


    }
}
