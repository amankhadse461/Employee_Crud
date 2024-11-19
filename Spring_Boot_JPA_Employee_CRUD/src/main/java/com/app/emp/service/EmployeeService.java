package com.app.emp.service;


import java.util.List;

import com.app.emp.model.Employee;

public interface EmployeeService {

	void savedata(Employee e);

	List<Employee> getall();

	Employee getEmployee(String uname, String pass);

	void deleteemployee(int id);

	Employee oneemployee(int id);

	


}
