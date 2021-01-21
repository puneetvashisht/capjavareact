package com.cap.day2;

public class Employee {
	// Fields
		int id;
		
		String name;
		private double salary;
		
		
		public double getSalary() {
			if(salary > 0 && salary < 500000 ) {
				return salary;
			}
			return 0.0;
		}

		public void setSalary(double salary) {
			if(salary > 0) {
				this.salary = salary;
			}
		}

		static final String companyName = "CAPGEMINI";
	
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
	public double incrementSalary() {
		
		
		this.salary += 5000;
		
//		companyName = "another value";
		
		return salary;
	}

	// String representation of an object
	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + name + ", salary=" + salary + "]";
	}

	protected void finalize() {
		System.out.println("clean up code goes here...");
	}

	

}
