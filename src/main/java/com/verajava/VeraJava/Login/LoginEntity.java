package com.verajava.VeraJava.Login;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class LoginEntity {
  
  @Id
  private String username;
  private String dispName;
  private String password;
  private String role;
  private String modifiedDate;
}
