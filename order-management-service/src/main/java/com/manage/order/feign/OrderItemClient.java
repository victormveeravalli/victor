package com.manage.order.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manage.order.model.OrderItemModel;


@FeignClient(value="OrderItemManagementService",url="http://localhost:8082/")
public interface OrderItemClient {
	
	 @RequestMapping(method = RequestMethod.GET, value="/orderItemsbyCodes/{codes}")
	 // @GetMapping(value = "/orderItemsbyCodes/{codes}") 
	  public List<OrderItemModel> getOrderItem(List<String> codes);
	 

}
