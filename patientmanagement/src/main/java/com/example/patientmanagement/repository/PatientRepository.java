package com.example.patientmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.patientmanagement.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
