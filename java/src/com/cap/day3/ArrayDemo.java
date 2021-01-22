package com.cap.day3;

import com.cap.day2.Employee;

public class ArrayDemo {

	public static void main(String[] args) {
		

		//array for primitive types
		int scores[][] = new int[4][3];
		
		scores[0][0] = 34;
		scores[0][1] = 32;
		scores[0][2] = 33;
		
		scores[1][0] = 36;
		scores[1][1] = 37;
		scores[1][2] = 38;
		
		
		for(int s[]: scores) {
			for(int value : s) {
				System.out.println(value);
			}
		}
	
		

		
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
