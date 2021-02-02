package com.cap.day7.exceptions;

public class Test {
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
	public static void m1() throws Exception {
		throw m2();
	}
	
	public static Exception m2() throws Exception{
		return new Exception();
	}

}
