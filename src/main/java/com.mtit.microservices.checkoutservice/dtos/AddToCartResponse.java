package com.mtit.microservices.checkoutservice.dtos;

public class AddToCartResponse {

    private String statusMessage;
    private String quantity;

    private String foodId;

    private String customerId;

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }


    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "AddToCartResponse{" +
                "statusMessage='" + statusMessage + '\'' +
                ",foodId='" + foodId + '\'' +
                ",quantity='" + quantity + '\'' +
                ",customerId='" + customerId + '\'' +
                '}';
    }

}
