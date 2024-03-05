package com.jsp.bootdemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.bootdemo.dto.Product;
import com.jsp.bootdemo.repositary.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository repository;

	@PostMapping("/saveproduct")
	public String saveproduct(@RequestBody Product p) {
		repository.save(p);
		return "save product data ";

	}

	@GetMapping("/fetchproduct")
	public Product fetchproduct(@RequestParam("id") int id) {
	Optional<Product>option=	repository.findById(id);
	 Product product=option.get();
	   return product;
		
	}

}
