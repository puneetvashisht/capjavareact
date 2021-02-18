package com.cap.pwt.repos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cap.pwt.entities.Category;

public class CategoryRepository {
	/* Create EntityManagerFactory */
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("capdbjpa");

	
	/* Create EntityManager */
	EntityManager em = emf.createEntityManager();
	
	
//	 add, findAll, edit(change name) and delete a category 
	
	public void addCategory(Category category) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(category);
		tx.commit();
	}

	// delete a specific workout but .. do not delete the category itself
	public void deleteCategory(int i) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();	
		Category c = em.find(Category.class, i);
		em.remove(c);

		tx.commit();
		
	}
	
	public void updateCategory(int i, String name) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();	
		Category c = em.find(Category.class, i);
		c.setName(name);

		tx.commit();
		
	}
	
	public Category findCategory(int i) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();	
		Category c = em.find(Category.class, i);

		tx.commit();
		return c;
		
	}
	
	
	
}
