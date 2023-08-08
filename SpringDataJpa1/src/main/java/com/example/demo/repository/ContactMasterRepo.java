package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.ContactMasterEntity;
//@Repository(Optional cause we are extendin6g crud repo so it will auto detected AS Spring bean)
public interface ContactMasterRepo extends CrudRepository<ContactMasterEntity, Serializable>{
	
}
