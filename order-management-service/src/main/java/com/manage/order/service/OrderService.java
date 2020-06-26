package com.manage.order.service;

import java.util.List;

import com.manage.order.dto.OrderEntity;
import com.manage.order.model.OrderModel;
import com.manage.order.model.OrderModelResponse;

public interface OrderService {
	OrderEntity createOrder(OrderModel order);

	
	List<OrderEntity> getAllOrders();

	OrderModelResponse getOrderById(long orderId);


}
