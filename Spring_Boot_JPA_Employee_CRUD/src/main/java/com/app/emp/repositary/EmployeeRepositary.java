package com.app.emp.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.emp.model.Employee;

public interface EmployeeRepositary extends JpaRepository<Employee, Integer>{

	Employee findAllByUnameAndPass(String uname,String pass);
	Employee findAllById(int id);
	
}
