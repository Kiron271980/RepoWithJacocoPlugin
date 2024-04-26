package com.TestJacocoplugin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TestJacocoplugin.personModel.Person;
import com.TestJacocoplugin.service.JacocoService;

@RestController
public class JacocoController {

	@Autowired
	JacocoService jacocoService;
	
	@GetMapping("/person")
	public List<Person> getPersonDetails(){
		
		return jacocoService.personDetails();
	}
}
