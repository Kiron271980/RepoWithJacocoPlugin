package com.TestJacocoplugin.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestJacocoplugin.personModel.Person;
import com.TestJacocoplugin.repo.JacocoRepo;

@Service
public class JacocoService {
	
	@Autowired
	JacocoRepo jacocoRepo;

	public List<Person> personDetails() {
		
		return jacocoRepo.repoDetails();
	}
}
