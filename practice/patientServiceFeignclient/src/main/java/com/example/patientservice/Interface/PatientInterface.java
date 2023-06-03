package com.example.patientservice.Interface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.doctorservice.entity.Doctor;

@FeignClient(value="patientServiceFeignclient", url="http://localhost:8090/doctor")
public interface PatientInterface {

	@RequestMapping(method=RequestMethod.GET, value="/retrieve")
	public List<Doctor> getDoctor();
}
