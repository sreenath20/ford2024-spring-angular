package com.jpa.demojpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demojpa.dao.CustomerRepository;
import com.jpa.demojpa.dao.ProductRespository;
import com.jpa.demojpa.entity.Customer;
import com.jpa.demojpa.entity.Product;

@Service
public class AdminServieImpl implements AdminService{

	@Autowired
	private ProductRespository productRespository;
	
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Product addProduct(Product product) {
		
		return this.productRespository.save(product);
	}
	@Override
	public List<Product> getAllProducts() {
		
		return this.productRespository.findAll();
	}
	@Override
	public List<Customer> getAllCustomers() {
		
		return this.customerRepository.findAll();
	}

	
}
