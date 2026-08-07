package com.tka.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.CustomerOrder;
import com.tka.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrederController {
	
	@Autowired
	private OrderService service;
	
	
	@PostMapping("/send")
	public CustomerOrder sendOrder(@RequestBody CustomerOrder order) {

		return service.sendOrder(order);
	}  
	
	@GetMapping("/above/{amount}")
	public List<CustomerOrder> orderAboveAmt(@PathVariable double amount){
		
		
		return service.orderAboveAmt(amount);
	}
	
	
	
}
