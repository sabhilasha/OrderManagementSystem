package com.ibm.demo.service;

import java.util.List;
import java.util.Optional;

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

	public List<Order> getOrders() {
		return orderRepository.findAll();
	}
	public Optional<Order> getOrder(String orderId) {
		return orderRepository.findById(orderId);

	}

	public void updateOrder(@RequestBody Order order) {
		orderRepository.save(order);
	}

	public void deleteOrder(String orderId) {
		orderRepository.deleteById(orderId);
	}
}
