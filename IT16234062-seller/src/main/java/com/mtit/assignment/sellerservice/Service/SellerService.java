package com.mtit.assignment.sellerservice.Service;

import com.mtit.assignment.sellerservice.entity.Seller;

import java.util.List;

public interface SellerService {

    public void create(Seller s);
    public void update(Seller s );
    public void delete(String id);
    public List find(String id);
    public List<Seller> findAll();

}
