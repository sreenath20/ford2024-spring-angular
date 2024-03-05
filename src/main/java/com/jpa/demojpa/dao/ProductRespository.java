package com.jpa.demojpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demojpa.entity.Product;

import java.util.Optional;

public interface ProductRespository extends JpaRepository<Product, Integer>{

    Optional<Product> findByName(String name);
}
