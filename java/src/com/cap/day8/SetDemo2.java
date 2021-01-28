package com.cap.day8;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		// unordered
//		Set<Employee> employees = new HashSet<>();
		// ordered on insertion
//		Set<Employee> employees = new LinkedHashSet<>();
		// sorted
		Set<Employee> employees = new TreeSet<>(new NameComparator());
		
		Employee e1 = new Employee(1, "Ravi", 34343.34);
		Employee e2 = new Employee(2, "Priya", 44343.34);
		Employee e3 = new Employee(12, "Amit", 24343.34);
		Employee e4 = new Employee(6, "Arijit", 24343.34);
		
		System.out.println(e3.equals(e4));
		System.out.println(e3 == e4);
		
		Employee e5 = new Employee(12, "Arijit", 24343.34);
		
		System.out.println(e2.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e5.hashCode());
		System.out.println(e4.hashCode());
//		System.out.println("Arijit".hashCode());
		
		employees.add(e1); 
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		
		
		System.out.println(employees);
		

	}

}
