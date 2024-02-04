package com.verajava.VeraJava.Login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoginRepo extends JpaRepository <LoginEntity, String> {
  @Query(value = "SELECT * FROM users WHERE username = ':username' AND password = ':password';", nativeQuery = true)
  Object[] getDetailsByUsernameAndPassword (@Param ("username") String username, @Param ("password") String password);
}
