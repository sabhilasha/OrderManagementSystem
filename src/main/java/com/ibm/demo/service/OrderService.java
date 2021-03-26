package com.ibm.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;

@Service
public class OrderService { // spring bean
	@Autowired
	OrderRepository orderRepository;  
	public String createOrder(@RequestBody Order order) {
		Order savedOrder = orderRepository.save(order);
		return savedOrder.getId();
		
	}

	public Order getOrders() {
		return new Order();
	}
	public List<Order> getOrder(int orderId) {
		return new ArrayList<Order>();
	}

	public void updateOrder(@RequestBody Order order) {
		System.out.println(order);
	}

	public String deleteOrder(int orderId) {
		return "order deleted";
	}
}
