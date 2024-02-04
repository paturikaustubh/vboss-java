package com.verajava.VeraJava.Enquiries;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnqService {
  @Autowired
  private EnqRepo enqRepo;

  public List<EnqEntity> getAllDetails() {
    return enqRepo.findAll();
  }

  public Optional <EnqEntity> getDetailsByEnqNumber(String enqNumber) {
    return enqRepo.findById(enqNumber);
  }

  public Object[] getAllEnqs() {
    Object[] result = enqRepo.getAllEnqs().toArray();
    return result;
  }

  public EnqEntity getSpecificEnq(String where) {
    return enqRepo.getSpecificEnq(where);
  }

  public Boolean updateDetails(EnqEntity enqEntity, String enqNumber) {
    EnqEntity updateEntity = enqRepo.findById(enqNumber).orElse(null);

    if(updateEntity!=null) {
      updateEntity.setStage(enqEntity.getStage());
      enqRepo.save(updateEntity);
      return true;
    }
    return false;
  }
}
