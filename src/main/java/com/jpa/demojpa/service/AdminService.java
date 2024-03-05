package com.jpa.demojpa.service;

import java.util.List;

import com.jpa.demojpa.entity.Customer;
import com.jpa.demojpa.entity.Product;
import com.jpa.demojpa.exceptions.ProductException;

public interface AdminService {
	
	Product addProduct(Product product)throws ProductException;

	List<Product> getAllProducts();

	List<Customer> getAllCustomers();

}
