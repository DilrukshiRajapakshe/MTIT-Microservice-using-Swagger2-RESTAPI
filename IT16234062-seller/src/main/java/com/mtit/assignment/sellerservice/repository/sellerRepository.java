package com.mtit.assignment.sellerservice.repository;

import com.mtit.assignment.sellerservice.entity.Seller;

import java.util.List;

public interface sellerRepository extends SuperRepository{

    public void create(Seller s);
    public void update(Seller s);
    public void delete(String id);
    public List find(String id);
    public List<Seller> findAll();

}
