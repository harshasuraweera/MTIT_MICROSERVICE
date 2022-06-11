package com.mtit.microservices.foodservice.controller;

import com.mtit.microservices.foodservice.dtos.AddFoodRequest;
import com.mtit.microservices.foodservice.dtos.AddFoodResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/addFood")
public class FoodServiceController {
    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    AddFoodResponse item(@RequestBody AddFoodRequest foodRequest){

        System.out.println("Food Details: "+ foodRequest);

        var addFoodResponse = new AddFoodResponse();
        addFoodResponse.setItemId(UUID.randomUUID().toString());
       addFoodResponse.setMessage("Successfully found the item..bla bla bla");

        return addFoodResponse;

    }

}
