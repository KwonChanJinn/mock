package com.example.mock23.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Table(name = "user", catalog = "mock2303")
@Entity

public class User {
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "full_name", length = 50, nullable = false)
	private String fullName;
	
	@Column(name = "user_name", length = 100, nullable = false, unique = true)
	private String userName;
	
	@Column(name = "password", length = 50, nullable = false)
	private String password;
	
	@Column(name = "phone")
	private String phone;
	
	//thêm thằng role id vào

}
