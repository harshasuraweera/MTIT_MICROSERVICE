package com.mtit.microservices.deliveryservice.dtos;

public class MarkAsProcesseRequest {

    private String orderID;
    private String status;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {this.orderID = orderID;}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "orderID='" + orderID + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
//markasprocesse,response------------orderid,status