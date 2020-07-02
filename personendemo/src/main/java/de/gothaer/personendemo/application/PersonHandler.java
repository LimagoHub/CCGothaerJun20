package de.gothaer.personendemo.application;

import de.gothaer.personendemo.services.PersonenServiceException;
import de.gothaer.personendemo.services.domainobjects.Person;

public interface PersonHandler {
	
	void handleSave(Person person) throws PersonenServiceException ;

}
