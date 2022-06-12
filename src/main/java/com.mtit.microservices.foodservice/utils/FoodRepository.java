package com.mtit.microservices.foodservice.utils;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Update, Delete

public interface FoodRepository extends CrudRepository<Food, Integer> {

    //Modified query for deleting a record from the cart table
    @Modifying
    @Transactional
    @Query("delete from Food f where f.foodId =:foodId")
    Integer deleteFromFood(@Param("foodId") String foodId);



    @Modifying
    @Transactional
    @Query("update Food f set f.foodName =:foodName, f.foodStock=:foodStock, f.foodCategory=:foodCategory, f.foodPrice=:foodPrice  where f.foodId =:foodId")
    Integer updateFoodDetails(@Param("foodId") String foodId, @Param("foodName") String foodName, @Param("foodStock") String foodStock, @Param("foodCategory") String foodCategory, @Param("foodPrice") String foodPrice);
}

