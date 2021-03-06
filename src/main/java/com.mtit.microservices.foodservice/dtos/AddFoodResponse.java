package com.mtit.microservices.foodservice.dtos;

public class AddFoodResponse {

    private String message;
    private String foodId;
    private String foodName;
    private String foodStock;
    private String foodCategory;
    private String foodPrice;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }


    public String getFoodId() {
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

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory= foodCategory;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public String toString() {
        return "AddFoodResponse{" +
                "message='" + message + '\'' +
                ",foodId='" + foodId + '\'' +
                ",foodName='" + foodName + '\'' +
                ",foodStock='" + foodStock + '\'' +
                ",foodCategory='" + foodCategory + '\'' +
                ",foodPrice='" + foodPrice + '\'' +
                '}';
    }


}
