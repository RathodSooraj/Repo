package com.demo.hospital.managment.schedulerservice.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "User_table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "user_id_col")
	private Integer id;
	@Column(name = "user_firstname_col")
	private String firstName;
	@Column(name = "user_lastname_col")
	private String lastName;
	@Column(name = "user_email_col")
	private String email;
	@Column(name = "user_password_col")
	private String password;
	@Column(name = "user_dob_col")
	private LocalDate dateOfBirth;
	@Column(name = "user_status_col")
	private String status;
	@Column(name = "user_wrong_password_attempt_col")
	private Integer passwordAttempt;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "role_id_fk_col", unique = false)
	private Role role;

}
