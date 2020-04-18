package com.mtit.assignment.paymentservice.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = ConnectionEntity.class)
public class ConnectionEntity {
    private String id;
    private String buyerId;
    private String buyerName;
    private String buyerPhone;
    private String sellerId;
    private String sellerName;
    private String sellerPhone;
    private String stockId;
    private double price;
    private int available;
    private int amount;

    public ConnectionEntity() {
    }

    public ConnectionEntity(String id, String buyerId, String buyerName, String buyerPhone, String sellerId, String sellerName,
                   String sellerPhone, String stockId, double price, int available, int amount) {
        this.id = id;
        this.buyerId = buyerId;
        this.buyerName = buyerName;
        this.buyerPhone = buyerPhone;
        this.sellerId = sellerId;
        this.sellerName = sellerName;
        this.sellerPhone = sellerPhone;
        this.stockId = stockId;
        this.price = price;
        this.available = available;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ConnectionEntity{" +
                "id='" + id + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", buyerPhone='" + buyerPhone + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", sellerPhone='" + sellerPhone + '\'' +
                ", stockId='" + stockId + '\'' +
                ", price=" + price +
                ", available=" + available +
                ", amount=" + amount +
                '}';
    }
}
