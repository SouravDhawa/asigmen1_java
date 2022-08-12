package com.masai.service;


import org.springframework.stereotype.Service;

import com.masai.model.Order;
@Service
public interface OrderService {
	public Order addOrder(Order order);
	
}
