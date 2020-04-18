package com.mtit.assignment.buyerservice.entity;

import java.util.List;

public class ReturnValue {

    private String id;
    private Massage resMassage;
    private List<Buyer> list;

    public ReturnValue() {
    }

    public ReturnValue(String id, Massage resMassage) {
        this.id = id;
        this.resMassage = resMassage;
    }

    public ReturnValue(String id, Massage resMassage, List<Buyer> list) {
        this.id = id;
        this.resMassage = resMassage;
        this.list = list;
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

    public List<Buyer> getList() {
        return list;
    }

    public void setList(List<Buyer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ReturnValue{" +
                "id='" + id + '\'' +
                ", resMassage=" + resMassage +
                ", list=" + list +
                '}';
    }
}
