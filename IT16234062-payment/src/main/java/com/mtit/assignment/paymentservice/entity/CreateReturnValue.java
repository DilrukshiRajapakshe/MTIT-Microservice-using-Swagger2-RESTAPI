package com.mtit.assignment.paymentservice.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = CreateReturnValue.class)
public class CreateReturnValue {
    private String id;
    private Massage resMassage;
    private Payment payment;
    private ConnectionEntity connectionEntity;

    public CreateReturnValue() {

    }

    public CreateReturnValue(String id, Massage resMassage, Payment payment, ConnectionEntity connectionEntity) {
        this.id = id;
        this.resMassage = resMassage;
        this.payment = payment;
        this.connectionEntity = connectionEntity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Massage getResMassage() {
        return resMassage;
    }

    public void setResMassage(Massage resMassage) {
        this.resMassage = resMassage;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public ConnectionEntity getConnectionEntity() {
        return connectionEntity;
    }

    public void setConnectionEntity(ConnectionEntity connectionEntity) {
        this.connectionEntity = connectionEntity;
    }

    @Override
    public String toString() {
        return "CreateReturnValue{" +
                "id='" + id + '\'' +
                ", resMassage=" + resMassage +
                ", payment=" + payment +
                ", connectionEntity=" + connectionEntity +
                '}';
    }
}
