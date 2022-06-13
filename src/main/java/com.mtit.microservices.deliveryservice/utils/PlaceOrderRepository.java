package com.mtit.microservices.deliveryservice.utils;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PlaceOrderRepository extends CrudRepository<PlaceOrder, Long>{
    //select query for the retrive order details of place order table
    List<PlaceOrder> findByOrderDate (String order_date);

}
