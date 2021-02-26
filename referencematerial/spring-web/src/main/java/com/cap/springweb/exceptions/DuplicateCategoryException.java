package com.cap.springweb.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class DuplicateCategoryException extends RuntimeException {

	public DuplicateCategoryException() {
		super();
		
	}

	public DuplicateCategoryException(String message) {
		super(message);
		
	}

	
	
}
