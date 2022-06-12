//IT19208718 | Suraweera S.M.H.M. | MTIT_MICROSERVICES ASSIGNMENT | G067
package com.mtit.microservices.checkoutservice.dtos;

public class UpdateCartQuantityResponse {

    private String foodId;
    private String newQuantity;
    private String statusMessage;

    public String getFoodId() {return foodId;}

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getNewQuantity() {
        return newQuantity;
    }

    public void setNewQuantity(String newQuantity) {
        this.newQuantity = newQuantity;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public String toString() {
        return "UpdateCartQuantityResponse{" +
                "foodId='" + foodId + '\'' +
                ", newQuantity='" + newQuantity + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                '}';
    }
}
