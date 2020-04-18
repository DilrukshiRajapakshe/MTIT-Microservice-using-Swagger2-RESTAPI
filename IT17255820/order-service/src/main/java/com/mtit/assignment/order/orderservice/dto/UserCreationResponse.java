package com.mtit.assignment.order.orderservice.dto;

public class UserCreationResponse {

    private String itemId;
    private String cusId;
    private String message;

    public String getItemId() {        return itemId;
    }

    public void setItemId(String itemId) {        this.itemId = itemId;
    }

    public String getCusId() {        return cusId;
    }

    public void setCusId(String cusId) {        this.cusId = cusId;
    }

    public String getMessage() {        return message;
    }

    public void setMessage(String message) {        this.message = message;
    }
}
