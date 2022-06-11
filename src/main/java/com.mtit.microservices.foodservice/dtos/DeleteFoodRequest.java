package com.mtit.microservices.foodservice.dtos;

public class DeleteFoodRequest {


    private int foodID;
    private String foodName;
    private String foodStock;
    private String foodBranch;
    private int foodPrice;


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
        return foodBranch;
    }

    public void setFoodBranch(String foodBranch) {
        this.foodBranch = foodBranch;
    }
    public float getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public String toString() {

        return "AddFoodRequest{" +
                //onlyFoodID
                "foodName='" + foodName + '\'' +
                ", foodStock ='" + foodStock + '\'' +
                ", foodBranch=" + foodBranch + '\'' +
                ", foodPrice=" + foodPrice +
                '}';
    }
}
