package com.ibm.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibm.demo.entity.Order;

@Service
public class OrderService { //spring bean
	public String createOrder(@RequestBody Order order) {
		System.out.println(order);
		return "order created";

}}
