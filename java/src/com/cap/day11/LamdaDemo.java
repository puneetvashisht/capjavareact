package com.cap.day11;

public class LamdaDemo {

	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
		Thread t = new Thread(runnable);
		
		t.start();

	}

}
