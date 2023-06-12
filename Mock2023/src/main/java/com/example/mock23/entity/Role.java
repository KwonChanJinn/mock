package com.example.mock23.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "role", catalog = "mock2303")
@Entity
public class Role {
	
	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "role_name", length = 50, nullable = false, unique = true)
	private String roleName;
	
}
