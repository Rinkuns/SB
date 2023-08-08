package com.example.start.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.start.entities.ResourceEntity;

@Repository
public interface ResourceRepo extends JpaRepository<ResourceEntity, Integer> {

}
