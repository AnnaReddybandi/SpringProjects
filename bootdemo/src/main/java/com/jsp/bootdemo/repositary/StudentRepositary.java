package com.jsp.bootdemo.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.bootdemo.dto.Student;

public interface StudentRepositary extends JpaRepository<Student, Integer>{
     //    List<Student> findByName(String name);
//      List<Student>findByAge(int age);
//      Student findByEmailAndPassword(String email, String password);
//      List<Student> findByAgeLessThan(int age);
//     List<Student> findByAgeGreaterThan(int age);
//      
//      
//   Student  findByMobileNumber(long mobilenumber);
//     
//    List< Student> findByAgeBetween(int start , int end); 
//     Student findByAgeAndMobilenumber(int age, long mobilenumber);
      
} 
