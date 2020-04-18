package com.mtit.assignment.order.orderservice.dto;


public class OrderRequest {

    private String itemId;
    private String itemName;
    private String quantity;

    public String getItemId() { return itemId; }

    public void setItemId(String itemId) { this.itemId = itemId;    }

    public String getItemName() { return itemName;
    }

    public void setItemName(String itemName) { this.itemName = itemName;    }

    public String getQuantity() { return quantity;    }

    public void setQuantity(String quantity) { this.quantity = quantity;    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
