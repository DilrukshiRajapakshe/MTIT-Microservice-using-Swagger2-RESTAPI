package com.mtit.assignment.buyerservice.entity;

public class Massage {

    private String id;
    private String textMassage;

    public Massage() {
    }

    public Massage(String id, String textMassage) {
        this.id = id;
        this.textMassage = textMassage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTextMassage() {
        return textMassage;
    }

    public void setTextMassage(String textMassage) {
        this.textMassage = textMassage;
    }

    @Override
    public String toString() {
        return "Massage{" +
                "id='" + id + '\'' +
                ", textMassage='" + textMassage + '\'' +
                '}';
    }
}
