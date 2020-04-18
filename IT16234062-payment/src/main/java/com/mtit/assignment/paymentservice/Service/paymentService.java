package com.mtit.assignment.paymentservice.Service;

import com.mtit.assignment.paymentservice.entity.Payment;

import java.util.List;

public interface paymentService {

    public void create(Payment s);
    public void update(Payment s );
    public void delete(String id);
    public List find(String id);
    public List<Payment> findAll();

}
