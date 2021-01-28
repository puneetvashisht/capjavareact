package com.cap.day8;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {

	public static void main(String[] args) {
		Map<Integer, Employee> employeeMap = new HashMap<>();
		
		Employee e1 = new Employee(1, "Ravi", 34343.34);
		Employee e2 = new Employee(2, "Priya", 44343.34);
		Employee e3 = new Employee(12, "Amit", 24343.34);
		Employee e4 = new Employee(6, "Arijit", 24343.34);
		
		employeeMap.put(1, e1);
		employeeMap.put(2,  e2);
		employeeMap.put(12,  e3);
		employeeMap.put(6,  e4);
		
		for(Integer key : employeeMap.keySet()) {
			System.out.println(key);
			System.out.println(employeeMap.get(key));
		}
		
		System.out.println(employeeMap.keySet());
		
		System.out.println(employeeMap.get(22));

	}

}
