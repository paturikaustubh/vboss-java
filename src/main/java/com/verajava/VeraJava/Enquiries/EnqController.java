package com.verajava.VeraJava.Enquiries;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/enquiry")
@CrossOrigin
public class EnqController {
  
  @Autowired
  private EnqService enqService;

    @PutMapping(path = "/{enqNumber}")
    public Boolean updateDetails (@RequestBody EnqEntity enqEntity, @PathVariable String enqNumber) {
      Boolean done = enqService.updateDetails(enqEntity, enqNumber);
      System.out.println(done);
      return true;
    }

  @GetMapping
  public List<EnqEntity> getAllDetails() {
    return enqService.getAllDetails();
  }

  @GetMapping(path = "/{enqNumber}", headers = "enquiry")
  public Optional <EnqEntity> getDetailsByEnqNumber(@PathVariable String enqNumber) {
    return enqService.getDetailsByEnqNumber(enqNumber);
  }

  @GetMapping
  public Object[] getAllEnqs() {
    return enqService.getAllEnqs();
  }  

  @GetMapping(path = "/{enqNumber}", headers = "enddate")
  public EnqEntity getSpecificEnq(@PathVariable String enqNumber) {
    return enqService.getSpecificEnq(enqNumber);
  }  
}
