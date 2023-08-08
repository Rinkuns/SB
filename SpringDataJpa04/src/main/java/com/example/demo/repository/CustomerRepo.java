package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Serializable> {
	
	

}
