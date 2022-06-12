package com.mtit.microservices.deliveryservice.controller;

import com.mtit.microservices.deliveryservice.dtos.MarkAsProcesseRequest;
import com.mtit.microservices.deliveryservice.dtos.MarkAsProcesseResponse;
import com.mtit.microservices.deliveryservice.utils.Ordernb;
import com.mtit.microservices.deliveryservice.utils.OrdernbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/processeDelivery")
public class FoodDeliveryProcesseController {
    @Autowired
    private OrdernbRepository ordernbRepository;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    MarkAsProcesseResponse item(@RequestBody MarkAsProcesseRequest DeliveryRequest){

        System.out.println("Processe Details: "+ DeliveryRequest);
        var deliveryresponse = new MarkAsProcesseResponse();

        Ordernb orderNB = new Ordernb();
        orderNB.setOrderID(DeliveryRequest.getOrderID());
        orderNB.setStatus(DeliveryRequest.getStatus());

        try {

            ordernbRepository.save(orderNB);
            deliveryresponse.setMessage("Successfully found the Delivery Processe..");
            deliveryresponse.setOrderID(DeliveryRequest.getOrderID());
            deliveryresponse.setStatus(DeliveryRequest.getStatus());

        }catch (Exception e){
            deliveryresponse.setMessage("There is an issue in the delivery processe...!!!");
        }

        return deliveryresponse;

    }
}
