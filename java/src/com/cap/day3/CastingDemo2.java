package com.cap.day3;

public class CastingDemo2 {

	public static void main(String[] args) {
		
		String name1 = "Ravi";
		String name2 = "Amit";
		
//		name1 = name2;
		
		System.out.println(name1);
		System.out.println(name2);
		
		
		//upcasting 
		Object emp1 = new Employee(12, "Ravi", 33333.33);
		Object obj1 = new String("test");
		
		//downcasting
		if(obj1 instanceof Employee) {
			System.out.println("Type cast..");
			Employee emp2 = (Employee)obj1;
			
			System.out.println(emp1);
			System.out.println(emp2);
		}
		
		
		
		
	}

}
