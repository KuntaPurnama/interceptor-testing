package com.interceptop.interceptordemo.controller;

import com.interceptop.interceptordemo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @PostMapping("/users")
  public String insertStudent(@RequestHeader("user-auth-key") String auth, @RequestBody
      User user){
    return "Authorization " + auth + " valid dengan nama user : " + user.getName();
  }

}
