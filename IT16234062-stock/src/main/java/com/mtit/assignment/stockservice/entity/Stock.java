package com.mtit.assignment.stockservice.entity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.Entity;
import javax.persistence.Id;


@EntityListeners(AuditingEntityListener.class)
@Entity
public class Stock extends SuperEntity{
    @Id
    private String id;
    private double price;
    private int available;

    public Stock() {
    }

    public Stock(String id, double price, int available) {
        this.id = id;
        this.price = price;
        this.available = available;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }

}
