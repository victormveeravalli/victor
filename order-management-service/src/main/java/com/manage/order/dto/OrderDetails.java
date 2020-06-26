package com.manage.order.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ORDER_DETAILS")
@Data
public class OrderDetails {
	
	@Id
	@Column(name="ORDER_ITEM_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderItemId;
	
	@Column(name="ORDER_ID")
	private Long orderId;
	@Column(name="PRODUCT_CODE")
	private String productCode;
	@Column(name="QUANTITY")
	private int quantity;
	

	public Long getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	
}
