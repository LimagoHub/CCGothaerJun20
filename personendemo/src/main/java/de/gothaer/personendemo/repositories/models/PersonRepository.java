package de.gothaer.personendemo.repositories.models;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface PersonRepository extends CrudRepository<PersonEntity, String>{
	@Transactional
	@Modifying
	public List<PersonEntity> findPersonEntityByNachname(String nachname);

}
