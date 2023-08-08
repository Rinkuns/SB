package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.CustomerEntity;

public interface CustomerRepo extends CrudRepository<CustomerEntity, Serializable> {

	//public CustomerEntity findByCustomerNmaeAndCustomerEmail(String name, String email);
	//public CustomerEntity findByCustomerName(String name);
	/*
	 * @Query("select customerName from CustomerEntity") public
	 * List<String>findAllNames();
	 */
	@Query(value="select customer_name from customer_dtls", nativeQuery = true)
	public List<String>findCustomerNames();
}
