package com.cap.day7;

public class Car extends Vehicle {
	
	String color;
	
	
	
	public Car() {
		
	}

	public Car(int maxSpeed, boolean automatic, String color, Engine engine) {
		super(maxSpeed, automatic, engine);
		this.color = color;
//		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", engine=" + engine + ", maxSpeed=" + maxSpeed + ", automatic=" + automatic
				+ "]";
	}



	
	

}
