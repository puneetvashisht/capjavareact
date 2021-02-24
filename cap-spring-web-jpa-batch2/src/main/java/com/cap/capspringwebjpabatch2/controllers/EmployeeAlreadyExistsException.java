package com.cap.capspringwebjpabatch2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class EmployeeAlreadyExistsException extends RuntimeException {
	
	public EmployeeAlreadyExistsException() {
		
	}
	
	public EmployeeAlreadyExistsException(String message) {
		super(message);
	}

}
