package com.cap.day7.exceptions;

public class User {
	
	// fields
	String email;
	String password;
	String confirmPassword;
	
	
	static final String country = "India";
	

//	constructor
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public User(String email, String password, String confirmPassword) {
//		super();
//		this.email = email;
//		this.password = password;
		this(email, password);
		this.confirmPassword = confirmPassword;
	}
	
	//methods
	public void register()throws PasswordsNotMatchException {
		
		
		System.out.println("user registeration...");
		System.out.println("user email:  " + this.email);
		
		if(this.email.contains("@") && this.password.length() >=6 && this.password.equals(this.confirmPassword)) {
			System.out.println("user registered successfully!!");
			System.out.println(this);
		}
		else {
			System.out.println("user not registered!!");
			if(!this.email.contains("@")) {
				throw new InvalidEmailException("Provide a valid email!!");
			}
			else if(!this.password.equals(this.confirmPassword)) {
				throw new PasswordsNotMatchException("Provide same passwords!!");
			}
			
			
		}
	}
	
	public void login() {
		System.out.println("user login...");
		if(this.email.equals(this.password)) {
			System.out.println("user logged in successfully!!");
			System.out.println(this);
		}
		else {
			System.out.println("user login failed!!");
		}
		
	}
	



	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}

	public static void main(String[] args)  {
		User user = new User("test@test.com", "testtest", "testtest");
		try {
			user.register();
		} 
		catch (InvalidEmailException e) {
			e.printStackTrace();
		}
		catch (PasswordsNotMatchException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("always executed for both success/failure");
		}

		
		User loginUser = new User("test@test.com","test@test.com");
		loginUser.login();
		
		
		System.out.println("Allz well.. that ends well!!");

	}

}
