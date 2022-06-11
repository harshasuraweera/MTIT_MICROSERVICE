package com.mtit.microservices.checkoutservice.controller;

import com.mtit.microservices.checkoutservice.dtos.AddToCartRequest;
import com.mtit.microservices.checkoutservice.dtos.AddToCartResponse;
import com.mtit.microservices.checkoutservice.dtos.SearchRequest;
import com.mtit.microservices.checkoutservice.dtos.SearchResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addToCart")
public class AddToCartController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    AddToCartResponse item(@RequestBody AddToCartRequest addToCartRequest){

        System.out.println("Search Results: "+ addToCartRequest); //return the postman send request data

        //search on the db and get the values and send to the response

        var addToCartResponse = new AddToCartResponse();
        addToCartResponse.setFoodName("Bread");
        addToCartResponse.setFoodPrice("260");
        addToCartResponse.setQuantity("2");
        addToCartResponse.setTotalPrice("520");

        return addToCartResponse;

    }

}
