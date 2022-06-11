package com.mtit.microservices.paymentservice.controller;


import com.mtit.microservices.paymentservice.dtos.SaveCardDetailsRequest;
import com.mtit.microservices.paymentservice.dtos.SaveCardDetailsResponse;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/saveCardDetails")
public class SaveCardDetails {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    SaveCardDetailsResponse item(@RequestBody SaveCardDetailsRequest saveCardDetailsRequest){

        System.out.println("Card Data Details: "+ saveCardDetailsRequest);

        var saveCardDetailsResponse = new SaveCardDetailsResponse();
        saveCardDetailsResponse.setcardId(UUID.randomUUID().toString());
        saveCardDetailsResponse.setMessage("Card Data saved Successfully..");

        return saveCardDetailsResponse;

    }
}
