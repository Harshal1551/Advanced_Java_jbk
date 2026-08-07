package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Product;
import com.tka.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productrepository;
	
	

	public Product insertProduct(Product product) {
		
		return productrepository.save(product);
	}
	

	public Product getOneProduct(int id) {
		
		return productrepository.findById(id).orElse(null);
	}

	
	
}
