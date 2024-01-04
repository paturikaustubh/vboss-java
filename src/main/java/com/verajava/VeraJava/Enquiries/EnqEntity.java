package com.verajava.VeraJava.Enquiries;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "enquiries")
@NoArgsConstructor
public class EnqEntity {
  
  @Id
  private String enqNumber;
  private String clientContact;
  private String startDate;
  private String endDate;
  private String comments;
  private String stage;
  private int usdConversion;
  private int eurConversion;
  private String remarks;
  private String modifiedDate;
  private String pseudoCode;

}
