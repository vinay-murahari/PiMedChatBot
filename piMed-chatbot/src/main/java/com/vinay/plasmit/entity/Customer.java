package com.vinay.plasmit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="customer_fname")
	private String customerFirstName;
	
	@Column(name="customer_lname")
	private String customerLastName;
	
	@Column(name="customer_phoneno")
	private int customerPhoneNumber;
	
	public Customer() {
		
	}

	public Customer(int customerId, String customerFirstName, String customerLastName, int customerPhoneNumber) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public int getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(int customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customerPhoneNumber=" + customerPhoneNumber + "]";
	}
	
}
