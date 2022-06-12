//IT19208718 | Suraweera S.M.H.M. | MTIT_MICROSERVICES ASSIGNMENT | G067
package com.mtit.microservices.checkoutservice.utils;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    //Modified query for deleting a record from the cart table
    @Modifying
    @Transactional
    @Query("delete from Cart c where c.foodId =:foodId and c.customerId=:customerId")
    Integer deleteFromCart(@Param("foodId") String foodId, @Param("customerId") String customerId);

    //Modified query for update an existing record of the cart table
    @Modifying
    @Transactional
    @Query("update Cart c set c.quantity =:quantity where c.foodId =:foodId and c.customerId=:customerId")
    Integer updateCartQuantity(@Param("quantity") String quantity, @Param("foodId") String foodId, @Param("customerId") String customerId);
}
