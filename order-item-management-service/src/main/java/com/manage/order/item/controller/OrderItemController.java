package com.manage.order.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manage.order.item.model.OrderItem;
import com.manage.order.item.model.OrderItemModel;
import com.manage.order.item.service.OrderItemService;

@RestController
public class OrderItemController {

	@Autowired
	private OrderItemService orderItemService;

	@GetMapping("/getOrderItems")
	public ResponseEntity<List<OrderItem>> getAllOrderItems() {
		return ResponseEntity.ok().body(orderItemService.getAllOrderItems());
	}

	@GetMapping("/orderItemsbyCodes/{codes}")
	public ResponseEntity<List<OrderItem>> getOrderItemByIds(@PathVariable List<String> codes) {
		return ResponseEntity.ok().body(orderItemService.getOrderItemById(codes));
	}

	@PostMapping("/createOrderItems")
	public ResponseEntity<OrderItem> createOrderItem(@RequestBody OrderItemModel order) {
		return ResponseEntity.ok().body(this.orderItemService.createOrderItem(order));
	}

	
}
