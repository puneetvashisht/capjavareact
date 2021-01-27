package com.cap.day7.exceptions;

//un-checked exception
public class InvalidEmailException extends RuntimeException{

	public InvalidEmailException() {
		
	}
	
	public InvalidEmailException(String message) {
		super(message);
	}
	
}
