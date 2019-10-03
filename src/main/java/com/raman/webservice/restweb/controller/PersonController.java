package com.raman.webservice.restweb.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.raman.webservice.restweb.bean.Person;
import com.raman.webservice.restweb.service.PersonService;

@RestController
@CrossOrigin
public class PersonController {
	
	
	@Autowired
	private PersonService personService;
	
	
	@GetMapping("/users")
	public List<Person> getAllPerson(){
		
		return personService.findAll();
		
		
		
		
	}
	
	
	@GetMapping("/users/{user}")
	public Person getAllUsers(@PathVariable String user) {

		return personService.findBy(user);
	}



	
	
	

}
