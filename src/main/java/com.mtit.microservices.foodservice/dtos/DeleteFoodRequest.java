package com.mtit.microservices.foodservice.dtos;

public class DeleteFoodRequest {


    private String foodId;
    private String foodName;
    private String foodStock;
    private String foodBranch;
    private int foodPrice;

    public String getfoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
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

                "foodId='" + foodId+ '\'' +
                '}';
    }
}
