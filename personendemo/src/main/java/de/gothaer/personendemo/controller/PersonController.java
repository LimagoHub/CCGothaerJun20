package de.gothaer.personendemo.controller;

import javax.validation.Valid;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.gothaer.personendemo.application.PersonHandler;
import de.gothaer.personendemo.services.domainobjects.Person;

@RestController
@RequestMapping("/personen")
public class PersonController {
	
	
	private final PersonHandler handler;
	
	
	
	
	public PersonController(PersonHandler handler) {
		this.handler = handler;
	}




	@PutMapping(path = "/save/version1")
	public ResponseEntity<Void> save(@Valid @RequestBody Person person) throws Exception{
		
		handler.handleSave(person);
		return ResponseEntity.ok().build();
	}

}
