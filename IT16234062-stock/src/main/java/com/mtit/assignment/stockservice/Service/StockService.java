package com.mtit.assignment.stockservice.Service;

import com.mtit.assignment.stockservice.entity.Stock;

import java.util.List;

public interface StockService {

    public void create(Stock s);
    public void update(Stock s );
    public void delete(String id);
    public List find(String id);
    public List<Stock> findAll();

}
