package com.mtit.microservices.foodservice.controller;

import com.mtit.microservices.foodservice.dtos.DeleteFoodRequest;
import com.mtit.microservices.foodservice.dtos.DeleteFoodResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/deleteFood")
public class DeleteFoodServiceController {
    @DeleteMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    DeleteFoodResponse Food(@RequestBody DeleteFoodRequest deletefoodRequest){

        System.out.println("Food Details: "+ deletefoodRequest);

        var deleteFoodResponse = new DeleteFoodResponse();
        deleteFoodResponse.setFoodID(UUID.randomUUID().toString());
        deleteFoodResponse.setMessage("Food Item Deleted Successfully...!!-^-");

        return deleteFoodResponse;

    }
}
