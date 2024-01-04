package com.verajava.VeraJava.Enquiries;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/enquiry")
public class EnqController {
  
  @Autowired
  private EnqService enqService;

  @GetMapping
  public List<EnqEntity> getAllDetails(){
    return enqService.getAllDetails();
  }

  @GetMapping("/{enqNumber}")
  public Optional <EnqEntity> getDetailsByEnqNumber(@PathVariable String enqNumber) {
    return enqService.getDetailsByEnqNumber(enqNumber);
  }
  
}
