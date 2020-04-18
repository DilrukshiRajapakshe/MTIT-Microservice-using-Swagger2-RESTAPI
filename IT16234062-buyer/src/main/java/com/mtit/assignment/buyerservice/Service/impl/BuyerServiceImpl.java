package com.mtit.assignment.buyerservice.Service.impl;

import com.mtit.assignment.buyerservice.Service.buyerService;
import com.mtit.assignment.buyerservice.entity.Buyer;
import com.mtit.assignment.buyerservice.repository.impl.BuyerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class BuyerServiceImpl implements buyerService {

    private BuyerRepositoryImpl impl;

    @Autowired
    public BuyerServiceImpl(BuyerRepositoryImpl impl) {
        this.impl = impl;
    }

    @Override
    public void create(Buyer s) {
        impl.create(s);
    }

    @Override
    public void update(Buyer s) {
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
    public List<Buyer> findAll() {
        return impl.findAll();
    }
}
