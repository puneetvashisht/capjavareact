package com.cap.day6;

public class MountainBicycle extends Bicycle {

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


	
	
	
	
	
}
