package com.example.start.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="RESOURCE_DTLS")
public class ResourceEntity {
	
	@Id
	@Column(name="RESOURCE_ID")
	@SequenceGenerator(name="custGen", sequenceName ="resource_id_seq", allocationSize=1)
	@GeneratedValue(generator="custGen", strategy=GenerationType.SEQUENCE)
	private Integer resourceId;
	
	@Column(name="RESOURCE_NAME")
	private String resourceName;
	
	@Column(name="RESOURCE_EXP")
	private String resourceExp;
	
	@Column(name="RESOURCE_SKILL")
	private String resourceSkill;

}
