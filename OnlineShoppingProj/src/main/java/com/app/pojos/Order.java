package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_tbl")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private Integer orderId;
	@Column(length= 30,name="order_date")
	private LocalDate date; 
	@Column(name = "qty")
	private double quantity;
	@Enumerated(EnumType.STRING)
	@Column(name = "order_status",length = 30)
	private Status orderStatus;
	@Column(length= 30,name="product_id")
	private int productId;
	@Column(length= 30,name="product_name")
	private String productName;
	@Column(length= 30,name="product_price")
	private String price;
	
	@ManyToOne
   @JoinColumn(name = "cust_id")
	private Customer customerOrder;
	
	public Order() {
		System.out.println("IN Constructor order");
	}
	
	public Order(Integer orderId, LocalDate date, double quantity, Status orderStatus, int productId,
			String productName, String price) {
		super();
		this.orderId = orderId;
		this.date = date;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}


	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Status getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Customer getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(Customer customerOrder) {
		this.customerOrder = customerOrder;
	}



	
	
}
