package com.mtit.assignment.sellerservice.controller;

import com.mtit.assignment.sellerservice.entity.ReturnValue;
import com.mtit.assignment.sellerservice.entity.Seller;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface sellerController {

    ResponseEntity<List<ReturnValue>> findAll();

    Seller Create(Seller seller);

    List<ReturnValue> update(String id , Seller seller);

    List<ReturnValue> delete(String s);

    List<ReturnValue> find( String id);


}
