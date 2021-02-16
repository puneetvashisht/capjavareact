package com.cap.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class UserRepository {
	
	/* Create EntityManagerFactory */
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("capdbjpa");

	
	/* Create EntityManager */
	EntityManager em = emf.createEntityManager();
	
	
//	public List<Employee> findAllEmployees(){
//		
//		em.find(Employee.class, 3);
//		// select queries
//	}
	
	//CRUD - Create, Read, Update, Delete
	//Named Queries - HQL
	
	
	
	public void addUser(User e) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(e);
		tx.commit();
	}

	
	public User findUserByEmail(String email){
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u where u.email = :x AND u.password = :y", User.class);
		query.setParameter("x",email);
		query.setParameter("y","test");
		User user = query.getSingleResult();
		return user;
	}
	
	public static void main(String[] args) {
		
		UserRepository repo = new UserRepository();

//		User user = new User("test2@test.com", "test", "test");
//		repo.addUser(user);
		
		User foundUser = repo.findUserByEmail("test2@test.com");
		System.out.println(foundUser);
		
		
	}

}
