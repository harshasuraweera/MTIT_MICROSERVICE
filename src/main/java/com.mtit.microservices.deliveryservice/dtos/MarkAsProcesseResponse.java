package com.mtit.microservices.deliveryservice.dtos;

public class MarkAsProcesseResponse {

    private String orderID;
    private String message;
    private String status;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DeliveryResponse{" +
                "orderId='" + orderID + '\'' +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
//orderID,status,message