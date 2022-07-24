package com.virtualpairprogrammers.roombooking.model;

import com.virtualpairprogrammers.roombooking.entities.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AngularUser {
  private Long id;
  private String name;

  public AngularUser() {
  }

  public AngularUser(User user) {
    this.id = user.getId();
    this.name = user.getName();
  }

  public User asUser(){
    User user = new User();
    user.setId(id);
    user.setName(name);
    user.setPassword("");
    return user;
  }
}
