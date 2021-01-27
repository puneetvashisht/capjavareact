package com.cap.day7;

public class TestVehicle {

	public static void main(String[] args) {
		
//		Vehicle v = new Vehicle(300, true);
		
		Engine engine = new Engine(2400);
		
		
//		Reference type determines method access .. and object determines the actual method invocation
		Car car = new Car(300, true, "Red", engine);
		car.vehiclemethod();
		car.carmethod();
		
//		PlaneEngine planeEngine = new PlaneEngine(20000, 450);
//		Plane plane = new Plane(1000, false, 300, planeEngine);
		
		
//		Vehicle vehicles[] = {car,plane };
//		
//		for(Vehicle v: vehicles) {
////			System.out.println(v.toString());
////			v.vehiclemethod();
//			if(v instanceof Car) {
//				Car c = (Car) v;
//				c.carmethod();
//				c.vehiclemethod();
//			}
//			
//		}
		
//		System.out.println(car);
//		System.out.println(plane);
		
		

	}

}
