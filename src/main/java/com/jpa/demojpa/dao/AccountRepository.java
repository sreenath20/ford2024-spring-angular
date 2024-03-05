package com.jpa.demojpa.dao;

import com.jpa.demojpa.entity.Account;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account,Integer> {

	List<Account> findByNameContaining(String name);
	List<Account> findByNameContainingIgnoreCase(String name);
	List<Account> findByAmountBetween(Double fromAmount,Double toAmount);
	
	Optional<Account> findByEmail(String email);
	

	
}
