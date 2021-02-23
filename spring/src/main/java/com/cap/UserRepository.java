package com.cap;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	public void findUserById() {
		System.out.println("finding a user by its id");
	}

}
