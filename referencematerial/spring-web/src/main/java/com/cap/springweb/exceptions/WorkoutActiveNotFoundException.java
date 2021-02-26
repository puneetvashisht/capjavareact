package com.cap.springweb.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class WorkoutActiveNotFoundException extends RuntimeException {

	public WorkoutActiveNotFoundException() {
		super();
	}

	public WorkoutActiveNotFoundException(String message) {
		super(message);
	}

	
	
}
