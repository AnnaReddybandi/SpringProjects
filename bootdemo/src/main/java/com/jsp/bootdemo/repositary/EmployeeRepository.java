package com.jsp.bootdemo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.bootdemo.dto.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
