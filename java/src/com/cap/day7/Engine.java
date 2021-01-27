package com.cap.day7;

public class Engine {
	
	int horsePower;

	
	public Engine() {
		
	}
	public Engine(int horsePower) {
		super();
		this.horsePower = horsePower;
	}
	@Override
	public String toString() {
		return "Engine [horsePower=" + horsePower + "]";
	}
	
	

}
