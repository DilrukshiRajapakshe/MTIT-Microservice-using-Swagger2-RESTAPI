package com.mtit.assignment.sellerservice.Service.impl;

import com.mtit.assignment.sellerservice.Service.SellerService;
import com.mtit.assignment.sellerservice.entity.Seller;
import com.mtit.assignment.sellerservice.repository.impl.sellerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class SellerServiceImpl  implements SellerService {

    private sellerRepositoryImpl impl;

    @Autowired
    public SellerServiceImpl(sellerRepositoryImpl impl) {
        this.impl = impl;
    }

    @Override
    public void create(Seller s) {
        impl.create(s);
    }

    @Override
    public void update(Seller s) {
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
    public List<Seller> findAll() {
        return impl.findAll();
    }
}
