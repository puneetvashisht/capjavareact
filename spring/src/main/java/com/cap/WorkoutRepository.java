package com.cap;

public class WorkoutRepository {
	
	UserRepository userRepository;
	
	public WorkoutRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void assignWorkoutToUser() {
		
		userRepository.findUserById();
		System.out.println("assigning workout to user");
	}

}
