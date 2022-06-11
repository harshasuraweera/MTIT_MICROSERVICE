package com.mtit.microservices.paymentservice.dtos;

public class PlaceOrderRequest {

    private String orderId;
    private String orderName;
    private String orderPlace;

    public String getorderId() {
        return orderId;
    }

    public void setorderId(String orderId) {
        this.orderId = orderId;
    }

    public String getorderName() {
        return orderName;
    }

    public void setorderName(String orderName) {
        this.orderName = orderName;
    }

    public String getorderPlace() {
        return orderPlace;
    }

    public void setorderPlace(String orderPlace) {
        this.orderPlace = orderPlace;
    }


    @Override
    public String toString() {
        return "PlaceOrderRequest{" +
                "orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                ", orderPlace=" + orderPlace +
                '}';
    }
}