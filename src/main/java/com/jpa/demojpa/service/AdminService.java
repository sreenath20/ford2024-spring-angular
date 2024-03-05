package com.jpa.demojpa.service;

import java.util.List;

import com.jpa.demojpa.entity.Customer;
import com.jpa.demojpa.entity.Product;

public interface AdminService {
	
	Product addProduct(Product product);

	List<Product> getAllProducts();

	List<Customer> getAllCustomers();

}
