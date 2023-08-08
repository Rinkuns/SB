package com.example.start.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.start.entity.ResourceEntity;

public interface ResourceRepo extends JpaRepository<ResourceEntity, Serializable> {

}
