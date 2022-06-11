package com.mtit.microservices.deliveryservice.controller;

import com.mtit.microservices.deliveryservice.dtos.DeliveryRequest;
import com.mtit.microservices.deliveryservice.dtos.DeliveryResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/toBeDelivered")
public class FoodDeliveryController {
    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    DeliveryResponse item(@RequestBody DeliveryRequest itemRequest){

        System.out.println("Item Details: "+ itemRequest);

        var deliveryresponse = new DeliveryResponse();
        deliveryresponse.setItemId(UUID.randomUUID().toString());
        deliveryresponse.setMessage("Successfully found the Delivery..");

        return deliveryresponse;

    }
}
