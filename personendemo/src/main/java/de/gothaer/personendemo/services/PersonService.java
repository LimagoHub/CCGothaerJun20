package de.gothaer.personendemo.services;

import de.gothaer.personendemo.services.domainobjects.Person;

public interface PersonService {
	
	public void speichern(Person person) throws PersonenServiceException;
	

}
