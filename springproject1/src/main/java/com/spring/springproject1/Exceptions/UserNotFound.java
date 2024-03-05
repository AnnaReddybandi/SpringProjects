package com.spring.springproject1.Exceptions;

public class UserNotFound extends RuntimeException{
	private String message;

	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UserNotFound(String mesg) {	
		message = mesg;
	}
	

}
