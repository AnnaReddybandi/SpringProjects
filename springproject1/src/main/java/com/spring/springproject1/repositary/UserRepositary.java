package com.spring.springproject1.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springproject1.Dto.User;

public interface UserRepositary extends JpaRepository<User, Long> {

}
