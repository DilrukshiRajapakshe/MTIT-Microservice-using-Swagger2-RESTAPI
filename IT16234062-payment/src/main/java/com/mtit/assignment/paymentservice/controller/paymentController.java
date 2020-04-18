package com.mtit.assignment.paymentservice.controller;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.mtit.assignment.paymentservice.entity.Payment;
import com.mtit.assignment.paymentservice.entity.ReturnValue;
import com.mtit.assignment.paymentservice.entity.ConnectionEntity;
import com.mtit.assignment.paymentservice.entity.CreateReturnValue;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface paymentController {

    ResponseEntity<List<ReturnValue>> findAll();

    List<CreateReturnValue> Create(ConnectionEntity connectionEntity) throws MismatchedInputException;

    List<ReturnValue> update(String id , Payment payment);

    List<ReturnValue> delete(String s);

    List<ReturnValue> find( String id);


}
