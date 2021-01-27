package com.cap.day7.exceptions;

//checked exception
public class PasswordsNotMatchException extends Exception{

	public PasswordsNotMatchException() {
		
	}
	
	public PasswordsNotMatchException(String message) {
		super(message);
	}
	
}
