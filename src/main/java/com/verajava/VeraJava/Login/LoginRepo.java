package com.verajava.VeraJava.Login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository <LoginEntity, String> {
  
}
