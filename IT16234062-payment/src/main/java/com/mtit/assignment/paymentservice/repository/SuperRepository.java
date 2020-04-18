package com.mtit.assignment.paymentservice.repository;

import org.hibernate.Session;

public interface SuperRepository {
    Session getSession();
}
