package com.ibm.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibm.demo.entity.Order;

@Service
public class OrderService { // spring bean
	public String createOrder(@RequestBody Order order) {
		System.out.println(order);
		return "order created";
	}

	public String getOrder() {
		return "order recieved";
	}
	public List<Order> getOrders(int orderId) {
		return new ArrayList<Order>();
	}

	public void updateOrder(@RequestBody Order order) {
		System.out.println(order);
	}

	public String deleteOrder(int orderId) {
		return "order deleted";
	}
}
