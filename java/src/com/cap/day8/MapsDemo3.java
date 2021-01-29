package com.cap.day8;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemo3 {

	public static void main(String[] args) {
		Map<Integer, Employee> employeeMap = new TreeMap<>();
		
		Employee e1 = new Employee(1, "Ravi", 34343.34);
		Employee e2 = new Employee(2, "Priya", 44343.34);
		Employee e3 = new Employee(12, "Amit", 24343.34);
		Employee e4 = new Employee(6, "Arijit", 24343.34);
		
		employeeMap.put(1, e1);
		employeeMap.put(2,  e2);
		employeeMap.put(12,  e3);
		employeeMap.put(6,  e4);
		
//		Set<Integer> keys = employeeMap.keySet();
//		
//		for(Integer key : keys) {
//			System.out.println(key);
//			System.out.println(employeeMap.get(key));
//		}
		
		Set<Entry<Integer, Employee>> entry = employeeMap.entrySet();
		for(Entry<Integer,Employee> e : entry) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		System.out.println(employeeMap.keySet());
		
		System.out.println(employeeMap.get(22));

	}

}
