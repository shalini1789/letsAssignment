package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails_tbl")
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderdetails_id;
	
	@ManyToOne
	@JoinColumn(name = "orderId")
	private Order orderId;
	
	@ManyToOne
	@JoinColumn(name="productId")
	
	private ProductDetails productId;
	
	private int quantity;
	
	public OrderDetails() {
		System.out.println("order details default  constructor");
	}
	
	public int getOrderdetails_id() {
		return orderdetails_id;
	}

	public void setOrderdetails_id(int orderdetails_id) {
		this.orderdetails_id = orderdetails_id;
	}

	public Order getOrderId() {
		return orderId;
	}

	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}

	public ProductDetails getProductId() {
		return productId;
	}

	public void setProductId(ProductDetails productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	
	
	

}
