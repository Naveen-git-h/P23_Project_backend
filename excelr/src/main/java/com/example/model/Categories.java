package com.example.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Categories {
	private Long id;
	private String name;
	private String description;
}
