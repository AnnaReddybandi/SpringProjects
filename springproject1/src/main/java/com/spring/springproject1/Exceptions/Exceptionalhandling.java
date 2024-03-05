package com.spring.springproject1.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.springproject1.Helper.TaskResponsiveStructure;
import com.spring.springproject1.Helper.UserResponseStucture;

@RestControllerAdvice
public class Exceptionalhandling {
	
	
	
	@ExceptionHandler(UserNotFound.class)
	public UserResponseStucture<UserNotFound> m1(UserNotFound u){
		UserResponseStucture<UserNotFound> response=new UserResponseStucture<UserNotFound>();
		
		response.setStatuscode(HttpStatus.NOT_FOUND.value());
		response.setMesg("user not found");
		response.setData(u);
		return response;
	}

	
	
	@ExceptionHandler(TaskNotFound.class)
	public TaskResponsiveStructure<TaskNotFound> m2(TaskNotFound ts){
		TaskResponsiveStructure<TaskNotFound> response=new TaskResponsiveStructure<TaskNotFound>();
		response.setStatuscode(HttpStatus.NOT_FOUND.value());
		response.setMessage("task not assigned");
		response.setData(ts);
		return response;
	}
}
