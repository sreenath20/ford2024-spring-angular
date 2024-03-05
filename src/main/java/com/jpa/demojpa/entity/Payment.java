package com.jpa.demojpa.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue
	private Integer id;
	private String type;
	private LocalDate payementDate;
	public Payment() {
		super();
	}
	public Payment(Integer id, String type, LocalDate payementDate) {
		super();
		this.id = id;
		this.type = type;
		this.payementDate = payementDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getPayementDate() {
		return payementDate;
	}
	public void setPayementDate(LocalDate payementDate) {
		this.payementDate = payementDate;
	}
	
	
	
	
}
