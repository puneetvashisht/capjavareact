package com.cap.day12;

import static java.util.stream.Collectors.toCollection;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.cap.day8.Employee;

public class StreamsDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ravi", 34343.34);
		Employee e2 = new Employee(2, "Priya", 44343.34);
		Employee e3 = new Employee(12, "Arijit", 24343.34);
		Employee e4 = new Employee(15, "Amit", 24343.34);
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
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
		
		
		stream = employees.stream();
//		1. create a stream 
		
		
		List<Employee> filteredList = stream
//		intermediate operation (zero to many)
		.filter(e -> e.getSalary() < 40000)
		.map(e -> {
			e.incrementSalary();
			return e;
		})
//		terminal operation (one)
//		.forEach((e)-> System.out.println(e));
//		.forEach(System.out::println);
//		.collect(toList());
		.collect(toCollection(LinkedList::new));
		
//		System.out.println(filteredList);
		
		
		

		// Advanced collectors--- 
		//1. Joining
		
		
//				String empNames = employees.stream()
//					      .map(Employee::getName)
//					      .collect(Collectors.joining(", "));
//				System.out.println(empNames);
				
				
				
				//2. summary
//				DoubleSummaryStatistics stats = employees.stream()
//					      .collect(Collectors.summarizingDouble(Employee::getSalary));
//				System.out.println(stats);
//				System.out.println(stats.getMin());
//				
				//3. partitioningBy
//				Map<Boolean, List<Employee>> isEven = employees.stream().collect(
//					      Collectors.partitioningBy(e -> e.getId() % 2 == 0));
//				System.out.println(isEven.get(true));
//				System.out.println(isEven.get(false));
//				
//				//4. groupingBy
				Map<Character, List<Employee>> groupByAlphabet = employees.stream().collect(
					      Collectors.groupingBy(e -> new Character(e.getName().charAt(0))));
				System.out.println(groupByAlphabet);
//				
				

		

	}

}
