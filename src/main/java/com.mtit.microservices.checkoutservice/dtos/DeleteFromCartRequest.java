package com.mtit.microservices.checkoutservice.dtos;

public class DeleteFromCartRequest {

    private String foodId;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    @Override
    public String toString() {
        return "DeleteFromCartRequest{" +
                "foodId='" + foodId + '\'' +
                '}';
    }

}
