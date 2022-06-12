package com.mtit.microservices.paymentservice.utils;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CardDetailsRepository extends CrudRepository<CardDetails, Integer> {

    //Modified query for deleting a record from the CardDetails table
    @Modifying
    @Transactional
    @Query("delete from CardDetails c where c.recordId =:recordId")
    Integer deleteCardDetails(@Param("recordId") String recordId);

    //Modified query for update an existing record of the CardDetails table
    @Modifying
    @Transactional
    @Query("update CardDetails c set c.cardNumber =:cardNumber, c.cardHolderName =:cardHolderName, c.month =:month, c.year =:year, c.cvv =:cvv where c.recordId =:recordId")
    Integer modifyCardDetails(@Param("cardNumber") String cardNumber, @Param("cardHolderName") String cardHolderName, @Param("month") String month, @Param("year") String year, @Param("cvv") String cvv, @Param("recordId") String recordId);

    List<CardDetails> findByRecordId(String recordId);
}
