package com.cap.day7;

public class Plane extends Vehicle{
	
	int seats;
	
	PlaneEngine planeEngine;

	
	public Plane() {
		
	}
	public Plane(int maxSpeed, boolean automatic, int seats, PlaneEngine planeEngine) {
//		Engine e = planeEngine;
		super(maxSpeed, automatic, planeEngine);
		this.seats = seats;
		this.planeEngine = planeEngine;
	}
	@Override
	public String toString() {
		return "Plane [seats=" + seats + ", planeEngine=" + planeEngine + ", maxSpeed=" + maxSpeed + ", automatic="
				+ automatic + "]";
	}
	
	
	
	

}
