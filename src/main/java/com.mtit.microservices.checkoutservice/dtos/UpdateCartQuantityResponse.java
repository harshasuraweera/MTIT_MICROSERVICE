package com.mtit.microservices.checkoutservice.dtos;

public class UpdateCartQuantityResponse {

    private String foodId;
    private String oldQuantity;
    private String newQuantity;
    private String totalPrice;

    private String foodPrice;

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public void setOldQuantity(String oldQuantity) {
        this.oldQuantity = oldQuantity;
    }

    public void setNewQuantity(String newQuantity) {
        this.newQuantity = newQuantity;
    }

    public String getFoodId() {
        return foodId;
    }

    public String getOldQuantity() {
        return oldQuantity;
    }

    public String getNewQuantity() {
        return newQuantity;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public String toString() {
        return "UpdateCartQuantityResponse{" +
                "foodId='" + foodId + '\'' +
                ", oldQuantity='" + oldQuantity + '\'' +
                ", newQuantity='" + newQuantity + '\'' +
                ", foodPrice='" + foodPrice + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                '}';
    }

}
