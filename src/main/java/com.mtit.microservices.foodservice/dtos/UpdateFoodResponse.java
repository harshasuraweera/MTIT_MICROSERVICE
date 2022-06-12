package com.mtit.microservices.foodservice.dtos;

public class UpdateFoodResponse {

    private String message;
    private String foodId;
    private String newFoodName;
    private String newFoodStock;
    private String foodCategory;
    private String newFoodPrice;


    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodId() {
        return foodId;
    }

    public String getNewFoodName() {
        return newFoodName;
    }

    public void setNewFoodName(String newFoodName) {
        this.newFoodName = newFoodName;
    }

    public String getNewFoodStock() {
        return newFoodStock;
    }

    public void setNewFoodStock(String newFoodStock) {
        this.newFoodStock = newFoodStock;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory= foodCategory;
    }

    public String getNewFoodPrice() {
        return newFoodPrice;
    }

    public void setNewFoodPrice(String newFoodPrice) {
        this.newFoodPrice = newFoodPrice;
    }

    @Override
    public String toString() {
        return "UpdateFoodResponse{" +
                "message='" + message + '\'' +
                ",foodId='" + foodId + '\'' +
                ",newFoodName='" + newFoodName + '\'' +
                ",newFoodStock='" + newFoodStock + '\'' +
                ",foodCategory='" + foodCategory + '\'' +
                ",newFoodPrice='" + newFoodPrice + '\'' +
                '}';
    }


}
