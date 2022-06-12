package com.mtit.microservices.deliveryservice.controller;

import com.mtit.microservices.deliveryservice.dtos.ConfirmDeliveryRequest;
import com.mtit.microservices.deliveryservice.dtos.ConfirmDeliveryResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/shippedDelivery")
public class FoodDeliveryShippedController {
    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    ConfirmDeliveryResponse item(@RequestBody ConfirmDeliveryRequest DeliveryRequest){

        System.out.println("Item Details: "+ DeliveryRequest);

        var deliveryresponse = new ConfirmDeliveryResponse();
        deliveryresponse.setItemId(UUID.randomUUID().toString());
        deliveryresponse.setMessage("Successfully found the Shipped Delivery..");

        return deliveryresponse;

    }
}
