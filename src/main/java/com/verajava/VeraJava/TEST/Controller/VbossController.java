package com.verajava.VeraJava.TEST.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verajava.VeraJava.TEST.Entity.VBOSS;
import com.verajava.VeraJava.TEST.Service.VbossService;

@RestController
@RequestMapping(path = "/test-details")
public class VbossController {
  
  @Autowired
  private VbossService vbossService;
  
  @PostMapping
  public boolean testDetails(@RequestBody VBOSS vboss) {
    vbossService.saveDetails(vboss);
    return true;
  }

  @GetMapping
  public List <VBOSS> testDetails() {
    return vbossService.getDetails();
  }

  @GetMapping("/{id}")
  public Optional <VBOSS> testDetailsId(@PathVariable int id) {
    return vbossService.getDetailsById(id);
  }

}
