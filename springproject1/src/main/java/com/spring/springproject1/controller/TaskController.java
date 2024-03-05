package com.spring.springproject1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.springproject1.Dto.Task;
import com.spring.springproject1.Helper.TaskResponsiveStructure;
import com.spring.springproject1.repositary.taskrepositary;

public class TaskController {

	@Autowired
	taskrepositary taskrepositary;
	
	
	
	
	
	@PostMapping("/{user_id}savetaskdata")
	public TaskResponsiveStructure<Task> savedata(@RequestBody Task task){
		taskrepositary.save(task);
		TaskResponsiveStructure<Task> response=new TaskResponsiveStructure<Task>();
		response.setStatuscode(HttpStatus.ACCEPTED.value());
		response.setMessage("data saved");
		response.setData(task);
		return response;	
	}
}
