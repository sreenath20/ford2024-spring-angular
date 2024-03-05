package com.jpa.demojpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.demojpa.dto.CustomerCartDto;
import com.jpa.demojpa.entity.Cart;
import com.jpa.demojpa.entity.Customer;
import com.jpa.demojpa.entity.Product;
import com.jpa.demojpa.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("customer")
	public Customer regeisterNewCustomer(@RequestBody Customer customer) {
		
		return this.customerService.addCustomer(customer);
	}
	

	@GetMapping("customer/{id}")
	public Customer getCustomerById(@PathVariable Integer customerId) {
		
		return this.customerService.getCustomerById(customerId);
	}

	@PatchMapping("customer/cart")
	public Cart addProductToCutomerCart(@RequestBody CustomerCartDto customerCartDto) {
		
		return this.customerService.addProductToCutomerCartByid
				(customerCartDto.getCustomerId(),customerCartDto.getProductId());
	}
	
}
