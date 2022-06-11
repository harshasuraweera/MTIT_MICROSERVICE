package com.mtit.microservices.deliveryservice.dtos;

public class MarkAsShippedResponse {

    private String orderID;
    private String status;
    private String message;

    public String getItemId() {
        return orderID;
    }

    public void setItemId(String itemId) {
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
//orderid,status,message