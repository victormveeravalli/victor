package com.manage.order.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
public class OrderModel {
	@NotNull
	private String customerName;

	private String shippingAddress;

	@NotNull
	private ArrayList<OrderItemsModel> orderItems;

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

	public ArrayList<OrderItemsModel> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(ArrayList<OrderItemsModel> orderItems) {
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
