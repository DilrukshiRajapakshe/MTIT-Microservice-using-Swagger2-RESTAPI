package com.mtit.assignment.stockservice.dbo;

public class StockRequest {

    private String productType;
    private String productName;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "StockRequest{" +
                "productType='" + productType + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }


//    @Override
//    public String toString() {
//        return "StockRequest{" +
//                "stockName='" + stockName + '\'' +
//                ", noOfProducts='" + noOfProducts + '\'' +
//                '}';
//    }
}
