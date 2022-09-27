package com.example.demo.entity;

import java.util.Set;

public class Doctor {

	private int id;
	private String doctorName;
	// ent,eye,skin,heart,dental
	private String department ;
	//one Doctor has many Patients
	// one to many relation
	Set<Patient> patients;
}
