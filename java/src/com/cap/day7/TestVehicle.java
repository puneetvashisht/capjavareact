package com.cap.day7;

public class TestVehicle {

	public static void main(String[] args) {
		
//		Vehicle v = new Vehicle(300, true);
		
		Engine engine = new Engine(2400);
		Car car = new Car(300, true, "Red", engine);
		
		PlaneEngine planeEngine = new PlaneEngine(20000, 450);
		Plane plane = new Plane(1000, false, 300, planeEngine);
		
		
		Vehicle vehicles[] = {car,plane };
		
		for(Vehicle v: vehicles) {
			System.out.println(v);
		}
		
//		System.out.println(car);
//		System.out.println(plane);
		
		

	}

}
