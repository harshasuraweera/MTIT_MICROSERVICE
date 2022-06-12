package com.mtit.microservices.deliveryservice.controller;

import com.mtit.microservices.deliveryservice.dtos.MarkAsProcesseRequest;
import com.mtit.microservices.deliveryservice.dtos.MarkAsProcesseResponse;
import com.mtit.microservices.deliveryservice.utils.PlaceOrder2;
import com.mtit.microservices.deliveryservice.utils.OrdernbRepository;
import com.mtit.microservices.deliveryservice.utils.PlaceOrder;
import com.mtit.microservices.deliveryservice.utils.PlaceOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="/Delivery")
public class FoodDeliveryProcesseController {
    @Autowired
    private OrdernbRepository ordernbRepository;

    @Autowired
    private PlaceOrderRepository placeOrderRepository;

    @PostMapping(path= "/ProcesseDelivery" , consumes = "application/json", produces = "application/json")
    public @ResponseBody
    MarkAsProcesseResponse item(@RequestBody MarkAsProcesseRequest DeliveryRequest){

        System.out.println("Processe Details: "+ DeliveryRequest);
        var deliveryresponse = new MarkAsProcesseResponse();

        PlaceOrder2 orderNB = new PlaceOrder2();
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

    @GetMapping(path = "/showOrder")
    public ResponseEntity<List<PlaceOrder>> showOrderByDate(@RequestParam String keyword) {
        return new ResponseEntity<List<PlaceOrder>>(placeOrderRepository.findByOrderDate(keyword), HttpStatus.OK);
    }


}
