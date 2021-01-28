package com.cap.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(12, "Ravi", 34343.34);
		Employee e2 = new Employee(2, "Priya", 44343.34);
		Employee e3 = new Employee(12, "Arijit", 24343.34);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1); 
		employees.add(e2);
		employees.add(e3);
		
		
		
		employees.add(2, new Employee(23, "Ram", 34343.34));		
		System.out.println(employees.get(1));
		
//		for(Employee e : employees) {
//			System.out.println(e);
//			e.incrementSalary();
//			System.out.println(e);
//		}
	}

}
