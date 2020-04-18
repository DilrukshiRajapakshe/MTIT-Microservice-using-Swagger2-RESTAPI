package com.mtit.assignment.productservice.controller;


import com.mtit.assignment.productservice.dbo.ProductRequest;
import com.mtit.assignment.productservice.dbo.ProductResponse;
import com.mtit.assignment.productservice.dbo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @PostMapping (consumes = "application/json" , produces = "application/json")
    public @ResponseBody
    ProductResponse createOrder(@RequestBody ProductRequest request){

        System.out.println("Product Details : "+ request);
        return productService.createProduct(request);

    }

}
