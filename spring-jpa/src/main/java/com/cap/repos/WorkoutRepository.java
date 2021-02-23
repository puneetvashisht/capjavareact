package com.cap.repos;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cap.entities.Category;
import com.cap.entities.User;
import com.cap.entities.Workout;
import com.cap.entities.WorkoutActive;
@Repository
public class WorkoutRepository {
	@PersistenceContext
	EntityManager em;
	
	@Autowired
	UserRepository userRepository;
	
	public Category findCategoryByName(String name) throws NoResultException {
		TypedQuery<Category> query = em.createQuery("select c from Category c where c.name = :name", Category.class);
		query.setParameter("name", name);
		return query.getSingleResult();
	}
	
	@Transactional
	public void addWorkout(Workout workout) {
		
		// mapping existing category to workout
		try {
			Category category = this.findCategoryByName(workout.getCategory().getName());
			if(category != null) {
				workout.setCategory(category);
			}
		}
		catch(NoResultException e) {
			e.printStackTrace();
		}

		em.persist(workout);
	}

	// delete a specific workout but .. do not delete the category itself
	@Transactional
	public void deleteWorkout(int i) {
		
		// mapping existing category to workout
		Workout w = em.find(Workout.class, i);
		em.remove(w);
		
	}
	
	// find all workouts inside a specific category
	
	public List<Workout> findWorkoutByCategory(String categoryName){
		
		// Find the category to fetch ID
		CategoryRepository categoryRepo = new CategoryRepository();
		Category c = categoryRepo.findCategoryByName(categoryName);
		
		
		// Find workouts using ID
		TypedQuery<Workout> query = em.createQuery("select w from Workout w where category.id=:id", Workout.class);
		query.setParameter("id", c.getId());
		return query.getResultList();
		
	}
	
	
	public Workout findWorkoutByTitle(String title){
		// Find workouts using ID
		TypedQuery<Workout> query = em.createQuery("select w from Workout w where w.title=:title", Workout.class);
		query.setParameter("title", title);
		return query.getSingleResult();
		
	}
	
	
	
	// update workout -- change title, note, cbpm
	@Transactional
	public void updatgeWorkout(int i, String title) {
		
		Workout w = em.find(Workout.class, i);
		w.setTitle(title);
		
	}


	@Transactional
	public void assignWorkoutToUser(String email, String workoutTitle) {
	
		User user = userRepository.findUser(email);
		System.out.println(user);
		Workout workout = this.findWorkoutByTitle(workoutTitle);
		System.out.println(workout);
		// Construct workoutActive object
//		user
		User newUser = new User(user.getEmail(), user.getPassword());
		WorkoutActive workoutActive = new WorkoutActive(workout.getTitle(), workout.getCaloriesBurntPerMinute(), newUser, null, null);
		
		
		em.persist(workoutActive);

	}


	@Transactional
	public void testStartActiveWorkout(int id) {	
		WorkoutActive workoutActive = em.find(WorkoutActive.class, id);
		workoutActive.setStartTime(LocalDateTime.now());
		
	}
	
}
