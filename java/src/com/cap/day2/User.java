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

	// setters - for optional intializate
	public void setAge(int age) {
		this.age = age;
	}

	//constructors -- for mandatory initialization
	public User() {
		System.out.println("No argument constructor");
	}

	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	
	
	
 public User(String name, String password, String confirmPassword) {
		super();
		this.name = name;
		this.password = password;
		this.confirmPassword = confirmPassword;
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
		// login
//		User user2 = new User("manager", "mngmng");
		// register
		User user2 = new User("manager", "mngmng" , "mngmng");
//		System.out.println(user2.toString());
		
		User user3 = new User();

	}

}
