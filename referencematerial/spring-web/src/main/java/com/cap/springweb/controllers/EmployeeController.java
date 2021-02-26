package com.cap.springweb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.springweb.entities.Employee;
import com.cap.springweb.repos.EmployeeRepository;



@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee e)
	{
		employeeRepository.save(e);
	}
	
	@GetMapping("/employees")
	public List<Employee> findAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee findEmployee(@PathVariable("id") int id)
	{
		Optional<Employee> employee = employeeRepository.findById(id);
		
		if(employee.isPresent())
			return employee.get();
		
		return null;
	}
	
	@GetMapping("/employee/{name}")
	public Employee findEmployeeByName(@PathVariable("name") String name)
	{
		Employee e = employeeRepository.findByName(name);
		
		return e;
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable("id") int id)
	{
		Optional<Employee> employee = employeeRepository.findById(id);
		
		if(employee.isPresent())
		{
			employeeRepository.delete(employee.get());
		}
		
		
	}
	
}
