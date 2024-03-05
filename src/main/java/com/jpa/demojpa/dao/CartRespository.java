package com.jpa.demojpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demojpa.entity.Cart;

public interface CartRespository extends JpaRepository<Cart, Integer>{

}
