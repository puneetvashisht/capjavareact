package com.cap.day4;

public class TestInheritance {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(0, 4, 10.0);
		System.out.println(v1);
		
		Car c1 = new Car(10, 4, 17.0, "NexonEV");
//		System.out.println(c1);
//		c1.speedUp();
//		System.out.println(c1);
		
		
		Car c2 = new Car(12, 4, 20.0, "MahindraEV");
//		System.out.println(c2);
//		c2.speedUp();
//		System.out.println(c2);
		
		//Super type can always reference subtype objects
//		Vehicle v2 = c1;
//		Car c3 = v1;
		
		Vehicle vehicles[] = {c1,c2, v1};
		
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
			vehicle.speedUp();
			System.out.println(vehicle);
		}
		

	}

}
