package com.cap.day7;

public class PlaneEngine extends Engine{
	
	int boost;

	public PlaneEngine() {
		
	}
	
	public PlaneEngine(int horsePower, int boost) {
		super(horsePower);
		this.boost = boost;
	}

	@Override
	public String toString() {
		return "PlaneEngine [boost=" + boost + ", horsePower=" + horsePower + "]";
	}
	
	
	
	

}
