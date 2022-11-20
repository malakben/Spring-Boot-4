package org.malak.employes.repose;


import java.util.List;

import org.malak.employes.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path = "rest")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee> findByNom(String nom);
	List<Employee> findByPrenom(String prenom);
	List<Employee> findByNomContains(String nom);
	
	@Query("select e from Employee e where e.nom like %?1 and e.prenom like %?2")
	List<Employee> findByNomPrenom (String nom, String Prenom);
	
	List<Employee> findByOrderByPrenomAsc();
	@Query("select e from Employee e order by e.nom ASC")
	List<Employee> TrierEmployeeNom();
	


	
}
 