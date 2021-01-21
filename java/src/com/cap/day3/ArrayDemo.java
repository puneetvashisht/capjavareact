package com.cap.day3;

import com.cap.day2.Employee;

public class ArrayDemo {

	public static void main(String[] args) {
		

		//array for primitive types
//		int scores[] = new int[4];
		

		
		Employee emp1 = new Employee(11, "Ananya", 54343.33);
		Employee emp2 = new Employee(34, "Priya", 34343.33);
		Employee emp3 = new Employee(2, "Rajat", 44343.33);
		
		Employee []employees = {emp1, emp2, emp3};
	
		// array of reference types / user defined type
//		Employee employees[] = new Employee[3];
//		employees[0] = emp1;
//		employees[1] = emp2;
//		employees[2] = emp3;
		
		
		for(int i=0;i<employees.length ; i++) {	
			System.out.println(employees[i]);
		}
		
		//enhanced for loop
		for(Employee e: employees) {
			System.out.println(e);
			e.incrementSalary();
			System.out.println(e);
		}
		

	}

}
