package com.mtit.assignment.stockservice.repository;

import org.hibernate.Session;

public interface SuperRepository {
    Session getSession();
}
