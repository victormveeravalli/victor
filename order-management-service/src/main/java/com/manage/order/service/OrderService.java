package com.manage.order.service;

import java.util.List;

import com.manage.order.dto.OrderEntity;
import com.manage.order.model.OrderModel;

public interface OrderService {
	OrderEntity createOrder(OrderModel order);

	
	List<OrderEntity> getAllOrders();

	OrderModel getOrderById(long orderId);


}
