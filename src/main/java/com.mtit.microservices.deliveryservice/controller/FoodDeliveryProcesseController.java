package com.mtit.microservices.deliveryservice.controller;

import com.mtit.microservices.deliveryservice.dtos.DeliveryRequest;
import com.mtit.microservices.deliveryservice.dtos.DeliveryResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/processeDelivery")
public class FoodDeliveryProcesseController {
    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    DeliveryResponse item(@RequestBody DeliveryRequest DeliveryRequest){

        System.out.println("Item Details: "+ DeliveryRequest);

        var deliveryresponse = new DeliveryResponse();
        deliveryresponse.setItemId(UUID.randomUUID().toString());
        deliveryresponse.setMessage("Successfully found the Processe Delivery..");

        return deliveryresponse;

    }
}
