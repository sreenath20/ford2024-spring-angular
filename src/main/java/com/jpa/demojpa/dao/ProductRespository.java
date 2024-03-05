package com.jpa.demojpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demojpa.entity.Product;

public interface ProductRespository extends JpaRepository<Product, Integer>{

}
