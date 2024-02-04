package com.verajava.VeraJava.Enquiries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EnqRepo extends JpaRepository <EnqEntity, String> {

  @Query(value = "SELECT enq.*, COUNT(DISTINCT bc.item) AS totalCategories, COUNT(DISTINCT bi.item) AS availableItems FROM enquiries enq LEFT JOIN enqLineItems eli ON enq.enqNumber = eli.enqNumber AND eli.status = 'Accept' LEFT JOIN bomcategory bc ON enq.enqNumber = bc.enqNumber LEFT JOIN bomitems bi ON bc.enqNumber = bi.enqNumber AND bc.item = bi.item WHERE :where GROUP BY enq.enqNumber;")
  EnqEntity   getSpecificEnq(@Param("where") String where);

  @Query(value = "SELECT enq.*, COUNT(DISTINCT bc.item) AS totalCategories, COUNT(DISTINCT bi.item) AS availableItems FROM enquiries enq LEFT JOIN enqLineItems eli ON enq.enqNumber = eli.enqNumber AND eli.status = 'Accept' LEFT JOIN bomcategory bc ON enq.enqNumber = bc.enqNumber LEFT JOIN bomitems bi ON bc.enqNumber = bi.enqNumber AND bc.item = bi.item WHERE 1 GROUP BY enq.enqNumber;")
  List<EnqEntity>  getAllEnqs();
}
