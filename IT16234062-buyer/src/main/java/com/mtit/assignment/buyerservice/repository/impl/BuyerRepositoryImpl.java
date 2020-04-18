package com.mtit.assignment.buyerservice.repository.impl;

import com.mtit.assignment.buyerservice.entity.Buyer;
import com.mtit.assignment.buyerservice.repository.buyerRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BuyerRepositoryImpl implements buyerRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public void create(Buyer s) {
        getSession().save(s);
    }

    @Override
    public void update(Buyer s) {
        getSession().update(s);
    }

    @Override
    public void delete(String id) {
        getSession().delete(getSession().load(Buyer.class, id));
    }

    @Override
    public List find(String id) {
        Query qu = getSession().createQuery("FROM Buyer s where s.id = :id" );
        qu.setParameter("id",id);
        return qu.list();
    }

    @Override
    public List<Buyer> findAll() {
        Query qu = getSession().createQuery("SELECT s FROM Buyer s" );
        return qu.list();
    }
}
