package com.demo.hospital.managment.schedulerservice.model;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Appointment{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "appointment_id_col")
	private Integer appointmentId;
	@Column(name = "appointment_title_col")
	private String appointmentTitle;
	@Column(name = "appointment_description_col")
	private String description;
	@Column(name = "appointment_date_col")
	private LocalDate appointmentDate;
	
	//edit history
	@Column(name = "appointment_edit_reason_col")
	private String reasonOfEdit;
	
	
	@Column(name = "appointment_status_col")
	private String appointmentStatus;

	/*
	 * physician id
	 * patient id
	 */
	
}


/*
 * @Column(name = "appointment_start_time_col") private LocalTime
 * appointmentStartTime;
 * 
 * @Column(name = "appointment_end_time_col") private LocalTime
 * appointmentEndTime;
 */
