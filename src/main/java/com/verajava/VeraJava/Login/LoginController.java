package com.verajava.VeraJava.Login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/login")
@CrossOrigin
public class LoginController {
  @Autowired
  private LoginService loginService;

  @GetMapping
  public Object[] getAllData() {
    return loginService.getLoginPermission("kaustubh","goodnight ændi");
  }



}
