package com.cap;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cap.entities.Category;
import com.cap.entities.User;
import com.cap.entities.Workout;
import com.cap.repos.UserRepository;
import com.cap.repos.WorkoutRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestWorkoutRepository {

	@Autowired
	WorkoutRepository workoutRepository;
	
	@Autowired
	UserRepository repository;
	
	
//	@Test
	public void testDeleteWorkout() {
		workoutRepository.deleteWorkout(1);
	}
//
//	@Test
	public void testAddWorkout() {
		Category category = new Category("Strenth");
		Workout workout = new Workout("Triceps workout", category, 250);
		
		workoutRepository.addWorkout(workout);
	}
	
//	@Test
	public void testFindWorkoutsByCategoryName() {
		List<Workout> workouts = workoutRepository.findWorkoutByCategory("Strenth");
		System.out.println(workouts);
	}
	
//	@Test
	public void assignWorkoutToUser() {
		String workoutTitle = "Triceps workout";
		String email = "test@test.com";
		workoutRepository.assignWorkoutToUser(email, workoutTitle);
		
		
	}
	
	@Test
	public void testStartActiveWorkout() {
		int id = 4;
		workoutRepository.testStartActiveWorkout(id);
	}
	
	
	
//	@Test
	public void addUser() {
		User user  = new User("test@test.com", "test");
		repository.addUser(user);
	}
	
//	@Test
	public void updateUserPassword() {
		repository.updateUserPassword(1, "test");
	}

}
