package com.example.demo.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;

@Configuration
public class AppConfig {

	@Bean
	public Patient ram() {
		
		return new Patient(102, "Ram kumar");
	}

	@Bean
	public Patient shyam() {
		
		return new Patient(105, "Shyam Sundar");
	}
	@Bean
	public Doctor rajesh() {
		
		Set<Patient> patientList = new HashSet<>();
		patientList.add(ram());
		patientList.add(shyam());
		
		return new Doctor(9823, "Rajesh", "ent", patientList);
		
	}
}
