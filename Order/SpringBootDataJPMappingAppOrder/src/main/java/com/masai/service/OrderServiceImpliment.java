package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Order;
import com.masai.repository.OrderDao;

@Service
public class OrderServiceImpliment implements OrderService{

	@Autowired
	private OrderDao ordao;
	
	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		
		return ordao.save(order);
	}


}
