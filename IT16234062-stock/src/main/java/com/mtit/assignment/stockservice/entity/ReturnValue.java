package com.mtit.assignment.stockservice.entity;

import java.util.List;

public class ReturnValue {

    private String id;
    private Massage resMassage;
    private List<Stock> list;

    public ReturnValue() {
    }

    public ReturnValue(String id, Massage resMassage) {
        this.id = id;
        this.resMassage = resMassage;
    }

    public ReturnValue(String id, Massage resMassage, List<Stock> list) {
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

    public List<Stock> getList() {
        return list;
    }

    public void setList(List<Stock> list) {
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
