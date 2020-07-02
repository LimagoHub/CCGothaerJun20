package de.gothaer.personendemo.services;

import de.gothaer.personendemo.repositories.models.PersonRepository;
import de.gothaer.personendemo.services.domainobjects.Person;
import de.gothaer.personendemo.services.domainobjects.PersonMapper;



public class PersonServiceImpl implements PersonService {
	
	private final PersonRepository personRepository;
	private final PersonMapper personMapper;

	public PersonServiceImpl(PersonRepository personRepository, PersonMapper personMapper) {
		this.personRepository = personRepository;
		this.personMapper = personMapper;
	}


	@Override
	public void speichern(Person person) throws PersonenServiceException {
		try {
			// validierung
			// fachlichen prüfungen
			
			personRepository.save(personMapper.convert(person));
		} catch (RuntimeException e) {
			throw new PersonenServiceException();
		}
	}

}
