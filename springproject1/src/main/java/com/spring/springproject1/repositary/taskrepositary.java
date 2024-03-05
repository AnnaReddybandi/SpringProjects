package com.spring.springproject1.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springproject1.Dto.Task;
public interface taskrepositary extends JpaRepository<Task, Long>{

}
