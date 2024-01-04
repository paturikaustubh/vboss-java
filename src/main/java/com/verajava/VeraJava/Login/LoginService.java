package com.verajava.VeraJava.Login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
  
  @Autowired
  private LoginRepo loginRepo;

  public List<LoginEntity> getAllData() {
    return loginRepo.findAll();
  }
}
