package com.example.doctorservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.doctorservice.entity.Doctor;
import com.example.doctorservice.repository.DoctorRepository;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
    private DoctorRepository docRepo;

    
    @PostMapping("/create")
    public ResponseEntity<Doctor> create(@RequestBody Doctor doctor){
    	return new  ResponseEntity<>(docRepo.save(doctor), HttpStatus.CREATED);
    }
    @GetMapping("/retrieve")
    public ResponseEntity<List<Doctor>> retrieve(){
    	return ResponseEntity.ok().body(docRepo.findAll());
    }
    @GetMapping("/retrieveId/{id}")
    public ResponseEntity<?> retrieveId(@PathVariable Long id){
    	Optional<Doctor> docoptional= docRepo.findById(id);
    		if(docoptional.isPresent()){
    			return new ResponseEntity<>(docRepo.findById(id), HttpStatus.OK);
    		}
    		else {
    			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    		}
    	}
    			
    }

