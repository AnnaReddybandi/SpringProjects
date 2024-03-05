package com.spring.springproject1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springproject1.Dto.User;
import com.spring.springproject1.Helper.UserResponseStucture;
import com.spring.springproject1.repositary.UserRepositary;

@RestController
public class UserController {
 
	
	@Autowired
	UserRepositary repositary;
	
	@PostMapping("/savedata")
	public UserResponseStucture<User> savedata(@RequestBody User user){
		repositary.save(user);
		UserResponseStucture<User> response=new UserResponseStucture<User>();
		response.setStatuscode(HttpStatus.CREATED.value());
		response.setMesg("data is created");
		response.setData(user);
		return response;
	}
	
}
