package com.jsp.bootdemo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	private int id;
	private String name;
	private String brand;
	private String catogery;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCatogery() {
		return catogery;
	}
	public void setCatogery(String catogery) {
		this.catogery = catogery;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
