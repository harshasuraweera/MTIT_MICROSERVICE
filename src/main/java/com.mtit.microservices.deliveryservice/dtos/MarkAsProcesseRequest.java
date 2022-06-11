package com.mtit.microservices.deliveryservice.dtos;

public class MarkAsProcesseRequest {

    private String orderID;
    private String status;

    public String getItemName() {
        return orderID;
    }

    public void setItemName(String itemName) {
        this.orderID = orderID;
    }

    public String getItemQty() {
        return status;
    }

    public void setItemQty(String itemQty) {
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