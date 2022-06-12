package com.mtit.microservices.paymentservice.dtos;

public class PlaceOrderResponse {

    private String orderId;
    private String message;
    private String ownerName;
    private String mobileNumber;
    private String orderDate;
    private String foodName;
    private String address;

    public String getOrderId() {
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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PlaceOrderResponse{" +
                "orderId='" + orderId + '\'' +
                ", message='" + message + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", foodName='" + foodName + '\'' +
                ", address=" + address + '\'' +
                '}';
    }
}


