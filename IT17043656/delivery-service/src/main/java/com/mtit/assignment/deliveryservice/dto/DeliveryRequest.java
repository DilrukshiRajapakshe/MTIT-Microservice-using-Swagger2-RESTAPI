package com.mtit.assignment.deliveryservice.dto;

public class DeliveryRequest {

    private String fullName;
    private String age;
    private String deliveryType;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                ", deliveryType='" + deliveryType + '\'' +
                '}';
    }
}
