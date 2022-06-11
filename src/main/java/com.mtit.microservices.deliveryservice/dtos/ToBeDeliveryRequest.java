package com.mtit.microservices.deliveryservice.dtos;

public class ToBeDeliveryRequest {

    private String foodName;
    private String foodQty;
    private float foodPrice;

    public String getItemName() {
        return foodName;
    }

    public void setItemName(String itemName) {
        this.foodName = foodName;
    }

    public String getItemQty() {
        return foodQty;
    }

    public void setItemQty(String itemQty) {
        this.foodQty = foodQty;
    }

    public float getItemPrice() {
        return foodPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "foodName='" + foodName + '\'' +
                ", foodQty='" + foodQty + '\'' +
                ", foodPrice=" + foodPrice +
                '}';
    }
}
