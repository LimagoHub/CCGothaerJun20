package de.gothaer.personendemo.repositories.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "tblPersonen")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {
	
	@Id
	private String id;
	
	@Version
	private int version;
	
	@Column(length =20)
	private String vorname;
	
	@Column(length =20)
	private String nachname;
	
	private LocalDate geburtsdatum;

}
