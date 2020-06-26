package com.manage.order.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;



	@Entity
	@Table(name = "ORDER_ITEMS")
	@Data
	public class OrderItemDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	@Column(name="PRODUCT_CODE")
	private String productCode;
	@NotBlank
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@NotBlank
	@Column(name = "QUANTITY")
	private int quantity;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	}


