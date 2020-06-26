package com.manage.order.item.service;

import java.util.List;

import com.manage.order.item.model.OrderItem;
import com.manage.order.item.model.OrderItemModel;

public interface OrderItemService {
	OrderItem createOrderItem(OrderItemModel order);

	
	List<OrderItem> getAllOrderItems();

	List<OrderItem> getOrderItemById(List<String> orderId);


}
