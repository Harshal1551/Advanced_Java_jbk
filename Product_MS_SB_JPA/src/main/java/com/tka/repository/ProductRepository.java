package com.tka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {

}
