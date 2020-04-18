package com.mtit.assignment.buyerservice.repository;

import com.mtit.assignment.buyerservice.entity.Buyer;

import java.util.List;

public interface buyerRepository extends SuperRepository{

    public void create(Buyer s);
    public void update(Buyer s);
    public void delete(String id);
    public List find(String id);
    public List<Buyer> findAll();

}
