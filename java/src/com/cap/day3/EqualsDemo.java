package com.cap.day3;

class Fruit{
	String name;
	String color;

	public Fruit(String name) {
		super();
		this.name = name;
	}
	
	public boolean equals(Object obj) {
			Fruit f = (Fruit) obj;
	        return (this.name.equals(f.name));
	   }

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
}

public class EqualsDemo {

	public static void main(String[] args) {
//		String fruits[] = {"Apple", "Banana", "Orange"};
		Fruit f1 = new Fruit("Apple");
		Fruit f2 = new Fruit("Apple");
		
		System.out.println(f1.equals(f2));
		
		
		Employee emp1 = new Employee(12, "Ravi", 33333.33);
		Employee emp2 = new Employee(12, "Priya", 43333.33);
//		Employee emp2 = emp1;
		
		System.out.println(emp1.equals(emp2));
		
//		Fruit fruits[]= {f1 , new Fruit("Banana"), new Fruit("Orange")};
//		
//		
//		int result = Arrays.binarySearch(fruits, new Fruit("Orange"));
//		
//		if(result>=0 ) {
//			System.out.println("Found at: " + result);
//			System.out.println(fruits[result]);
//		}
//		else {
//			System.out.println("Not found");
//		}

		
	}
}
