package com.mtit.assignment.paymentservice.entity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.EntityListeners;
import javax.persistence.Entity;
import javax.persistence.Id;


@EntityListeners(AuditingEntityListener.class)
@Entity
public class Payment extends SuperEntity{
    @Id
    private String id;
    private String buyerId;
    private String sellerId;
    private String stockId;
    private double price;
    private int amount;

    public Payment() {
    }

    public Payment(String id, String buyerId, String sellerId, String stockId, double price, int amount) {
        this.id = id;
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.stockId = stockId;
        this.price = price;
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

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", stockId='" + stockId + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
