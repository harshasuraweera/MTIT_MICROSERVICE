package com.mtit.microservices.paymentservice.controller;


import com.mtit.microservices.paymentservice.dtos.*;
import com.mtit.microservices.paymentservice.utils.CardDetails;
import com.mtit.microservices.paymentservice.utils.CardDetailsRepository;
import com.mtit.microservices.paymentservice.utils.PlaceOrder;
import com.mtit.microservices.paymentservice.utils.PlaceOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/paymentService")
public class PaymentServiceController {

    @Autowired
    private PlaceOrderRepository placeOrderRepository;

    @Autowired
    private CardDetailsRepository cardDetailsRepository;

    @PostMapping(path = "/placeOrder", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    PlaceOrderResponse placeOrder(@RequestBody PlaceOrderRequest placeOrderRequest){

        System.out.println("PlaceOrder Details: "+ placeOrderRequest);
        var placeOrderResponse = new PlaceOrderResponse();

        PlaceOrder placeOrder = new PlaceOrder();
        placeOrder.setOrderId(placeOrderRequest.getOrderId());
        placeOrder.setOwnerName(placeOrderRequest.getOwnerName());
        placeOrder.setMobileNumber(placeOrderRequest.getMobileNumber());
        placeOrder.setOrderDate(placeOrderRequest.getOrderDate());
        placeOrder.setFoodName(placeOrderRequest.getFoodName());
        placeOrder.setAddress(placeOrderRequest.getAddress());

        try {
            placeOrderRepository.save(placeOrder);

            placeOrderResponse.setMessage("Item is successfully added to the cart.");
            placeOrderResponse.setOrderId(placeOrderRequest.getOrderId());
            placeOrderResponse.setOwnerName(placeOrderRequest.getOwnerName());
            placeOrderResponse.setMobileNumber(placeOrderRequest.getMobileNumber());
            placeOrderResponse.setOrderDate(placeOrderRequest.getOrderDate());
            placeOrderResponse.setFoodName(placeOrderRequest.getFoodName());
            placeOrderResponse.setAddress(placeOrderRequest.getAddress());

        }catch (Exception e){
            placeOrderResponse.setMessage("There is an issue while adding item to the cart.");
        }

        return placeOrderResponse;

    }

    @GetMapping(path = "/viewCardDetails")
    public ResponseEntity<List<CardDetails>> viewByRecordId(@RequestParam String keyword){
        return new ResponseEntity<List<CardDetails>>(cardDetailsRepository.findByRecordId(keyword), HttpStatus.OK);
    }


    @DeleteMapping(path = "/deleteCardDetails", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    DeleteCardDetailsResponse deleteCardDetails(@RequestBody DeleteCardDetailsRequest deleteCardDetailsRequest){

        var deleteCardDetailsResponse = new DeleteCardDetailsResponse();
        ResponseEntity<Integer> result = new ResponseEntity<Integer>(cardDetailsRepository.deleteCardDetails(deleteCardDetailsRequest.getRecordId()), HttpStatus.OK);
        String[] response = result.toString().split(",");

        if(Integer.parseInt(response[1])>0){
            deleteCardDetailsResponse.setRecordId(deleteCardDetailsRequest.getRecordId());
            deleteCardDetailsResponse.setMessage("The item is successfully delete from the CardDetails.");
        }else{
            deleteCardDetailsResponse.setRecordId(deleteCardDetailsRequest.getRecordId());
            deleteCardDetailsResponse.setMessage("The item cannot delete from the CardDetails or maybe it is not existing in the cart. Please refresh the page.");
        }

        return deleteCardDetailsResponse;

    }


    @PutMapping(path = "/modifyCardDetails", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    ModifyCardDetailsResponse modifyCardDetails(@RequestBody ModifyCardDetailsRequest modifyCardDetailsRequest){

        var modifyCardDetailsResponse = new ModifyCardDetailsResponse();

        ResponseEntity<Integer> result = new ResponseEntity<Integer>(cardDetailsRepository.modifyCardDetails(modifyCardDetailsRequest.getNewcardNumber(), modifyCardDetailsRequest.getNewcardHolderName(), modifyCardDetailsRequest.getNewmonth(), modifyCardDetailsRequest.getNewyear(), modifyCardDetailsRequest.getNewcvv(), modifyCardDetailsRequest.getRecordId()), HttpStatus.OK);
        String[] response = result.toString().split(",");

        if(Integer.parseInt(response[1])>0){
            modifyCardDetailsResponse.setRecordId(modifyCardDetailsRequest.getRecordId());
            modifyCardDetailsResponse.setNewcardNumber(modifyCardDetailsRequest.getNewcardNumber());
            modifyCardDetailsResponse.setNewcardHolderName(modifyCardDetailsRequest.getNewcardHolderName());
            modifyCardDetailsResponse.setNewmonth(modifyCardDetailsRequest.getNewmonth());
            modifyCardDetailsResponse.setNewyear(modifyCardDetailsRequest.getNewyear());
            modifyCardDetailsResponse.setNewcvv(modifyCardDetailsRequest.getNewcvv());
            modifyCardDetailsResponse.setMessage("Quantity has been updated successfully.");
        }else {
            modifyCardDetailsResponse.setRecordId(modifyCardDetailsRequest.getRecordId());
            modifyCardDetailsResponse.setNewcardNumber(modifyCardDetailsRequest.getNewcardNumber());
            modifyCardDetailsResponse.setNewcardHolderName(modifyCardDetailsRequest.getNewcardHolderName());
            modifyCardDetailsResponse.setNewmonth(modifyCardDetailsRequest.getNewmonth());
            modifyCardDetailsResponse.setNewyear(modifyCardDetailsRequest.getNewyear());
            modifyCardDetailsResponse.setNewcvv(modifyCardDetailsRequest.getNewcvv());
            modifyCardDetailsResponse.setMessage("Quantity updating has been failed.");
        }

        return modifyCardDetailsResponse;

    }

}