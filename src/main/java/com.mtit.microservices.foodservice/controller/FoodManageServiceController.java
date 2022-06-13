//IT19207346 | Dissanayake N.H.N.N. | MTIT_MICROSERVICES ASSIGNMENT | G067
package com.mtit.microservices.foodservice.controller;


import com.mtit.microservices.foodservice.dtos.AddFoodRequest;
import com.mtit.microservices.foodservice.dtos.AddFoodResponse;
import com.mtit.microservices.foodservice.dtos.UpdateFoodRequest;
import com.mtit.microservices.foodservice.dtos.UpdateFoodResponse;
import com.mtit.microservices.foodservice.dtos.DeleteFoodRequest;
import com.mtit.microservices.foodservice.dtos.DeleteFoodResponse;
import com.mtit.microservices.foodservice.utils.Food;
import com.mtit.microservices.foodservice.utils.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/foodManageService")
public class FoodManageServiceController {

    @Autowired
    private FoodRepository foodRepository;

    @PostMapping(path = "/addFood", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    AddFoodResponse addFood(@RequestBody AddFoodRequest addfoodRequest){

        System.out.println("Food Details: "+ addfoodRequest);

        var addFoodResponse = new AddFoodResponse();

        //foodId,foodName,foodStock ,foodCategory and foodPrice are coming via the Postman JSON Body
        Food food = new Food();

        food.setFoodId(addfoodRequest.getFoodId());
        food.setFoodName(addfoodRequest.getFoodName());
        food.setFoodStock(addfoodRequest.getFoodStock());
        food.setFoodCategory(addfoodRequest.getFoodCategory());
        food.setFoodPrice(addfoodRequest.getFoodPrice());

        try {
            foodRepository.save(food);

            addFoodResponse.setMessage("Food Successfully Added to the System...!!!");
            addFoodResponse.setFoodId(addfoodRequest.getFoodId());
            addFoodResponse.setFoodName(addfoodRequest.getFoodName());
            addFoodResponse.setFoodStock(addfoodRequest.getFoodStock());
            addFoodResponse.setFoodCategory(addfoodRequest.getFoodCategory());
            addFoodResponse.setFoodPrice(addfoodRequest.getFoodPrice());

        }catch (Exception e){
            addFoodResponse.setMessage("There is an issue while adding Food Item To the System");
        }

        return addFoodResponse;

    }

    @DeleteMapping(path = "/deleteFood", consumes = "application/json", produces = "application/json")
    public @ResponseBody DeleteFoodResponse deleteFood(@RequestBody DeleteFoodRequest deleteFoodRequest) {

        var deleteFoodResponse = new DeleteFoodResponse();


        ResponseEntity<Integer> result = new ResponseEntity<Integer>(foodRepository.deleteFromFood(deleteFoodRequest.getfoodId()), HttpStatus.OK);

        //extract return value for further conditions
        String[] response = result.toString().split(",");

        if (Integer.parseInt(response[1]) > 0) { //if one or more values has been deleted

            //set response values to the DeleteFoodResponse class
            deleteFoodResponse.setFoodId(deleteFoodRequest.getfoodId());
            deleteFoodResponse.setMessage("The food Details Are Deleted Successfully from the system..!!.");

        } else { //if no record has been deleted

            //set error response values to the DeleteFoodResponse class
            deleteFoodResponse.setFoodId(deleteFoodRequest.getfoodId());
            deleteFoodResponse.setMessage("The Food Details cannot delete from the System or maybe it is not existing in the System. Please refresh the page.");
        }

        return deleteFoodResponse;
    }

    @PutMapping(path = "/updateFood", consumes = "application/json", produces = "application/json")
    public @ResponseBody UpdateFoodResponse updateFoodDetails(@RequestBody UpdateFoodRequest updateFoodRequest) {

        var updateFoodResponse = new UpdateFoodResponse();

        //use a custom override method to update the items of the cart table
        ResponseEntity<Integer> result = new ResponseEntity<Integer>(foodRepository.updateFoodDetails( updateFoodRequest.getFoodId(),updateFoodRequest.getFoodName(),updateFoodRequest.getFoodStock(),updateFoodRequest.getFoodCategory(),updateFoodRequest.getFoodPrice()), HttpStatus.OK);

        //extract return value for further conditions
        String[] response = result.toString().split(",");

        if (Integer.parseInt(response[1]) > 0) { //if one or more values has been updated

            //set response values to the UpdateResponse class
            updateFoodResponse.setFoodId(updateFoodRequest.getFoodId());
            updateFoodResponse.setNewFoodName(updateFoodRequest.getFoodName());
            updateFoodResponse.setNewFoodStock(updateFoodRequest.getFoodStock());
            updateFoodResponse.setFoodCategory(updateFoodRequest.getFoodCategory());
            updateFoodResponse.setNewFoodPrice(updateFoodRequest.getFoodPrice());
            updateFoodResponse.setMessage("New Food Details have been updated successfully.");

        } else { //if no record has been updated

            updateFoodResponse.setMessage("Food Details Updated Failed...!!!");
            updateFoodResponse.setFoodId(updateFoodResponse.getFoodId());
            updateFoodResponse.setNewFoodName(updateFoodResponse.getNewFoodName());
            updateFoodResponse.setNewFoodStock(updateFoodResponse.getNewFoodStock());
            updateFoodResponse.setFoodCategory(updateFoodResponse.getFoodCategory());
            updateFoodResponse.setNewFoodPrice(updateFoodResponse.getNewFoodPrice());
        }

        return updateFoodResponse;
    }
}
