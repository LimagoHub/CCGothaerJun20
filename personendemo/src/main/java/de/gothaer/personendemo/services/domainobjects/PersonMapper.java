package de.gothaer.personendemo.services.domainobjects;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import de.gothaer.personendemo.repositories.models.PersonEntity;

@Mapper( componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.WARN)
public interface PersonMapper {
	
	PersonEntity convert(Person person);
	Person convert(PersonEntity personEntity);

}
