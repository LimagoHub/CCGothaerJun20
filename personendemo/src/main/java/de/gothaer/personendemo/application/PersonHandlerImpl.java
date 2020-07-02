package de.gothaer.personendemo.application;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.gothaer.personendemo.services.PersonService;
import de.gothaer.personendemo.services.PersonenServiceException;
import de.gothaer.personendemo.services.domainobjects.Person;

@Service
@Transactional(rollbackFor = PersonenServiceException.class)
public class PersonHandlerImpl implements PersonHandler
{
	
	private final PersonService personService;

	public PersonHandlerImpl(PersonService personService) {
		this.personService = personService;
	}

	@Override
	public void handleSave(Person person) throws PersonenServiceException {
		try {
			personService.speichern(person);
			// Log
			// Erfolgevent
		} catch (PersonenServiceException e) {
			// log
			// Fehlerevent
			throw e;
		}
		
	}
	
	
	
}
