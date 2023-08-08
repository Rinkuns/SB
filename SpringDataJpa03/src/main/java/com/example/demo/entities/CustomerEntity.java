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
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	@Column(name="CUSTOMER_EMAIL")
	private String customerEmail;
	
	
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}



	public void setCustomerNmae(String customerNmae) {
		this.customerName = customerNmae;
	}



	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}



	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", customerNmae=" + customerName + ", customerEmail="
				+ customerEmail + "]";
	}
	
	

}
