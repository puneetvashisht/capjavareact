package com.cap.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestUserRepository {
	UserRepository userRepository;
	
	@Before
	public void setUp() {
		userRepository = new UserRepository();
	}

	@Test
	public void testAddUser() {
		User user = new User("test2@test.com", "test", "test", true);
		userRepository.addUser(user);
	}
	
//	@Test
	public void testFindUserById() {
		
		User user = userRepository.findUser(4);
		assertEquals("Email is same", "test4@test.com", user.getEmail());
	}

}
