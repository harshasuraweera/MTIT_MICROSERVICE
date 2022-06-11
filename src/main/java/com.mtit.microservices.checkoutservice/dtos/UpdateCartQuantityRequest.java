package com.mtit.microservices.checkoutservice.dtos;

public class UpdateCartQuantityRequest {

    private String foodId;
    private String newQuantity;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public void setNewQuantity(String newQuantity) {
        this.newQuantity = newQuantity;
    }

    public String getNewQuantity() {
        return newQuantity;
    }

    @Override
    public String toString() {
        return "UpdateCartQuantityRequest{" +
                "foodId='" + foodId + '\''+
                "newQuantity='" + newQuantity + '\''+
                '}';
    }

}
