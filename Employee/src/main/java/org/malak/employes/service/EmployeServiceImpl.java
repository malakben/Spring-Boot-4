package org.malak.employes.service;

import java.util.List;

import org.malak.employes.entities.Employee;
import org.malak.employes.repose.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeServiceImpl implements EmployeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmploye(Employee e) {
		return employeeRepository.save(e);
	}

	@Override
	public Employee updateEmploye(Employee e) {
		return employeeRepository.save(e);
	}

	@Override
	public void deleteEmploye(Employee e) {
		 employeeRepository.delete(e);
		
	}

	@Override
	public void deleteEmployeById(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee getEmploye(Long id) {
		return employeeRepository.findById(id).get();

	}

	@Override
	public List<Employee> getAllEmployes() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findByNom(String nom) {
		return employeeRepository.findByNomContains(nom);
	}

	@Override
	public List<Employee> findByPrenom(String prenom) {
		return employeeRepository.findByPrenom(prenom);
	}

	@Override
	public List<Employee> findByNomContains(String nom) {
		return employeeRepository.findByNomContains(nom);
	}

	@Override
	public List<Employee> findByNomPrenom(String nom, String Prenom) {
		return employeeRepository.findByNomPrenom(nom, Prenom);
	}

	@Override
	public List<Employee> findByOrderByPrenomAsc() {
		return employeeRepository.findByOrderByPrenomAsc();
	}

	@Override
	public List<Employee> TrierEmployeeNom() {
		return employeeRepository.TrierEmployeeNom();
	}

	
	


}
