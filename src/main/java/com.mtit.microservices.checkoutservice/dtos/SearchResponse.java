package com.mtit.microservices.checkoutservice.dtos;

public class SearchResponse {

    private String foodName;
    private String foodPrice;
    private String stockAvailability;

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setStockAvailability(String stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public String getStockAvailability() {
        return stockAvailability;
    }

    @Override
    public String toString() {
        return "FoodSearchResponse{" +
                "foodName='" + foodName + '\'' +
                ", foodPrice='" + foodPrice + '\'' +
                ", stockAvailability='" + stockAvailability + '\'' +
                '}';
    }

}
