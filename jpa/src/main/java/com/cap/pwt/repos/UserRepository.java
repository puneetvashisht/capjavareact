package com.cap.pwt.repos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cap.pwt.entities.User;

public class UserRepository {
	
	/* Create EntityManagerFactory */
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("capdbjpa");

	
	/* Create EntityManager */
	EntityManager em = emf.createEntityManager();
	
	public User findUser(String email) {
		TypedQuery<User> query = em.createQuery("select u from User u where u.email=:email", User.class);
		query.setParameter("email", email);
		return query.getSingleResult();
	}
	
	public void addUser(User user) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(user);
		tx.commit();
	}

}
