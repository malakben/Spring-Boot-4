package org.malak.employes.service;

import java.util.List;

import org.malak.employes.entities.Employee;

public interface EmployeService {
	Employee saveEmploye(Employee e);
	Employee updateEmploye(Employee e);
	void deleteEmploye(Employee e);
	void deleteEmployeById(Long id);
	Employee getEmploye(Long id);
	List<Employee> getAllEmployes();

	List<Employee> findByNom(String nom);
	List<Employee> findByPrenom(String prenom);
	List<Employee> findByNomContains(String nom);
	List<Employee> findByNomPrenom (String nom, String Prenom);
	List<Employee> findByOrderByPrenomAsc();
	List<Employee> TrierEmployeeNom();


}
