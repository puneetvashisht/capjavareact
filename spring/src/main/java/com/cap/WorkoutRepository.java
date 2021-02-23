package com.cap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("singleton")
public class WorkoutRepository {
	
	
	UserRepository userRepository;
	
	
//	@PostConstruct
//	public void setUp() {
//		System.out.println("Initialization code ...");
//	}
		
	@Autowired
	public WorkoutRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}



	public void assignWorkoutToUser() {
		
		userRepository.findUserById();
		System.out.println("assigning workout to user");
	}

}
