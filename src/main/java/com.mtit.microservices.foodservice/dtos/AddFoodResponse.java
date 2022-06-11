package com.mtit.microservices.foodservice.dtos;

public class AddFoodResponse {

    private String itemId;
    private String message;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ItemResponse{" +
                "itemId='" + itemId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
