package com.mtit.assignment.sellerservice.repository.impl;

import com.mtit.assignment.sellerservice.entity.Seller;
import com.mtit.assignment.sellerservice.repository.sellerRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class sellerRepositoryImpl implements sellerRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public void create(Seller s) {
        getSession().save(s);
    }

    @Override
    public void update(Seller s) {
        getSession().update(s);
    }

    @Override
    public void delete(String id) {
        getSession().delete(getSession().load(Seller.class, id));
    }

    @Override
    public List find(String id) {
        Query qu = getSession().createQuery("FROM Seller s where s.id = :id" );
        qu.setParameter("id",id);
        return qu.list();
    }

    @Override
    public List<Seller> findAll() {
        Query qu = getSession().createQuery("SELECT s FROM Seller s" );
        return qu.list();
    }
}
