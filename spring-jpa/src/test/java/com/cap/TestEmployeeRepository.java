package com.cap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cap.entities.Employee;
import com.cap.repos.EmployeeRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestEmployeeRepository {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void testEmployeeAdd() {
		Employee e = new Employee("", 333333.33);
		try {
			employeeRepository.addEmployee(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
//	@Test
	public void testEmployeeFind() {
		
		Employee emp = employeeRepository.findEmployee(1);
		System.out.println(emp);
	}

}
