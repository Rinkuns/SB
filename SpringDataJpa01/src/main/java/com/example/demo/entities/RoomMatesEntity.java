package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ROOM_MATES")
public class RoomMatesEntity {
	
	@Id
	@Column(name="NAME")
	private String name;
	
	@Column(name="CONTACTNUMBER")
	private Long contactnumber;
	
	@Column(name="ADDRESS")
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
}
