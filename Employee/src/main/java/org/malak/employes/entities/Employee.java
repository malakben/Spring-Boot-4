 package org.malak.employes.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmp;
	private String nom;
	private String prenom;
	private String CIN;
	private String service;
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dateNaiss;
	
	@ManyToOne
	private Societe societe;
	
	public Employee(String nom, String prenom, String cIN, String service, String date) {
		super();
		this.nom =nom;
		this.prenom = prenom;
		CIN = cIN;
		this.service = service;
		this.dateNaiss = date;
	}
	
	
}
