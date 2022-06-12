package com.mtit.microservices.checkoutservice.utils;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface FoodRepository extends CrudRepository<Food, Long> {
    List<Food> findByFoodName(String food_name);
}
