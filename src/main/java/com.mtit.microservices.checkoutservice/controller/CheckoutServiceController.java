package com.mtit.microservices.checkoutservice.controller;

import com.mtit.microservices.checkoutservice.dtos.AddToCartRequest;
import com.mtit.microservices.checkoutservice.dtos.AddToCartResponse;
import com.mtit.microservices.checkoutservice.dtos.DeleteFromCartRequest;
import com.mtit.microservices.checkoutservice.dtos.DeleteFromCartResponse;
import com.mtit.microservices.checkoutservice.utils.Cart;
import com.mtit.microservices.checkoutservice.utils.CartRepository;
import com.mtit.microservices.checkoutservice.utils.Food;
import com.mtit.microservices.checkoutservice.utils.FoodRepository;
import org.json.JSONObject;
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
    AddToCartResponse item(@RequestBody AddToCartRequest addToCartRequest) {

        System.out.println("Postman Results: " + addToCartRequest);
        var addToCartResponse = new AddToCartResponse();

        //foodId, customerId and itemQty are coming via the Postman JSON Body
        Cart cart = new Cart();
        cart.setFoodId(addToCartRequest.getFoodId());
        cart.setCustomerId(addToCartRequest.getCustomerId());
        cart.setQuantity(addToCartRequest.getQuantity());

        try {
            cartRepository.save(cart);

            addToCartResponse.setStatusMessage("Item is successfully added to the cart.");
            addToCartResponse.setFoodId(addToCartRequest.getFoodId());
            addToCartResponse.setQuantity(addToCartRequest.getQuantity());
            addToCartResponse.setCustomerId(addToCartRequest.getCustomerId());

        }catch (Exception e){
            addToCartResponse.setStatusMessage("There is an issue while adding item to the cart.");
        }

        return addToCartResponse;

    }

    @GetMapping(path = "/searchFood")
    public ResponseEntity<List<Food>> getFoodByName(@RequestParam String keyword){
        return new ResponseEntity<List<Food>>(foodRepository.findByFoodName(keyword), HttpStatus.OK);
    }

//    @DeleteMapping(path = "/deleteFromCart", consumes = "application/json", produces = "application/json")
//    public ResponseEntity<Integer> deleteFromCart(@RequestBody String jsonString){
//        JSONObject jsonObject = new JSONObject(jsonString);
//        return new ResponseEntity<Integer>(cartRepository.deleteFromCart(jsonObject.getString("foodId"), jsonObject.getString("customerId")), HttpStatus.OK);
//    }

    @DeleteMapping(path = "/deleteFromCart", consumes = "application/json", produces = "application/json")
    public @ResponseBody ResponseEntity<Integer> item(@RequestBody DeleteFromCartRequest deleteFromCartRequest) {

        System.out.println("Postman Results: " + deleteFromCartRequest);
        var deleteFromCartResponse = new DeleteFromCartResponse();


        ResponseEntity<Integer> result = new ResponseEntity<Integer>(cartRepository.deleteFromCart(deleteFromCartRequest.getFoodId(), deleteFromCartRequest.getCustomerId()), HttpStatus.OK);


        return result;

    }

}
