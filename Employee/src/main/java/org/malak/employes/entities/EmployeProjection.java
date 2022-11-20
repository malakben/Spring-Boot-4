package org.malak.employes.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="nom", types= {Employee.class})

public interface EmployeProjection {

	public String getNom();
}
