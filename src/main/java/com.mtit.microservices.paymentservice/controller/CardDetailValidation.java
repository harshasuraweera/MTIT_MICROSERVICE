package com.mtit.microservices.paymentservice.controller;

import com.mtit.microservices.paymentservice.dtos.CardDetailValidationResponse;
import com.mtit.microservices.paymentservice.dtos.CardDetailValidationRequest;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/cardDetailValidation")
public class CardDetailValidation {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    CardDetailValidationResponse item(@RequestBody CardDetailValidationRequest cardDetailValidationResponset){

        System.out.println("Data Validate Details: "+ cardDetailValidationResponset);

        var cardDetailValidationResponse = new CardDetailValidationResponse();
        cardDetailValidationResponse.setcardId(UUID.randomUUID().toString());
        cardDetailValidationResponse.setMessage("Data Validate Successfully..");

        return cardDetailValidationResponse;

    }
}
