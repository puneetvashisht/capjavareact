package com.cap.springweb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.springweb.entities.User;
import com.cap.springweb.entities.Workout;
import com.cap.springweb.entities.WorkoutActive;
import com.cap.springweb.repos.UserRepository;
import com.cap.springweb.repos.WorkoutActiveRepository;
import com.cap.springweb.repos.WorkoutRepository;

@Service
public class WorkoutActiveService {
	
	@Autowired
	WorkoutActiveRepository waRepository;
	
	@Autowired
	WorkoutRepository workoutRepository;
	
	@Autowired
	UserRepository userRepository;
	
	public void addWorkoutActive(WorkoutActive wa)
	{
		Workout w = null;
		Optional<Workout> workout= workoutRepository.findById(wa.getWorkout().getId());
		if(workout.isPresent()) {
			w = workout.get();
		}
		
		User u = null;
		Optional<User> user= userRepository.findById(wa.getUser().getId());
		if(user.isPresent()) {
			u = user.get();
		}
		
		
		
//		 workoutController.findWorkout();
//		User u = userController.findUser(wa.getUser().getId());
		
		
		
		wa.setWorkout(w);
		wa.setUser(u);
		
		waRepository.save(wa);
	}
}
