package com.cap.day9.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyDemo {

	public static void main(String[] args) {
		
		// Pool of 2 threads
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());	
			}	
		};
		
		
		for(int i =0;i<10;i++) {
			// No thread creation here
			service.submit(runnable);
		}
		
		service.shutdown();

	}

}
