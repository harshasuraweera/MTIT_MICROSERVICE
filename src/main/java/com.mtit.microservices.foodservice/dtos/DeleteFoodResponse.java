package com.mtit.microservices.foodservice.dtos;

public class DeleteFoodResponse {


    private String foodId;
    private String message;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
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
        return "FoodServiceResponse{" +
                "foodId='" + foodId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
