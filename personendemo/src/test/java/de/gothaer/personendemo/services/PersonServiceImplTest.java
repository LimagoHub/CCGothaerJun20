package de.gothaer.personendemo.services;




import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import de.gothaer.personendemo.repositories.models.PersonRepository;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceImplTest {
	@Mock
	private PersonRepository personRepositoryMock;
	@InjectMocks
	private PersonServiceImpl objectUnderTest;
	
	

}
