package com.cap.springweb.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class WorkoutNotFoundException extends RuntimeException {

	public WorkoutNotFoundException() {
		super();
		
	}

	public WorkoutNotFoundException(String message) {
		super(message);
		
	}

	
	
}
