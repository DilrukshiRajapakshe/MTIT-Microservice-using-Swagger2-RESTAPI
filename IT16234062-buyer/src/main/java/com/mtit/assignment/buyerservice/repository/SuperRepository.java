package com.mtit.assignment.buyerservice.repository;

import org.hibernate.Session;

public interface SuperRepository {
    Session getSession();
}
