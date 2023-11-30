package com.example.patientmanagement.service;

import java.util.List;

import com.example.patientmanagement.model.Patient;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    void savePatient(Patient patient);
    void deletePatient(Long id);
}
