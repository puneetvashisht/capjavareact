package com.cap.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.cap.day8.Employee;

public class StreamsDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ravi", 34343.34);
		Employee e2 = new Employee(2, "Priya", 44343.34);
		Employee e3 = new Employee(12, "Arijit", 24343.34);

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		
		Stream<Employee> stream = employees.stream();
		
//		1. create a stream 
		stream
//		intermediate operation (zero to many)
		.filter(e -> e.getSalary() < 40000)
		.map(e -> {
			e.incrementSalary();
			return e.getSalary();
		})
//		terminal operation (one)
		.forEach((e)-> System.out.println(e));

		

	}

}
