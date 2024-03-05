package com.jpa.demojpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demojpa.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
