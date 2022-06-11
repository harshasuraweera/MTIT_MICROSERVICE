package com.mtit.microservices.deliveryservice.dtos;

public class ToBeDeliveryResponse {

    private String deliveryId;
    private String message;

    public String getItemId() {
        return deliveryId;
    }

    public void setItemId(String itemId) {
        this.deliveryId = deliveryId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DeliveryResponse{" +
                "deliveryId='" + deliveryId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
//order table eke tiyena okkoma