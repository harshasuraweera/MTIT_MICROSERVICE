package com.mtit.microservices.deliveryservice.utils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // These tells Hibernate to make a table out of this class
public class Ordernb {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String orderID;
    private String status;

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getOrderID() {return orderID;}

    public void setOrderID(String orderID) {this.orderID = orderID;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

}