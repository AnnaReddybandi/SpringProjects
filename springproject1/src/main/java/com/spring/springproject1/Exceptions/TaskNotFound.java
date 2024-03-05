package com.spring.springproject1.Exceptions;

public class TaskNotFound extends RuntimeException {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TaskNotFound(String mess) {
		
		message = mess;
	}
	

}
