package com.cap.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
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
		
		System.out.println(IntStream.range(10, 20).min());
		
		
		OptionalDouble minimumSalary = stream.mapToDouble((e)-> e.getSalary())
		.min();
		if(minimumSalary.isPresent()) {
			System.out.println(minimumSalary.getAsDouble());
		}
		
//		.forEach((s)-> System.out.println(s));
		stream = employees.stream();
		
		Optional<Employee> minimumSalariedEmployee = stream.min((o1,o2)->o1.getSalary().compareTo(o2.getSalary()));
		if(minimumSalariedEmployee.isPresent()) {
			System.out.println(minimumSalariedEmployee.get().getSalary());
		}
		
////		1. create a stream 
//		stream
////		intermediate operation (zero to many)
//		.filter(e -> e.getSalary() < 40000)
//		.map(e -> {
//			e.incrementSalary();
//			return e.getSalary();
//		})
////		terminal operation (one)
//		.forEach((e)-> System.out.println(e));

		

	}

}
