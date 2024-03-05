package com.jsp.bootdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.bootdemo.dto.Student;
import com.jsp.bootdemo.helper.ResponseStructure;

@RestControllerAdvice
public class HandlingException {

	 @ExceptionHandler(value = StudentNotFound.class)
	public ResponseStructure<StudentNotFound> m1(StudentNotFound s){
		ResponseStructure<StudentNotFound> response=new ResponseStructure<StudentNotFound>();
		response.setStatuscode(HttpStatus.NOT_FOUND.value());
		response.setMeg(s.getMessage());
		response.setData(s);
		return response;
	}
}
