package com.cap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
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
