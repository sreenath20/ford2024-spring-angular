package com.jpa.demojpa.service;

import com.jpa.demojpa.entity.Cart;
import com.jpa.demojpa.entity.Customer;

public interface CustomerService {
	Customer addCustomer(Customer newCustomer);

	Customer getCustomerById(Integer customerId);

	Cart addProductToCutomerCartByid(Integer customerId, Integer productId);

}
