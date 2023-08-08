package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.RoomMatesEntity;

public interface RoomMatesRepo extends CrudRepository<RoomMatesEntity, Serializable>{

}
