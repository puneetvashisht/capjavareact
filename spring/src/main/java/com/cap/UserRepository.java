package com.cap;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
	
	public void findUserById() {
		System.out.println("finding a user by its id");
	}

}
