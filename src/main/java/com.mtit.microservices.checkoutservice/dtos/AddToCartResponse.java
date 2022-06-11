package com.mtit.microservices.checkoutservice.dtos;

public class AddToCartResponse {

    private String foodName;
    private String foodPrice;
    private String quantity;
    private String totalPrice;

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "AddToCartResponse{" +
                "foodName='" + foodName + '\'' +
                ", foodPrice='" + foodPrice + '\'' +
                ", quantity='" + quantity + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                '}';
    }

}
