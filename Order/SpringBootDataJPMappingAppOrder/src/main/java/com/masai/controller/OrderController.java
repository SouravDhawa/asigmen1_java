package com.masai.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Order;
import com.masai.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private	OrderService oredservice;
	
	@PostMapping("/order")
	public ResponseEntity<Order> saveOrderhandeller(@RequestBody Order order) {
		Order oreder= oredservice.addOrder(order);
		return new ResponseEntity<Order>(oreder,HttpStatus.ACCEPTED);
	}
}
