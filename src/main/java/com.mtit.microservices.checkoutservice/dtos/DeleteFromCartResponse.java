//IT19208718 | Suraweera S.M.H.M. | MTIT_MICROSERVICES ASSIGNMENT | G067
package com.mtit.microservices.checkoutservice.dtos;

public class DeleteFromCartResponse {

    private String foodId;
    private String statusMessage;

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodId() {
        return foodId;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public String toString() {
        return "DeleteFromCartResponse{" +
                "foodId='" + foodId + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                '}';
    }

}
