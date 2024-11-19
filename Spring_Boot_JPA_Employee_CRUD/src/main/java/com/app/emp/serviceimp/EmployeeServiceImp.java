package com.app.emp.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.emp.model.Employee;
import com.app.emp.repositary.EmployeeRepositary;
import com.app.emp.service.EmployeeService;


@Service
public class EmployeeServiceImp  implements EmployeeService{

	@Autowired
	EmployeeRepositary er;
	
	@Override
	public void savedata(Employee e) {
		er.save(e);
		
	}

	@Override
	public List<Employee> getall() {
		
		return er.findAll();
	}

	@Override
	public Employee getEmployee(String uname, String pass) {
	
		return er.findAllByUnameAndPass(uname, pass);
	}

	@Override
	public void deleteemployee(int id) {
		er.deleteById(id);
	 
		
	}

	@Override
	public Employee oneemployee(int id) {
		
		return er.findAllById(id);
	}

	
	
	

}
