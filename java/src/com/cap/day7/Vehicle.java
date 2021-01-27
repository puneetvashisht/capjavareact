package com.cap.day7;

public abstract class Vehicle {
	
	int maxSpeed;
	boolean automatic;
	Engine engine;
	
	
	public void vehiclemethod() {
		System.out.println("vehicle method...");
	}
	
//	public abstract void carmethod();
//		System.out.println("car method in vehicle...");
//	}

	public Vehicle() {
		
	}
	public Vehicle(int maxSpeed, boolean automatic, Engine engine) {
		super();
		this.maxSpeed = maxSpeed;
		this.automatic = automatic;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [maxSpeed=" + maxSpeed + ", automatic=" + automatic + ", engine=" + engine + "]";
	}

	
	
	

}
