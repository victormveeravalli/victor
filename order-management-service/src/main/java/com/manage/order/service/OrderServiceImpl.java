package com.manage.order.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manage.order.dto.OrderDetails;
import com.manage.order.dto.OrderEntity;
import com.manage.order.exception.ResourceNotFoundException;
import com.manage.order.feign.OrderItemClient;
import com.manage.order.model.OrderItemsModel;
import com.manage.order.model.OrderModel;
import com.manage.order.repository.OrderDetailsRepository;
import com.manage.order.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	@Autowired
	OrderDetailsRepository orderDetailsRepository;

	@Autowired
	OrderItemClient orderItemClient;

	@Override
	public OrderEntity createOrder(OrderModel orderDto) {
		// TODO Auto-generated method stub
		BigDecimal sum;
		OrderEntity order = new OrderEntity();
		
		// order.setShippingAddress(orderDto.get);
	//	sum = orderDto.getOrderItems().stream().map(x -> x.getPrice()).reduce(BigDecimal::add).get();

		//orderDto.setTotalPrice(sum);
		BeanUtils.copyProperties(orderDto, order);
		
		//return orderRepository.save(order);
		orderRepository.save(order);
		for(OrderItemsModel od:orderDto.getOrderItems()){
			OrderDetails orddetails=new OrderDetails();
			BeanUtils.copyProperties(od, orddetails);
			orddetails.setOrderId(order.getOrderId());
			
			orderDetailsRepository.save(orddetails);
			
		}
		order.getOrderId();
		
		System.out.println("order  :: "+order.toString());
		return order;
	}

	@Override
	public List<OrderEntity> getAllOrders() {
		// TODO Auto-generated method stub
		return this.orderRepository.findAll();
	}

	@Override
	public OrderModel getOrderById(long orderId) {
		// TODO Auto-generated method stub
		Optional<OrderEntity> order = orderRepository.findById(orderId);
//OrderItem orderItem=new OrderItem();
		OrderModel orderModel = new OrderModel();
		//order.get().getOrderItems().stream().map(x -> x.getProductCode()).collect(Collectors.toList());
//orderItem=orderItemClient.getOrderItem(orderId);
		if (order.isPresent()) {
			BeanUtils.copyProperties(order.get(), orderModel);
			return orderModel;
		} else {
			throw new ResourceNotFoundException("Record not found with id : " + orderId);
		}
	}

}
