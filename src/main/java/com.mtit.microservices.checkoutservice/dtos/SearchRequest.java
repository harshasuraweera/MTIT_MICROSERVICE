package com.mtit.microservices.checkoutservice.dtos;

public class SearchRequest {

    private String searchKeyword;

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    @Override
    public String toString() {
        return "FoodSearchRequest{" +
                "searchKeyword='" + searchKeyword + '\'' +
                '}';
    }

}
