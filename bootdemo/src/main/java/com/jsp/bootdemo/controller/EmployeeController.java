package com.jsp.bootdemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.bootdemo.dto.Employee;
import com.jsp.bootdemo.repositary.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@PostMapping("/saveemp")
	public String saveemp(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "employee details saved";
		
	}
	
	@GetMapping("/fetchemp")
	public Employee fetchemp(@RequestParam("id") int id) {
		
 Optional<Employee> option=		employeeRepository.findById(id);
		 Employee employee=  option.get();
		 return employee;
		
	}

	
}
