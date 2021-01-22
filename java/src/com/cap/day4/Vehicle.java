package com.cap.day4;

public class Vehicle {
	
	// fields
	int speed;
	int wheels;
	double mileage;
	
	// constructors
	public Vehicle() {}
	
	public Vehicle(int speed, int wheels, double mileage) {
		super();
		this.speed = speed;
		this.wheels = wheels;
		this.mileage = mileage;
	}
	
	// methods
	public void speedUp() {
		this.speed++;
	}
	
	public void speedDown() {
		speed--;
	}

	// string representation
	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", wheels=" + wheels + ", mileage=" + mileage + "]";
	}
	
	
	
	

}
