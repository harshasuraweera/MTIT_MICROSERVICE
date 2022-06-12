package com.mtit.microservices.deliveryservice.controller;

import com.mtit.microservices.deliveryservice.dtos.MarkAsProcesseRequest;
import com.mtit.microservices.deliveryservice.dtos.MarkAsProcesseResponse;
import com.mtit.microservices.deliveryservice.dtos.MarkAsShippedRequest;
import com.mtit.microservices.deliveryservice.dtos.MarkAsShippedResponse;
import com.mtit.microservices.deliveryservice.utils.OrderStatus;
import com.mtit.microservices.deliveryservice.utils.OrderStatusRepository;
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
    private OrderStatusRepository orderStatusRepository;

    @Autowired
    private PlaceOrderRepository placeOrderRepository;

    @PostMapping(path= "/ProcesseDelivery" , consumes = "application/json", produces = "application/json")
    public @ResponseBody
    MarkAsProcesseResponse item(@RequestBody MarkAsProcesseRequest DeliveryRequest){

        System.out.println("Processe Details: "+ DeliveryRequest);
        var deliveryresponse = new MarkAsProcesseResponse();

        OrderStatus orderStatus = new OrderStatus();
        orderStatus.setOrderId(DeliveryRequest.getOrderId());
        orderStatus.setStatus(DeliveryRequest.getStatus());

        try {

            orderStatusRepository.save(orderStatus);
            deliveryresponse.setMessage("Successfully found the Delivery Processe..");
            deliveryresponse.setOrderId(DeliveryRequest.getOrderId());
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

    @PutMapping(path = "/updateDeliveryStatus", consumes = "application/json", produces = "application/json")
    public @ResponseBody MarkAsShippedResponse updateDeliveryStatus(@RequestBody MarkAsShippedRequest shippedRequest) {

        var shippedResponse = new MarkAsShippedResponse();

        ResponseEntity<Integer> result = new ResponseEntity<Integer>(orderStatusRepository.updateDeliveryStatus(shippedRequest.getStatus(), shippedRequest.getOrderId()), HttpStatus.OK);

        String[] response = result.toString().split(",");

        if (Integer.parseInt(response[1]) > 0) {

            shippedResponse.setOrderId(shippedRequest.getOrderId());
            shippedResponse.setStatus(shippedRequest.getStatus());
            shippedResponse.setMessage("Quantity has been updated successfully.");

        } else {

            shippedResponse.setOrderId(shippedRequest.getOrderId());
            shippedResponse.setStatus("Error");
            shippedResponse.setMessage("There is an issue in the delivery status update...!!!");
        }

        return shippedResponse;
    }


}
