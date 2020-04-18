package com.mtit.assignment.buyerservice.controller;

import com.mtit.assignment.buyerservice.entity.ReturnValue;
import com.mtit.assignment.buyerservice.entity.Buyer;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface buyerController {

    ResponseEntity<List<ReturnValue>> findAll();

    Buyer Create(Buyer buyer);

    List<ReturnValue> update(String id , Buyer buyer);

    List<ReturnValue> delete(String s);

    List<ReturnValue> find( String id);


}
