package com.cap.pwt;

import org.junit.Before;
import org.junit.Test;

public class TestWorkoutRepository {

	WorkoutRepository workoutRepository;
	
	@Before
	public void setUp() {
		workoutRepository = new WorkoutRepository();
	}

	@Test
	public void testAddWorkout() {
		Category category = new Category("Strenth");
		Workout workout = new Workout("Dumbell Workout", category, 150);
		
		workoutRepository.addWorkout(workout);
	}

}
