package com.mtit.microservices.checkoutservice.dtos;

public class AddToCartRequest {

    private String foodId;
    private String quantity;

    private String customerId;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "AddToCartRequest{" +
                "foodId='" + foodId + '\'' +
                "quantity='" + quantity + '\'' +
                "customerId='" + customerId + '\'' +
                '}';
    }

}
