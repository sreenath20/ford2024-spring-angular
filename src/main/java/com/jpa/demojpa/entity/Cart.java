package com.jpa.demojpa.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Cart {

	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToMany
	private List<Product> products = new ArrayList<>();

	public Cart() {
		super();
	}

	public Cart(Integer id, List<Product> products) {
		super();
		this.id = id;
		this.products = products;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
