package com.mtit.microservices.deliveryservice.utils;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PlaceOrderRepository extends CrudRepository<PlaceOrder, Long>{

    List<PlaceOrder> findByOrderDate (String order_date);

}
