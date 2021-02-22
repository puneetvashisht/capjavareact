package com.cap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WorkoutRepository {
	
	@Autowired
	UserRepository userRepository;
	
	
//	public WorkoutRepository(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
	
	public void assignWorkoutToUser() {
		
		userRepository.findUserById();
		System.out.println("assigning workout to user");
	}

}
