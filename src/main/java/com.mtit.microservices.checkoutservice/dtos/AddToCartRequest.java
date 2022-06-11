package com.mtit.microservices.checkoutservice.dtos;

public class AddToCartRequest {

    private String searchKeyword;
    private String quantity;

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "AddToCartRequest{" +
                "foodId='" + searchKeyword + '\''+
                "quantity='" + quantity + '\''+
                '}';
    }

}
