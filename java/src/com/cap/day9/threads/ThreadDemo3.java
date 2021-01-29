package com.cap.day9.threads;


public class ThreadDemo3 {

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("thread ends");
				
			}
		};
		
//		for(int i=0;i<10;i++) {
			Thread t = new Thread(runnable);
			t.start();
			
			try {
				// waits for t thread to join main thread
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
		
		System.out.println(Thread.currentThread().getName());

	}

}
