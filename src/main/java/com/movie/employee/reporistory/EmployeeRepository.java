package com.movie.employee.reporistory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movie.employee.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	Employee findByUsername(String username);

}
