package com.manage.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manage.order.dto.OrderEntity;
import com.manage.order.model.OrderModel;
import com.manage.order.model.OrderModelResponse;
import com.manage.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderservice;

	@GetMapping("/getOrders")
	public ResponseEntity<List<OrderEntity>> getAllOrder() {
		return ResponseEntity.ok().body(orderservice.getAllOrders());
	}

	@GetMapping("/getOrders/{id}")
	public ResponseEntity<OrderModelResponse> getOrderById(@PathVariable long id) {
		return ResponseEntity.ok().body(orderservice.getOrderById(id));
	}

	@PostMapping("/createOrders")
	public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderModel order) {
		return ResponseEntity.ok().body(this.orderservice.createOrder(order));
	}

	
}
