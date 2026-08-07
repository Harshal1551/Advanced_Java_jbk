package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Product;
import com.tka.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productservice;

	@PostMapping("/insert-product")
    public Product insertProduct(@RequestBody Product product) {
        return productservice.insertProduct(product);
    }
	

	@GetMapping("/get-one product/{id}")
	public Product getOneProduct(@PathVariable int id) {
		
		return productservice.getOneProduct(id);
	}
	
	
}
