package com.demo.hospital.managment.schedulerservice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roleId;
	@Column(nullable = false)
	private String role;

	@OneToMany(mappedBy = "role", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	List<User> user;

}
