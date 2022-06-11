package com.mtit.microservices.checkoutservice.controller;

import com.mtit.microservices.checkoutservice.dtos.UpdateCartQuantityRequest;
import com.mtit.microservices.checkoutservice.dtos.UpdateCartQuantityResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/updateCartQuantity")
public class UpdateCartQuantityController {

    @PutMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    UpdateCartQuantityResponse item(@RequestBody UpdateCartQuantityRequest updateCartQuantityRequest){

        System.out.println("Search Results: "+ updateCartQuantityRequest); //return the postman send request data

        //search on the db and get the values and send to the response

        var updateCartQuantityResponse = new UpdateCartQuantityResponse();
        updateCartQuantityResponse.setFoodId("Bread");
        updateCartQuantityResponse.setOldQuantity("260");
        updateCartQuantityResponse.setNewQuantity("260");
        updateCartQuantityResponse.setFoodPrice("260");
        updateCartQuantityResponse.setTotalPrice("260");


        return updateCartQuantityResponse;

    }

}
