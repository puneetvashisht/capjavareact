package com.cap.day2;

public class Employee {
	// Fields
		int id;
		String name;
		double salary;
		
		static String companyName = "CAPGEMINI";
	
	// default constructor	
	public Employee() {
			
	}
		
	// constructor to initialize id, name, salary
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// Methods
	double incrementSalary() {
		salary += 5000;
		return salary;
	}

	// String representation of an object
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	

}
