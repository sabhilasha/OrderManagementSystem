package com.ibm.demo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OrderController {
	@PostMapping("/order")
	String createOrder() {
		return "success";
	}
	@GetMapping("/order")
	String getorder() {
		return "order created";
	}
	@PutMapping("/order/{id}")
	String updateorder(@PathVariable ("id") int orderId) {
		System.out.println(orderId);
		return "order updated";
	}
	@DeleteMapping("/order/{id}")
	String deleteorder(@PathVariable ("id") int orderId) {
		System.out.println(orderId);
		return "order deleted";
	}
	
	

}
