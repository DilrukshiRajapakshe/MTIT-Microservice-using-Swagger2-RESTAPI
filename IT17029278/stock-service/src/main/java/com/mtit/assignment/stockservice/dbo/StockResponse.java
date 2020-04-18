package com.mtit.assignment.stockservice.dbo;

public class StockResponse {

    private String stockId;
    private String message;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
