package com.manage.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manage.order.dto.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}
