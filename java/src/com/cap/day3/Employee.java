package com.cap.day3;

public class Employee {
	// Fields
		private int id;
		private String name;
		private double salary;
		
	
	// default/no-arg constructor	
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
		this.salary += 5000;

		return salary;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// String representation of an object
	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + name + ", salary=" + salary + "]";
	}


	

}
