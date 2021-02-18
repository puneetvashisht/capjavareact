package com.cap.pwt.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cap.entities.UserRepository;
import com.cap.pwt.entities.Category;
import com.cap.pwt.entities.Workout;
import com.cap.pwt.entities.WorkoutActive;

public class WorkoutRepository {
	/* Create EntityManagerFactory */
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("capdbjpa");

	
	/* Create EntityManager */
	EntityManager em = emf.createEntityManager();
	
	public Category findCategoryByName(String name) throws NoResultException {
		TypedQuery<Category> query = em.createQuery("select c from Category c where c.name = :name", Category.class);
		query.setParameter("name", name);
		return query.getSingleResult();
	}
	
	
	public void addWorkout(Workout workout) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
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
		tx.commit();
	}

	// delete a specific workout but .. do not delete the category itself
	public void deleteWorkout(int i) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		// mapping existing category to workout
		Workout w = em.find(Workout.class, i);
		em.remove(w);

	
		tx.commit();
		
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
	
	
	
	// update workout -- change title, note, cbpm
	public void updatgeWorkout(int i, String title) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		// mapping existing category to workout
		Workout w = em.find(Workout.class, i);
		w.setTitle(title);
		tx.commit();
		
	}


	public void assignWorkoutToUser(String email, String workoutTitle) {
		
		// Find User and Workout from email, workouttitle respectively
//		User user = UserRepository.findUser(email);
//		Workout workout = this.findWorkoutWithTitle(workoutTitle);
		
		// Construct workoutActive object
//		WorkoutActive workoutActive = new WorkoutActive(workout.getTitle(), workout.getCaloriesBurntPerMinute(), user, null, null);
		
		// Persist the object in db
		EntityTransaction tx = em.getTransaction();
		tx.begin();
//		em.persist(workoutActive);
		tx.commit();
	}
	
}
