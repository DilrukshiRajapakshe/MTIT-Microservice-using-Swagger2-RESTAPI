package com.mtit.assignment.paymentservice.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = Stock.class)
public class Stock extends SuperEntity{
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
        return id;
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
