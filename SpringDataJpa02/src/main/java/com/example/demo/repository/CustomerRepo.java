package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.CustomerEntity;

public interface CustomerRepo extends CrudRepository<CustomerEntity, Serializable> {

}
