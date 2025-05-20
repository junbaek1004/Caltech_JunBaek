package com.petclinic.course4endproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClinicContoller {

	@GetMapping("/")
	public String simpleMessage() {
		return "Welcome to Dr. Shawn's Pet Clinic!";
	}
}
