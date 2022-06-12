package com.mtit.microservices.foodservice.dtos;

public class UpdateFoodRequest {

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
                "foodName='" + foodName + '\'' +
                ", foodStock ='" + foodStock + '\'' +
                ", foodCategory=" + foodCategory + '\'' +
                ", foodPrice=" + foodPrice +
                '}';
    }
}
