package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer_tbl")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cust_id;


	@Column(name = "customer_name") 
	private String name;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "mobile_no")
	private String mobileno;
	
	private  String email;
	
	private String password;

	
	public Customer(){
		System.out.println("in customer default constructor");
		
	}
	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer(int cust_id, String name, String dob, String mobileno, String email, String password) {
		super();
		this.cust_id = cust_id;
		this.name = name;
		this.dob = dob;
		this.mobileno = mobileno;
		this.email = email;
		this.password = password;
	}

	
	
	
	
			
	
	
}
