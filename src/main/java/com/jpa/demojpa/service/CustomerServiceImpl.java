package com.jpa.demojpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demojpa.dao.CartRespository;
import com.jpa.demojpa.dao.CustomerRepository;
import com.jpa.demojpa.dao.ProductRespository;
import com.jpa.demojpa.entity.Cart;
import com.jpa.demojpa.entity.Customer;
import com.jpa.demojpa.entity.Product;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CartRespository cartRespository;
	
	@Autowired
	private ProductRespository productRespository;
	
	@Override
	public Customer addCustomer(Customer newCustomer) {

		Cart cart = new Cart(); // new state
		cart = this.cartRespository.save(cart); // get reference of managed object
		newCustomer.setCart(cart); // assign new cart to customre	
		
		return this.customerRepository.save(newCustomer);
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		
		return this.customerRepository.findById(customerId).get();
	}

	@Override
	public Cart addProductToCutomerCartByid(Integer customerId, Integer productId) {
		// to do exception handling for customer and product
		
		Optional<Customer> customerOpt = this.customerRepository.findById(customerId);
		//if(customerOpt.isEmpty()) throw new 
		
		Optional<Product> productOpt = this.productRespository.findById(productId);
		//if(productOpt.isEmpty())
		Product product = productOpt.get();
		Customer customer = customerOpt.get();
		customer.getCart().getProducts().add(product);
		this.customerRepository.save(customer);
		
		return customer.getCart();
	}

}
