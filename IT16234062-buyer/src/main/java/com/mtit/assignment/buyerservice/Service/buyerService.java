package com.mtit.assignment.buyerservice.Service;

import com.mtit.assignment.buyerservice.entity.Buyer;

import java.util.List;

public interface buyerService {

    public void create(Buyer s);
    public void update(Buyer s );
    public void delete(String id);
    public List find(String id);
    public List<Buyer> findAll();

}
