package com.manage.order.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name = "ORDER_ENTITY")
@Data
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ORDER_ID")
	private Long orderId;

	@Column(name = "customername")
	private String customerName;

	@Column(name = "shippingaddress")
	private String shippingAddress;

	@Column(name = "totalprice")
	private BigDecimal totalPrice;

	@CreationTimestamp
	private Date orderDate;

	/*
	 * @OneToMany(mappedBy="orderId",cascade = CascadeType.ALL) private
	 * List<OrderDetails> orderItems;
	 */

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

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

	/*
	 * public List<OrderDetails> getOrderItems() { return orderItems; }
	 * 
	 * public void setOrderItems(List<OrderDetails> orderItems) { this.orderItems =
	 * orderItems; }
	 */

}
