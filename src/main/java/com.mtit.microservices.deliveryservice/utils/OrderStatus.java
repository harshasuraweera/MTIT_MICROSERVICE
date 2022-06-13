package com.mtit.microservices.deliveryservice.utils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // These tells make a table out of this class
public class OrderStatus {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String orderId;
    private String status;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getOrderId() {return orderId;}

    public void setOrderId(String orderId) {this.orderId = orderId;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

}