package com.mtit.assignment.buyerservice.entity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.Entity;
import javax.persistence.Id;


@EntityListeners(AuditingEntityListener.class)
@Entity
public class Buyer extends SuperEntity{
    @Id
    private String id;
    private String name;
    private String phone;

    public Buyer(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public Buyer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
