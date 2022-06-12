//IT19208718 | Suraweera S.M.H.M. | MTIT_MICROSERVICES ASSIGNMENT | G067
package com.mtit.microservices.checkoutservice.controller;

import com.mtit.microservices.checkoutservice.dtos.*;
import com.mtit.microservices.checkoutservice.utils.Cart;
import com.mtit.microservices.checkoutservice.utils.CartRepository;
import com.mtit.microservices.checkoutservice.utils.Food;
import com.mtit.microservices.checkoutservice.utils.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/checkoutService")
public class CheckoutServiceController {

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private FoodRepository foodRepository;

    @PostMapping(path = "/addToCart", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    AddToCartResponse addFoodToCart(@RequestBody AddToCartRequest addToCartRequest) {

        var addToCartResponse = new AddToCartResponse();

        //Create the model and assign values
        Cart cart = new Cart();
        cart.setFoodId(addToCartRequest.getFoodId());
        cart.setCustomerId(addToCartRequest.getCustomerId());
        cart.setQuantity(addToCartRequest.getQuantity());

        try {
            //use CrudRepository default methods to save the values to the DB using hibernate mode
            cartRepository.save(cart);

            //set response values to the AddToCartResponse class
            addToCartResponse.setStatusMessage("Item is successfully added to the cart.");
            addToCartResponse.setFoodId(addToCartRequest.getFoodId());
            addToCartResponse.setQuantity(addToCartRequest.getQuantity());
            addToCartResponse.setCustomerId(addToCartRequest.getCustomerId());

        } catch (Exception e) {

            //handle executions and pass error messages to the endpoint
            addToCartResponse.setStatusMessage("There is an issue while adding item to the cart.");
        }

        return addToCartResponse;
    }


    @GetMapping(path = "/searchFood")
    public ResponseEntity<List<Food>> searchFoodByName(@RequestParam String keyword) {

        //used the default CrudRepository fetch method to retrieve the foods by the name
        return new ResponseEntity<List<Food>>(foodRepository.findByFoodName(keyword), HttpStatus.OK);
    }


    @DeleteMapping(path = "/deleteFromCart", consumes = "application/json", produces = "application/json")
    public @ResponseBody DeleteFromCartResponse deleteItemFromCart(@RequestBody DeleteFromCartRequest deleteFromCartRequest) {

        var deleteFromCartResponse = new DeleteFromCartResponse();

        //use a custom override method to delete the items from the cart table
        ResponseEntity<Integer> result = new ResponseEntity<Integer>(cartRepository.deleteFromCart(deleteFromCartRequest.getFoodId(), deleteFromCartRequest.getCustomerId()), HttpStatus.OK);

        //extract return value for further conditions
        String[] response = result.toString().split(",");

        if (Integer.parseInt(response[1]) > 0) { //if one or more values has been deleted

            //set response values to the DeleteFromCartResponse class
            deleteFromCartResponse.setFoodId(deleteFromCartRequest.getFoodId());
            deleteFromCartResponse.setStatusMessage("The item is successfully delete from the cart.");

        } else { //if no record has been deleted

            //set error response values to the DeleteFromCartResponse class
            deleteFromCartResponse.setFoodId(deleteFromCartRequest.getFoodId());
            deleteFromCartResponse.setStatusMessage("The item cannot delete from the cart or maybe it is not existing in the cart. Please refresh the page.");
        }

        return deleteFromCartResponse;
    }


    @PutMapping(path = "/updateCartQuantity", consumes = "application/json", produces = "application/json")
    public @ResponseBody UpdateCartQuantityResponse updateCartQuantity(@RequestBody UpdateCartQuantityRequest updateCartQuantityRequest) {

        var updateCartQuantityResponse = new UpdateCartQuantityResponse();

        //use a custom override method to update the items of the cart table
        ResponseEntity<Integer> result = new ResponseEntity<Integer>(cartRepository.updateCartQuantity(updateCartQuantityRequest.getNewQuantity(), updateCartQuantityRequest.getFoodId(), updateCartQuantityRequest.getCustomerId()), HttpStatus.OK);

        //extract return value for further conditions
        String[] response = result.toString().split(",");

        if (Integer.parseInt(response[1]) > 0) { //if one or more values has been updated

            //set response values to the UpdateCartQuantityResponse class
            updateCartQuantityResponse.setFoodId(updateCartQuantityRequest.getFoodId());
            updateCartQuantityResponse.setNewQuantity(updateCartQuantityRequest.getNewQuantity());
            updateCartQuantityResponse.setStatusMessage("Quantity has been updated successfully.");

        } else { //if no record has been updated

            //set error response values to the UpdateCartQuantityResponse class
            updateCartQuantityResponse.setFoodId(updateCartQuantityRequest.getFoodId());
            updateCartQuantityResponse.setNewQuantity("0");
            updateCartQuantityResponse.setStatusMessage("Quantity updating has been failed.");
        }

        return updateCartQuantityResponse;
    }

}
