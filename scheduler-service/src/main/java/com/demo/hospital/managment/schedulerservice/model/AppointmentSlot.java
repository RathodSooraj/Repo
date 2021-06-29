package com.demo.hospital.managment.schedulerservice.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "appointment_slot_table")
public class AppointmentSlot {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "slot_id_col")
	private Integer appointmentSlotId;

	@Column(name = "slot_start_time_col")
	private LocalDateTime startTime;
	@Column(name = "slot_end_time_col")
	private LocalDateTime endTime;


}
