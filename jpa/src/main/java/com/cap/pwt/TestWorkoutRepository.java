package com.cap.pwt;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.cap.pwt.entities.Category;
import com.cap.pwt.entities.Workout;
import com.cap.pwt.repos.WorkoutRepository;

public class TestWorkoutRepository {

	WorkoutRepository workoutRepository;
	
	@Before
	public void setUp() {
		workoutRepository = new WorkoutRepository();
	}
//	@Test
	public void testDeleteWorkout() {
		workoutRepository.deleteWorkout(1);
	}

//	@Test
	public void testAddWorkout() {
		Category category = new Category("Strenth");
//		Workout workout = new Workout("Dumbell Workout", category, 150);
		Workout workout = new Workout("Triceps workout", category, 250);
		
		workoutRepository.addWorkout(workout);
	}
	
	@Test
	public void testFindWorkoutsByCategoryName() {
		List<Workout> workouts = workoutRepository.findWorkoutByCategory("Strenth");
		System.out.println(workouts);
	}

}
