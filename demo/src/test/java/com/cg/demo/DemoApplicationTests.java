package com.cg.demo;

import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	EmployeeRepo repo;

	@Test
	void contextLoads() {
	}
	
	
	@Test
	void testFetchAllEmployees() {
		List<Employee> employees = repo.findAll();
		System.out.println(employees);
		assertSame(4, employees.size());
	}

}
