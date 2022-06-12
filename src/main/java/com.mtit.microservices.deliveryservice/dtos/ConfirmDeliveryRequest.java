package com.mtit.microservices.deliveryservice.dtos;

public class ConfirmDeliveryRequest {

    private String orderID;
    private String status;
    private String date;

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

    public String getDate(){return date;}

    public void setDate(String date) {this.date = date;}

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "orderID='" + orderID + '\'' +
                ", status='" + status + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
//confirmdelivery,orderid, status,date