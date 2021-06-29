package com.demo.hospital.managment.schedulerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.hospital.managment.schedulerservice.model.Appointment;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
