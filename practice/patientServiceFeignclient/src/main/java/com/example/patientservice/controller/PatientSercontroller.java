package com.example.patientservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.doctorservice.entity.Doctor;
import com.example.patientservice.Interface.PatientInterface;

@RestController
@RequestMapping("/patient")
public class PatientSercontroller {
	
	@Autowired
	private PatientInterface feignclient;
	
	@GetMapping("/get")
	public List<Doctor> getAll(){
		return feignclient.getDoctor();
	}
	}
	
	


