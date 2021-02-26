package com.cap.springweb.controllers;

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

import com.cap.springweb.entities.Category;
import com.cap.springweb.entities.Workout;
import com.cap.springweb.exceptions.CategoryNotFoundException;
import com.cap.springweb.exceptions.WorkoutNotFoundException;
import com.cap.springweb.repos.WorkoutRepository;

@RestController
public class WorkoutController {

	@Autowired
	WorkoutRepository workoutRepository;
	
	@Autowired
	CategoryController categoryController;
	
	@PostMapping("/workouts")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addWorkout(@RequestBody Workout w)
	{
		try {
			Category category = categoryController.findCategoryByName(w.getCategory().getName());
			if(category != null) {
				w.setCategory(category);
			}
		}
		catch(CategoryNotFoundException e) {
			e.printStackTrace();
		}

		workoutRepository.save(w);
			
	}
	
	@GetMapping("/workouts/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public Workout findWorkout(@PathVariable("id") int id)
	{
		Optional<Workout> workout = workoutRepository.findById(id);
		
		if(!workout.isPresent())
			throw new WorkoutNotFoundException("No workout found with id "+id);
		
		return workout.get();
	}
	
	@GetMapping("/workouts")
	@ResponseStatus(code = HttpStatus.FOUND)
	public List<Workout> findAllWorkouts()
	{
		List<Workout> list = workoutRepository.findAll();
		
		if(list.isEmpty())
			throw new WorkoutNotFoundException("No workouts found...");
		
		return list;
	}
	
	@GetMapping("/workouts/category/{name}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public List<Workout> findAllWorkoutsWithCategory(@PathVariable("name") String categoryName)
	{
		Category category = categoryController.findCategoryByName(categoryName);
		
		List<Workout> list = workoutRepository.findByCategory(category);
		
		if(list.isEmpty())
			throw new CategoryNotFoundException("No workouts found...");
		
		return list;
	}
	
	@PutMapping("/workouts")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@Transactional
	public void updateWorkout(@RequestBody Workout workout)
	{
		Workout w = findWorkout(workout.getId());
		w.setTitle(workout.getTitle());
		w.setNote(workout.getNote());
		w.setCaloriesBurntPerMinute(workout.getCaloriesBurntPerMinute());
	}
	
	@DeleteMapping("/workouts/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteWorkout(@PathVariable("id") int id)
	{
		Workout w = findWorkout(id);
		
		if(w==null)
			throw new WorkoutNotFoundException("No workout found with id " + id);
		
		
		workoutRepository.delete(w);
	}
}
