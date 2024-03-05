package com.jpa.demojpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jpa.demojpa.entity.Customer;
import com.jpa.demojpa.entity.Product;
import com.jpa.demojpa.service.AdminService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("product")
	public Product addNewProduct(@RequestBody Product product) {
		return this.adminService.addProduct(product);
		
	}
	
	@GetMapping("products")
	public List<Product> getAllProducts() {
		return this.adminService.getAllProducts();
		
	}
	@GetMapping("customers")
	public List<Customer> getAllCustomers(){
		return this.adminService.getAllCustomers();
	}
	
}
