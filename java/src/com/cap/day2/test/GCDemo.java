package com.cap.day2.test;

import com.cap.day2.Employee;

public class GCDemo {
	
	
	public static void m1(Employee emp) {
		System.out.println(emp);
	}

	public static void main(String[] args) {
		Employee emp = new Employee(12, "Ravi", 34343.3);
		
		m1(emp);
		emp = null;
		
		System.out.println(emp);

	}

}
