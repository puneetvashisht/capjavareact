package com.cap.day2;

public class TestUser {

	public static void main(String[] args) {
		// mandatory dependencies -- constructor
		User user1 = new User("admin", "testtest");
		
		
		//optional dependencies -- setter
		user1.setConfirmPassword("testtest");
//		user1.setAge(24);
		
//		user1.register();
		
		System.out.println(user1);
		
		
		User user2 = new User("manager", "mngmng");
		
		
		System.out.println(user2.toString());

	}

}
