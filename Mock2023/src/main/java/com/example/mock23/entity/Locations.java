package com.example.mock23.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "locations", catalog = "mock2303")
@Entity

public class Locations {
	
	@Id
	@Column(name = "location_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "location_name", length = 50, nullable = false)
	private String locationName;
	
	@Column(name = "information", length = 100, nullable = false, unique = true)
	private String information;
	
	@Column(name = "image", length = 50, nullable = false)
	private String image;

}
