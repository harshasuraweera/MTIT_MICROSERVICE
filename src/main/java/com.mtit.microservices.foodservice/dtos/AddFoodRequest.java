package com.mtit.microservices.foodservice.dtos;

public class AddFoodRequest {

    private int foodID;
    private String foodName;
    private String foodStock;
    private String foodCategory;
    private String foodPrice;



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

    public String getFoodBranch() {
        return foodCategory;
    }

    public void setFoodBranch(String foodBranch) {
        this.foodCategory = foodBranch;
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
