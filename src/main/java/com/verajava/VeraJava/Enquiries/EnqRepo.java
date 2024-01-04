package com.verajava.VeraJava.Enquiries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EnqRepo extends JpaRepository <EnqEntity, String> {
  @Query(value = "SELECT endDate FROM enquiries WHERE enqNumber = :enqNumber", nativeQuery = true) 
  String findEndDateByEnqNumber(@Param("enqNumber") String enqNumber);
}
