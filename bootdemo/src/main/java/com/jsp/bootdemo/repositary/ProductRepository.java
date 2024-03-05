package com.jsp.bootdemo.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.bootdemo.dto.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer>{

    List<Product>findByName(String name);
	
	
	
}
