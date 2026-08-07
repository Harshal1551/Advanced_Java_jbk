package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.CustomerOrder;
import com.tka.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	
	

	public CustomerOrder sendOrder(CustomerOrder order) {
		
		return repository.save(order);
	}
	
	
	public List<CustomerOrder> orderAboveAmt(double amount) {
		
		return repository.;
	}


	

	
	

}
