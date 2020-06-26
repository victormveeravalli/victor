package com.manage.order.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.manage.order.model.OrderItemModel;


@FeignClient(value="OrderItemManagementService",url="http://localhost:8082")
public interface OrderItemClient {

	
	  @GetMapping(value = "/orderItemsbyCodes/{codes}") 
	  public OrderItemModel getOrderItem(List<String> codes);
	 

}
