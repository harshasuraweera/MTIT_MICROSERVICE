package com.mtit.microservices.deliveryservice.dtos;

public class ToBeDeliveryRequest {

    private String date;
    private String city;

    public String getDeliveryDate() {
        return date;
    }

    public void setDeliveryDate(String DeliveryDate) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String City) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "date='" + date + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
//date,city