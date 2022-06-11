package com.mtit.microservices.paymentservice.dtos;

public class PlaceOrderResponse {

    private String orderId;
    private String message;

    public String getItemId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "PlaceOrderResponse{" +
                "orderId='" + orderId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

