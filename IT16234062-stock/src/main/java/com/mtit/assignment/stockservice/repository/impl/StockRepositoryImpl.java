package com.mtit.assignment.stockservice.repository.impl;

import com.mtit.assignment.stockservice.entity.Stock;
import com.mtit.assignment.stockservice.repository.stockRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StockRepositoryImpl implements stockRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public void create(Stock s) {
        getSession().save(s);
    }

    @Override
    public void update(Stock s) {
        getSession().update(s);
    }

    @Override
    public void delete(String id) {
        getSession().delete(getSession().load(Stock.class, id));
    }

    @Override
    public List find(String id) {
        Query qu = getSession().createQuery("FROM Stock s where s.id = :id" );
        qu.setParameter("id",id);
        return qu.list();
    }

    @Override
    public List<Stock> findAll() {
        Query qu = getSession().createQuery("SELECT s FROM Stock s" );
        return qu.list();
    }
}
