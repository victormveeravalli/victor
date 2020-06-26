package com.manage.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manage.order.dto.OrderDetails;


public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> { 
	 List<OrderDetails> findAllByOrderId(Long orderId);	
}
