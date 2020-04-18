package com.mtit.assignment.paymentservice.repository.impl;

import com.mtit.assignment.paymentservice.entity.Payment;
import com.mtit.assignment.paymentservice.repository.paymentRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentRepositoryImpl implements paymentRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public void create(Payment s) {
        getSession().save(s);
    }

    @Override
    public void update(Payment s) {
        getSession().update(s);
    }

    @Override
    public void delete(String id) {
        getSession().delete(getSession().load(Payment.class, id));
    }

    @Override
    public List find(String id) {
        Query qu = getSession().createQuery("FROM Payment s where s.id = :id" );
        qu.setParameter("id",id);
        return qu.list();
    }

    @Override
    public List<Payment> findAll() {
        Query qu = getSession().createQuery("SELECT s FROM Payment s" );
        return qu.list();
    }
}
