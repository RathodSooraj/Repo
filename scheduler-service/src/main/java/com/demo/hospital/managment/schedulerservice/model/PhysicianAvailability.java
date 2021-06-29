package com.demo.hospital.managment.schedulerservice.model;

import java.time.LocalTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
public class PhysicianAvailability {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer physicianAvailabilityId;
	private Integer physicianId;
	private LocalTime mondayFrom;
	private LocalTime mondayTo;
	private LocalTime tuesdayFrom;
	private LocalTime tuesdayTo;
	private LocalTime wednesdayFrom;
	private LocalTime wednesdayTo;
	private LocalTime thursdayFrom;
	private LocalTime thursdayTo;
	private LocalTime fridayFrom;
	private LocalTime fridayTo;
	private LocalTime saturdayFrom;
	private LocalTime saturdayTo;
	private String status;

}
