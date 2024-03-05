package com.jpa.demojpa.controller;

import java.util.List;
import java.util.Optional;

import com.jpa.demojpa.dao.ProductRespository;
import com.jpa.demojpa.exceptions.ProductException;
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

	@Autowired
	private ProductRespository productRespository;
	@PostMapping("product")
	public Product addNewProduct(@RequestBody Product product)throws ProductException {
		return this.adminService.addProduct(product);
		
	}

	@DeleteMapping("product/{id}")
	public Product deleteProductById(@PathVariable("id") Integer id){

		Optional<Product> pOpt = this.productRespository.findById(id);

		this.productRespository.deleteById(id);

		return pOpt.get();
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
