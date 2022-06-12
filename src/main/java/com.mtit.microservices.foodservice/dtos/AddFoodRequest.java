package com.mtit.microservices.foodservice.dtos;

public class AddFoodRequest {

    private String foodID;
    private String foodName;
    private String foodStock;
    private String foodCategory;
    private String foodPrice;

    public String getFoodID() {
        return foodID;
    }

    public void setFoodID(String foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodStock() {
        return foodStock;
    }

    public void setFoodStock(String foodStock) {
        this.foodStock = foodStock;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }
    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public String toString() {

        return "AddFoodRequest{" +
                "foodID='" + foodID + '\'' +
                "foodName='" + foodName + '\'' +
                ", foodStock ='" + foodStock + '\'' +
                ", foodBranch=" + foodCategory + '\'' +
                ", foodPrice=" + foodPrice +
                '}';
    }


}
