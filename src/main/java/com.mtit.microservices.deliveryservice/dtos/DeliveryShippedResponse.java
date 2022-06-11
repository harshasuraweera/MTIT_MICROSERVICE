package com.mtit.microservices.deliveryservice.dtos;

public class DeliveryShippedResponse {


    private String foodId;
    private String message;

    public String getItemId() {
        return foodId;
    }

    public void setItemId(String itemId) {
        this.foodId = foodId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DeliveryResponse{" +
                "foodId='" + foodId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
