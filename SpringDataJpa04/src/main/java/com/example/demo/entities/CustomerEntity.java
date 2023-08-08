package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="CUSTOMER_DTLS")
public class CustomerEntity {

	@Id
	@Column(name="CUSTOMER_ID")
	private Integer customerId;
	@Column(name="CUSTOMER_Name")
	private String customerName;
	@Column(name="CUSTOMER_EMAIL")
	private String customerEmail;
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + "]";
	}
	
	
}
