package com.mtit.microservices.checkoutservice.controller;

import com.mtit.microservices.checkoutservice.dtos.DeleteFromCartRequest;
import com.mtit.microservices.checkoutservice.dtos.DeleteFromCartResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deleteFromCart")
public class DeleteFromCartController {

    @DeleteMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    DeleteFromCartResponse item(@RequestBody DeleteFromCartRequest deleteFromCartRequest){

        System.out.println("Search Results: "+ deleteFromCartRequest); //return the postman send request data

        //search on the db and get the values and send to the response

        var deleteFromCartResponse = new DeleteFromCartResponse();
        deleteFromCartResponse.setFoodId("Vegitable Kottu");
        deleteFromCartResponse.setStatusMessage("successfully deleted from the cart");

        return deleteFromCartResponse;

    }

}
