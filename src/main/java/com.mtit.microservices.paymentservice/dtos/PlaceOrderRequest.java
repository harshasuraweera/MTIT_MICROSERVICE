package com.mtit.microservices.paymentservice.dtos;

public class PlaceOrderRequest {

    private String orderId;
    private String ownerName;
    private String mobileNumber;
    private String orderDate;
    private String foodName;
    private String address;

    public String getorderId() {
        return orderId;
    }

    public void setorderId(String orderId) {
        this.orderId = orderId;
    }

    public String getownerName() {
        return ownerName;
    }

    public void setownerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getmobileNumber() {
        return mobileNumber;
    }

    public void setmobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getorderDate() {
        return orderDate;
    }

    public void setorderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getfoodName() {
        return foodName;
    }

    public void setfoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "PlaceOrderRequest{" +
                "orderId='" + orderId + '\'' +
                "ownerName='" + ownerName + '\'' +
                "mobileNumber='" + mobileNumber + '\'' +
                "orderDate='" + orderDate + '\'' +
                ", foodName='" + foodName + '\'' +
                ", address=" + address +
                '}';
    }
}
