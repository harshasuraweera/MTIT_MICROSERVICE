package com.mtit.microservices.foodservice.controller;

import com.mtit.microservices.foodservice.dtos.AddFoodRequest;
import com.mtit.microservices.foodservice.dtos.AddFoodResponse;
import com.mtit.microservices.foodservice.dtos.UpdateFoodRequest;
import com.mtit.microservices.foodservice.dtos.UpdateFoodResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/updateFood")

public class UpdateFoodServiceController {


        @PutMapping(consumes = "application/json", produces = "application/json")
        public @ResponseBody
        UpdateFoodResponse Food(@RequestBody UpdateFoodRequest updateFoodRequest){

            System.out.println("Food Details: "+ updateFoodRequest);

            var updateFoodResponse = new UpdateFoodResponse();
            updateFoodResponse.setFoodID(UUID.randomUUID().toString());
            updateFoodResponse.setMessage("Successfully Update the Food Item's Details....");

            return updateFoodResponse;

        }

    }



