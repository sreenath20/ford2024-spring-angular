package com.jpa.demojpa.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class CustomerOrder {

	@Id
	@GeneratedValue
	private Integer id;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private String status;
	
	@ManyToMany
	private List<Product> products = new ArrayList<>();
	
	@OneToOne
	private Payment payment;
	
	
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public CustomerOrder(Integer id, LocalDate orderDate, LocalDate deliveryDate, String status, List<Product> products,
			Payment payment) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.products = products;
		this.payment = payment;
	}
	public CustomerOrder() {
		super();
	}
	public CustomerOrder(Integer id, LocalDate orderDate, LocalDate deliveryDate, String status) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
