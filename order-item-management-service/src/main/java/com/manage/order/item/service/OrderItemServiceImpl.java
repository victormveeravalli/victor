package com.manage.order.item.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manage.order.exception.ResourceNotFoundException;
import com.manage.order.item.model.OrderItem;
import com.manage.order.item.model.OrderItemModel;
import com.manage.order.item.repository.OrderItemRepository;

@Service
@Transactional
public class OrderItemServiceImpl implements OrderItemService{

	@Autowired
	OrderItemRepository orderItemRepository;
	
	@Override
	public OrderItem createOrderItem(OrderItemModel orderItemModel) {
		// TODO Auto-generated method stub
		
		OrderItem orderItem=new OrderItem();
		BeanUtils.copyProperties(orderItemModel, orderItem);
		
		return orderItemRepository.save(orderItem);
	}

	@Override
	public List<OrderItem> getAllOrderItems() {
		// TODO Auto-generated method stub
		return this.orderItemRepository.findAll();
	}

	@Override
	public List<OrderItem> getOrderItemById(List<String> productCodes) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Optional <List<OrderItem>> orderItem =Optional.ofNullable(orderItemRepository.findAllByProductCodeIn(productCodes));

		if (orderItem.isPresent()) {
			return   orderItem.get();
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + productCodes);
		}
	
	}

	

	

	
	

}
