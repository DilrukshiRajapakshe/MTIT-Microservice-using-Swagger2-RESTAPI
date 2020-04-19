package com.mtit.assignment.stockservice.controller;

import com.mtit.assignment.stockservice.entity.ReturnValue;
import com.mtit.assignment.stockservice.entity.Stock;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface stockController {

    ResponseEntity<List<ReturnValue>> findAll();

   Stock Create(Stock stock);

//    void Create(Stock stock);

    List<ReturnValue> update(String id , Stock stock);

    List<ReturnValue> delete(String s);

    List<ReturnValue> find( String id);


}
