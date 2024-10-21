package com.apex.springjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Project {
	
	@Id
	private Long id;
	private String name;

}
