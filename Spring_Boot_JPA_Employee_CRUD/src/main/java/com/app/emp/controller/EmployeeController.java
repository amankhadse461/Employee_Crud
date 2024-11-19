package com.app.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.emp.model.Employee;
import com.app.emp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService es;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/reg")
	public String preregister()
	{
		return "register";
	}
	
	@RequestMapping("/regdata")
	public String register(@ModelAttribute Employee e)
	{
		es.savedata(e);
		return "login";
	}
	
	@RequestMapping("/log")
	public String login(@RequestParam("uname") String uname,@RequestParam("pass") String pass,Model m)
	{
		List<Employee> al =es.getall();
		Employee e =es.getEmployee(uname,pass);
		for (Employee employee : al) {
			if (employee.equals(e)) {
				m.addAttribute("data",al);
				return "sucess";
			}
		}
		return "login";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id,Model m)
	{
		es.deleteemployee(id);
		List<Employee> al =es.getall();
		m.addAttribute("data",al);
		return "sucess";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("id") int id,Model m)
	{
		Employee e=es.oneemployee(id);
		m.addAttribute("data",e);
		return "edit";
	}
	
	@RequestMapping("/editdata")
	public String editdata(@ModelAttribute Employee e,Model m)
	{
		es.savedata(e);
		List<Employee> al =es.getall();
		m.addAttribute("data",al);
		return "sucess";
	}
}
