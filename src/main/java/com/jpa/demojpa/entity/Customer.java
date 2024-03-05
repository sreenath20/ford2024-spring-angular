package com.jpa.demojpa.entity;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	private String password;
	
	@OneToOne
	private Cart cart;
	
	@OneToMany
	private List<CustomerOrder> orders = new ArrayList<>();
	

	public Customer(String name, String email, String password, Cart cart, List<CustomerOrder> orders) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.cart = cart;
		this.orders = orders;
	}

	public Customer() {
		super();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<CustomerOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<CustomerOrder> orders) {
		this.orders = orders;
	}
	
	
	

}
