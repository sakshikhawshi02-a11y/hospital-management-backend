package com.example.hospital_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospital_backend.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}