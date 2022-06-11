package com.mtit.microservices.foodservice.dtos;

public class AddFoodResponse {

    private String foodID;
    private String message;

    public String getFoodID() {
        return foodID;
    }

    public void setItemId(String foodID) {
        this.foodID = foodID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "FoodServiceResponse{" +
                "foodID='" + foodID + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
