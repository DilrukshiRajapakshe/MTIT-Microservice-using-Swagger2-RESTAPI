package com.mtit.assignment.paymentservice.repository;

import com.mtit.assignment.paymentservice.entity.Payment;

import java.util.List;

public interface paymentRepository extends SuperRepository{

    public void create(Payment s);
    public void update(Payment s);
    public void delete(String id);
    public List find(String id);
    public List<Payment> findAll();

}
