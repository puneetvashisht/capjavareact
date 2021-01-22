package com.cap.day4;

public class MountainBicycle extends Bicycle implements MotorBycle {

	int suspension;
	
	public MountainBicycle() {
		super();
	}

	public MountainBicycle(int speed, int gear, int suspension) {
		super(speed, gear);
		this.suspension = suspension;
	}

	@Override
	public String toString() {
		return "MountainBicycle [suspension=" + suspension + ", speed=" + speed + ", gear=" + gear + "]";
	}

	
	@Override
	public void speedUp(int speed) {
		this.speed += (speed * 2);
		
	}

	@Override
	public void startMotor() {
		System.out.println("starting motor...");
	}

	@Override
	public void stopMotor() {
		System.out.println("stoping motor...");
		
	}
	
	
	
	
	
	
}
