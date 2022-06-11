package com.mtit.microservices.checkoutservice.controller;

import com.mtit.microservices.checkoutservice.dtos.SearchRequest;
import com.mtit.microservices.checkoutservice.dtos.SearchResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/searchFood")
public class SearchController {

    @GetMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    SearchResponse item(@RequestBody SearchRequest searchRequest){

        System.out.println("Search Results: "+ searchRequest); //return the postman send request data

        //search on the db and get the values and send to the response

        var searchResponse = new SearchResponse();
        searchResponse.setFoodName("Bread");
        searchResponse.setFoodPrice("260");
        searchResponse.setStockAvailability("Available");

        return searchResponse;

    }

}
