package com.manage.order.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderItemManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderItemManagementServiceApplication.class, args);
	}

}
