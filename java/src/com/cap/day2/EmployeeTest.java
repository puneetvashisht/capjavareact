package com.cap.day2;

public class EmployeeTest {

	public static void main(String[] args) {
		// Create objects -- new keyword
		Employee emp = new Employee();
		
		//accessing fields
		emp.name = "Ravi";
		emp.id = 34;
		emp.salary = 10000.00;
		
		
		System.out.println(emp.name);
		System.out.println(emp.id);
		
		// method invocation
		emp.incrementSalary();
		
		System.out.println(emp.salary);
		
		Employee emp2 = new Employee(34, "Priya", 34343.33);
		Employee emp3 = new Employee(2, "Rajat", 44343.33);
		
		System.out.println(emp2.name);
		emp2.incrementSalary();
		
//		Employee.incrementSalary();
		System.out.println(Employee.companyName);
		;
		System.out.println(emp2);
		
		System.out.println(emp3.name);
		
		System.out.println(emp2);


	}

}
