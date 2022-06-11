package com.mtit.microservices.paymentservice.controller;


import com.mtit.microservices.paymentservice.dtos.ModifyCardDetailsRequest;
import com.mtit.microservices.paymentservice.dtos.ModifyCardDetailsResponse;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/modifyCardDetails")
public class ModifyCardDetails {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    ModifyCardDetailsResponse item(@RequestBody ModifyCardDetailsRequest modifyCardDetailsRequest){

        System.out.println("Data Modify Details: "+ modifyCardDetailsRequest);

        var modifyCardDetailsResponse = new ModifyCardDetailsResponse();
        modifyCardDetailsResponse.setcardId(UUID.randomUUID().toString());
        modifyCardDetailsResponse.setMessage("Data modified Successfully..");

        return modifyCardDetailsResponse;

    }
}
