package com.mum.vehiclerentalsystem.model.user;

import com.mum.vehiclerentalsystem.model.ICredential;

@Entity
public class Credential implements ICredential {
  @Id
  @GeneratedValue
  private Long id;
  private String username;
  private String password;
  private Role role;
}
