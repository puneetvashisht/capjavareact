package com.cap;

public class A {
	
	// Hard coupling --- 
//	B b = new B();
	
	B b;
	C c;
	// Loose Coupling
//	public A(B b, C c) {
//		this.b = b;
//		this.c = c;
//	}
	
	
	public void setup() {
		System.out.println("Initialization code in A...");
	}
	
	
	public void execute() {
		
		b.execute();
		c.execute();
		System.out.println("execute in A");
	}
	
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public void anotherMethod() {
		
		b.execute();
	}

}
