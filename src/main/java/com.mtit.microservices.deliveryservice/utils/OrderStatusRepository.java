package com.mtit.microservices.deliveryservice.utils;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface OrderStatusRepository extends CrudRepository<OrderStatus, Integer> {
    //Query for update record of the orderstatus table
    @Modifying
    @Transactional
    @Query("update OrderStatus p set p.status =:status where p.orderId =:orderId")
    Integer updateDeliveryStatus(@Param("status") String status, @Param("orderId") String orderId);

}
