package com.cap.day4;

public class TestBicycle {
	
	public static void speedUpBicycle(Bicycle b) {
		b.speedUp(5);
	}
	

	public static void main(String[] args) {
//		Bicycle bicycle = new Bicycle(10, 3);
//		System.out.println(bicycle);
//		bicycle.speedUp(2);
//		bicycle.changeGear(5);
//		System.out.println(bicycle);
		
		MountainBicycle mountainBicycle  = new MountainBicycle(20, 2, 34);
//		System.out.println(mountainBicycle);
//		mountainBicycle.speedUp(2);
//		mountainBicycle.changeGear(5);
//		System.out.println(mountainBicycle);
		speedUpBicycle(mountainBicycle);
		
		RoadBicycle roadBicycle  = new RoadBicycle(20, 1);
//		System.out.println(roadBicycle);
//		roadBicycle.speedUp(2);
//		roadBicycle.changeGear(5);
//		System.out.println(roadBicycle);
		speedUpBicycle(roadBicycle);
		
		
		Bicycle bicycles[] = { mountainBicycle, roadBicycle};
		for(Bicycle b : bicycles) {
			System.out.println(b);
			b.speedUp(2);
			b.changeGear(5);
			System.out.println(b);
		}
		

	}

}
