//IT19208718 | Suraweera S.M.H.M. | MTIT_MICROSERVICES ASSIGNMENT | G067
package com.mtit.microservices.checkoutservice.dtos;

public class DeleteFromCartRequest {

    private String foodId;
    private String customerId;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "DeleteFromCartRequest{" +
                "foodId='" + foodId + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
