package com.jpa.demojpa.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double price;
	private LocalDate ManufactureDate;
	
	
	public Product() {
		super();
	}
	public Product( String name, Double price, LocalDate manufactureDate) {
		super();
		//this.id = id;
		this.name = name;
		this.price = price;
		ManufactureDate = manufactureDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getManufactureDate() {
		return ManufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		ManufactureDate = manufactureDate;
	}
	
	
	
}
