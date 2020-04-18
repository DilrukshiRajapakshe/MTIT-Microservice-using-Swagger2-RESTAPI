package com.mtit.assignment.cart.cartservice.dto;

public class UserRequest {

    private String cusName;
    private String itemName;
    private String address;
    private String price;

    public String getCusName() { return cusName;     }

    public void setCusName(String cusName) { this.cusName = cusName;    }

    public String getItemName() {  return itemName;    }

    public void setItemName(String itemName) { this.itemName = itemName;    }

    public String getAddress() {  return address;    }

    public void setAddress(String address) { this.address = address;    }

    public String getPrice() {  return price;    }

    public void setPrice(String price) { this.price = price;    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "cusName='" + cusName + '\'' +
                ", itemName='" + itemName + '\'' +
                ", address='" + address + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
