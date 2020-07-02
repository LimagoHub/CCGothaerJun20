package de.gothaer.personendemo.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.gothaer.personendemo.repositories.models.PersonRepository;
import de.gothaer.personendemo.services.PersonService;
import de.gothaer.personendemo.services.PersonServiceImpl;
import de.gothaer.personendemo.services.domainobjects.PersonMapper;

@Configuration
public class PersonServiceConfig {
	
	@Bean
	public PersonService getPersonService(PersonRepository personRepository, PersonMapper mapper) {
		return new PersonServiceImpl(personRepository, mapper);
	}

}
