package com.jpa.demojpa.controller;

import com.jpa.demojpa.exceptions.ProductException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jpa.demojpa.exceptions.AccountExceptions;

@RestControllerAdvice
public class AccountControllerAdvice {

	@ExceptionHandler(value = { AccountExceptions.class })
	public ResponseEntity<String> handleAccountException(AccountExceptions e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value = { ProductException.class })
	public ResponseEntity<String> handleProductException(ProductException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
