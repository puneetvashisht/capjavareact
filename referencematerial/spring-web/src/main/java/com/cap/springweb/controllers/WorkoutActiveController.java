package com.cap.springweb.controllers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cap.springweb.entities.User;
import com.cap.springweb.entities.Workout;
import com.cap.springweb.entities.WorkoutActive;
import com.cap.springweb.exceptions.WorkoutActiveNotFoundException;
import com.cap.springweb.repos.WorkoutActiveRepository;

@RestController
public class WorkoutActiveController {

	@Autowired
	WorkoutActiveRepository waRepository;
	
	@Autowired
	WorkoutController workoutController;
	
	@Autowired
	UserController userController;
	
	@PostMapping("/workoutActives")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addWorkoutActive(@RequestBody WorkoutActive wa)
	{
		Workout w = workoutController.findWorkout(wa.getWorkout().getId());
		User u = userController.findUser(wa.getUser().getId());
		
		wa.setWorkout(w);
		wa.setUser(u);
		
		waRepository.save(wa);
	}
	
	@GetMapping("/workoutActives/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public WorkoutActive findWorkoutActive(@PathVariable("id") int id)
	{
		Optional<WorkoutActive> workoutActive = waRepository.findById(id);
		
		if(!workoutActive.isPresent())
			throw new WorkoutActiveNotFoundException("No workoutActive found with id "+id);
		
		return workoutActive.get();
	}
	
	@GetMapping("/workoutActives")
	@ResponseStatus(code = HttpStatus.FOUND)
	public List<WorkoutActive> findAllWorkouts()
	{
		List<WorkoutActive> list = waRepository.findAll();
		
		if(list.isEmpty())
			throw new WorkoutActiveNotFoundException("No workoutActives found...");
		
		return list;
	}
	
	
	@PutMapping("/workoutActivesS")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@Transactional
	public void startWorkout(@RequestBody WorkoutActive workoutActive)
	{
		WorkoutActive wa = findWorkoutActive(workoutActive.getId());
		
		wa.setStartTime(LocalDateTime.now());
		
	}
	
	@PutMapping("/workoutActivesE")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@Transactional
	public void endWorkout(@RequestBody WorkoutActive workoutActive)
	{
		WorkoutActive wa = findWorkoutActive(workoutActive.getId());
		
		wa.setEndTime(LocalDateTime.now());
		
	}
	
	@DeleteMapping("/workoutActives/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteWorkoutActive(@PathVariable("id") int id)
	{
		WorkoutActive wa = findWorkoutActive(id);
		
		if(wa==null)
			throw new WorkoutActiveNotFoundException("No workoutActive found with id " + id);
		
		
		waRepository.delete(wa);
	}
}
