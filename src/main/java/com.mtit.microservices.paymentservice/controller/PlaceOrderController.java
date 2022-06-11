package com.mtit.microservices.paymentservice.controller;


import com.mtit.microservices.paymentservice.dtos.PlaceOrderRequest;
import com.mtit.microservices.paymentservice.dtos.PlaceOrderResponse;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/placeOrder")
public class PlaceOrderController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    PlaceOrderResponse item(@RequestBody PlaceOrderRequest placeOrderRequest){

        System.out.println("PlaceOrder Details: "+ placeOrderRequest);

        var placeOrderResponse = new PlaceOrderResponse();
        placeOrderResponse.setOrderId(UUID.randomUUID().toString());
        placeOrderResponse.setMessage("Successfully found the PlaceOrder..");

        return placeOrderResponse;

    }
}
