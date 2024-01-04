package com.verajava.VeraJava.TEST.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "testTable")
@NoArgsConstructor
public class VBOSS {
  
  @Id
  @Column(name = "id")
  @GeneratedValue
  private int id;

  private int Marks;
  private String name;
}
