package com.verajava.VeraJava.TEST.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verajava.VeraJava.TEST.Entity.VBOSS;
import com.verajava.VeraJava.TEST.Repository.VbossRepo;

@Service
public class VbossService {
  
  @Autowired
  private VbossRepo vbossRepo;

  public VBOSS saveDetails(VBOSS vboss) {
    return vbossRepo.save(vboss);
  }

  public List <VBOSS> getDetails() {
    return vbossRepo.findAll();
  }

  public Optional <VBOSS> getDetailsById(Integer id) {
    return vbossRepo.findById(id);
  }
}
