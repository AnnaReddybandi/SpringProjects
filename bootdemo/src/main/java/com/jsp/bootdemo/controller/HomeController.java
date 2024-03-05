package com.jsp.bootdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.bootdemo.dto.Student;
import com.jsp.bootdemo.exception.StudentNotFound;
import com.jsp.bootdemo.helper.ResponseStructure;
import com.jsp.bootdemo.repositary.StudentRepositary;

@RestController
public class HomeController {
	
	 @Autowired
	 StudentRepositary repositary; 
	 
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student) {
		
		repositary.save(student);
		return "data saved";
		
	}
	
	@GetMapping("/fetchstudent")
	public ResponseStructure<Student>  fetchstudent(@RequestParam("id") int id) {
	Optional<Student>option=	repositary.findById(id);
	   if(option.isPresent()) {
		Student student=option.get();
		 ResponseStructure<Student> response=new ResponseStructure<Student>();
		 response.setStatuscode(HttpStatus.FOUND.value());
		 response.setMeg("data found successfully");
		 response.setData(student);
		 return response;	
	   }
	   else {
		   
		   throw new StudentNotFound("student not found");
		   
		   
	   }
	}
	
	@DeleteMapping("/delete")
	public ResponseStructure<String>  deleteStudent(@RequestParam("id")int id) {
		       repositary.deleteById(id);
		       ResponseStructure<String> response=new ResponseStructure<String>();
		       response.setStatuscode(HttpStatus.FOUND.value());
		       response.setMeg("data deleted successfully");
		     //  response.getData();
		     return response;
	}

	
//	@GetMapping("fetchstudentbyname")    //localhost:8080/fetchstudentbyname?name=kittu
//	public List <Student> fetchstudentbyname(@RequestParam("name") String name){
//		return repositary.findByName(name);
//		
//	}
//	
//	@GetMapping("/fetchstudentbyage")    //localhost:8080/fetchstudentbyage?age=23
//	public List<Student> fetchstudentbyage(@RequestParam("age")int age){
//		return repositary.findByAge(age);
//	}
//	
	
	
	
//	@GetMapping("/fetchstudentbyageless")
//	public List<Student> fetchstudentbyageless(@RequestParam("age") int age){
//		return repositary.findByAgeLessThan(age);
//	}
//	
//	
//	@GetMapping("/fetchstudentbyagegreaterthan")
//	public List<Student> fetchstudentbyagegreat(@RequestParam("age") int age){
//		return repositary.findByAgeGreaterThan(age);
//	}
//	
	
//	@GetMapping("/fetchagebtw")
//	public List<Student> findByAgebetween(@RequestParam("start") int start,@RequestParam("end") int end){		
//		return  repositary.findByAgeBetween(start, end);
//	}
//	
	
	
	
	
	
	
	
	

}
