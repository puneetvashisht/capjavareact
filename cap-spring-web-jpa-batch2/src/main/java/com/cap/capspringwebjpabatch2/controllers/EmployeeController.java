package com.cap.capspringwebjpabatch2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.capspringwebjpabatch2.entities.Employee;
import com.cap.capspringwebjpabatch2.repos.EmployeeRepository;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee e) {
		employeeRepository.save(e);
	}
	
	@GetMapping("/employees")
	public List<Employee> findAllEmployees(){
		System.out.println("Method mapped to Http....");
		return employeeRepository.findAll();
	}

}
