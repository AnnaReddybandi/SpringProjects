package com.jsp.bootdemo.exception;

public class StudentNotFound extends RuntimeException{
	
	String message  ;
	
	public StudentNotFound(String mesg) {
		message=mesg;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
