package com.mtit.assignment.sellerservice.repository;

import org.hibernate.Session;

public interface SuperRepository {
    Session getSession();
}
