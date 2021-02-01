package com.cap.day9.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadsDemo5 {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
			}
			
		};
		
		List<Thread> threads = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			Thread t = new Thread(runnable);
			t.start();
			threads.add(t);
		}
		
		for(Thread t : threads) {
			t.join();
		}
		
//		Thread.sleep(20);
		
		System.out.println(Thread.currentThread().getName());

	}

}
