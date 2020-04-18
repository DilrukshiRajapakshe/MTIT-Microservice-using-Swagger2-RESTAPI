package com.mtit.assignment.paymentservice.Service.impl;

import com.mtit.assignment.paymentservice.Service.paymentService;
import com.mtit.assignment.paymentservice.entity.Payment;
import com.mtit.assignment.paymentservice.repository.impl.PaymentRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class PaymentServiceImpl implements paymentService {

    private PaymentRepositoryImpl impl;

    @Autowired
    public PaymentServiceImpl(PaymentRepositoryImpl impl) {
        this.impl = impl;
    }

    @Override
    public void create(Payment s) {
        impl.create(s);
    }

    @Override
    public void update(Payment s) {
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
    public List<Payment> findAll() {
        return impl.findAll();
    }
}
