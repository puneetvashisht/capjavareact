package com.cap.springweb.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class DuplicateUserException extends RuntimeException {

	public DuplicateUserException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DuplicateUserException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	
	
}
