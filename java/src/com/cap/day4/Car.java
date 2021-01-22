package com.cap.day4;

public class Car extends Vehicle{
	
	String name;

	public Car(int speed, int wheels, double mileage, String name) {
//		this.speed = speed;
//		this.wheels = wheels;
//		this.mileage = mileage;
		// used to invoke constructor in the super/parent class
		// should always be at the first line of constructor
		super(speed, wheels, mileage);
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", speed=" + speed + ", wheels=" + wheels + ", mileage=" + mileage + "]";
	}


	
	
	
}
