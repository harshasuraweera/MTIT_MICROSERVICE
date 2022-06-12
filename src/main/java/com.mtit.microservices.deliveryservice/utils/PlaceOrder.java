package com.mtit.microservices.deliveryservice.utils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlaceOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String address;
    private String foodName;
    private String mobileNumber;
    private String orderDate;
    private String orderId;
    private String ownerName;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}
//1
    public String getFoodName() {return foodName;}

    public void setFoodName(String foodName) {this.foodName = foodName;}
//2
    public String getMobileNumber() {return mobileNumber;}

    public void setMobileNumber(String mobileNumber) {this.mobileNumber = mobileNumber;}
//3
    public String getOrderDate() {return orderDate;}

    public void setOrderDate(String orderDate) {this.orderDate = orderDate;}
//4
    public String getOrderId() {return orderId;}

    public void setOrderId(String orderId) {this.orderId = orderId;}

    public String getOwnerName() {return ownerName;}

    public void setOwnerName(String ownerName) {this.ownerName = ownerName;}

}
