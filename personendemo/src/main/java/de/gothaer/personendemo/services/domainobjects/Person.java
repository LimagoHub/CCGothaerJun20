package de.gothaer.personendemo.services.domainobjects;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	
	@Size(min = 36, max = 36)
	private String id;
	
	
	private int version;
	
	@Size( max = 20)
	private String vorname;
	
	@NotEmpty
	@Size( max = 20)
	private String nachname;
	
	private LocalDate geburtsdatum;

}
