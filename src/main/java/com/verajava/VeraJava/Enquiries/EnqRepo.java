package com.verajava.VeraJava.Enquiries;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnqRepo extends JpaRepository <EnqEntity, String> {
  
}
