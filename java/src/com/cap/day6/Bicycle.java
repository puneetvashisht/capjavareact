package com.cap.day6;

public abstract class Bicycle implements IBicycle{
	
	int speed;
	int gear;
	
	
	public Bicycle() {
		
	}
	
	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}
	
	public Bicycle(int speed, int gear) {
		this(speed);
//		super();
//		this.speed = speed;
		this.gear = gear;
	}
	

	
	// just declaration
//	public abstract void speedUp(int speed);

//	public void speedUp(int speed) {
//		this.speed+=speed;
//	}
	
	public void speedDown(int speed) {
		this.speed-=speed;
	}
	
	public void changeGear(int gear) {
		this.gear = gear;
	}

	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + ", gear=" + gear + "]";
	}
	
	

}
