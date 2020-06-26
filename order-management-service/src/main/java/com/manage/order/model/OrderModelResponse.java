package com.manage.order.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
public class OrderModelResponse {
	private String customerName;

	private String shippingAddress;

	@NotNull
	private List<OrderItemModel> orderItems;

	private BigDecimal totalPrice;

	private Date orderDate;

	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public List<OrderItemModel> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItemModel> orderItems) {
		this.orderItems = orderItems;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

}
