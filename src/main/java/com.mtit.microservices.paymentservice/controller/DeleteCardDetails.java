package com.mtit.microservices.paymentservice.controller;


import com.mtit.microservices.paymentservice.dtos.DeleteCardDetailsRequest;
import com.mtit.microservices.paymentservice.dtos.DeleteCardDetailsResponse;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/deleteCardDetails")
public class DeleteCardDetails {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    DeleteCardDetailsResponse item(@RequestBody DeleteCardDetailsRequest deleteCardDetailsRequest){

        System.out.println("Delete Item Details: "+ deleteCardDetailsRequest);

        var deleteCardDetailsResponse = new DeleteCardDetailsResponse();
        deleteCardDetailsResponse.setcardId(UUID.randomUUID().toString());
        deleteCardDetailsResponse.setMessage("Successfully Delete the item..");

        return deleteCardDetailsResponse;

    }
}
