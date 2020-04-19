package com.mtit.assignment.stockservice.Service.impl;

import com.mtit.assignment.stockservice.Service.StockService;
import com.mtit.assignment.stockservice.entity.Stock;
import com.mtit.assignment.stockservice.repository.impl.StockRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class StockServiceImpl implements StockService {

    private StockRepositoryImpl impl;

    @Autowired
    public StockServiceImpl(StockRepositoryImpl impl) {
        this.impl = impl;
    }

    @Override
    public void create(Stock s) {
        impl.create(s);
    }

    @Override
    public void update(Stock s) {
        impl.update(s);
    }

    @Override
    public void delete(String id) {
        impl.delete(id);
    }

    @Override
    public List find(String id) {
        return impl.find(id);
    }

    @Override
    public List<Stock> findAll() {
        return impl.findAll();
    }
}
