package com.mtit.microservices.deliveryservice.dtos;

public class MarkAsProcesseResponse {

    private String orderId;
    private String message;
    private String status;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
                "orderId='" + orderId + '\'' +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
//orderID,status,message