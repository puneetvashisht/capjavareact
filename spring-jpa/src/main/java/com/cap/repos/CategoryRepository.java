package com.cap.repos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cap.entities.Category;


@Repository
public class CategoryRepository {
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void addCategory(Category category) {
		em.persist(category);
	}
	
	public Category findCategoryByName(String categoryName) {	
		TypedQuery<Category> query = em.createQuery("select c from Category c where c.name=:name", Category.class);
		query.setParameter("name", categoryName);
		return query.getSingleResult();
	}

	// delete a specific workout but .. do not delete the category itself
	@Transactional
	public void deleteCategory(int i) {
		Category c = em.find(Category.class, i);
		em.remove(c);
		
	}
	
	@Transactional
	public void updateCategory(int i, String name) {		
		Category c = em.find(Category.class, i);
		c.setName(name);	
	}
	
	@Transactional
	public Category findCategory(int i) {	
		Category c = em.find(Category.class, i);
		return c;
	}
	
	
	
}
