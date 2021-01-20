package com.cap.day2;

public class User {
	// fields
	private String name;
	private String password;
	private String confirmPassword;
	
	private int age;
	
	

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//constructors
	public User() {
		System.out.println("No argument constructor");
	}

	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	
	
 // Getter & setter
	public String getName() {
		return name;
	}

	
	public String getPassword() {
		return password;
	}



	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String toString() {
		return "User [name: " + name + "]";
	}


	public static void main(String[] args) {
//		User user1 = new User("admin", "testtest");
//		System.out.println(user1);
//		
//		User user2 = new User("manager", "mngmng");
//		System.out.println(user2.toString());
		
		User user3 = new User();

	}

}
