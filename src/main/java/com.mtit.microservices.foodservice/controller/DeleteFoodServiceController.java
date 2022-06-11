package com.mtit.microservices.foodservice.controller;

import com.mtit.microservices.foodservice.dtos.AddFoodRequest;
import com.mtit.microservices.foodservice.dtos.AddFoodResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/deleteFood")
public class DeleteFoodServiceController {
    @DeleteMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    AddFoodResponse Food(@RequestBody AddFoodRequest foodRequest){

        System.out.println("Food Details: "+ foodRequest);

        var addFoodResponse = new AddFoodResponse();
        addFoodResponse.setItemId(UUID.randomUUID().toString());
        addFoodResponse.setMessage("Food Item Deleted Successfully...!!-^-");

        return addFoodResponse;

    }
}
