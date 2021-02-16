package com.cap.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeRepository {
	
	/* Create EntityManagerFactory */
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("capdbjpa");

	
	/* Create EntityManager */
	EntityManager em = emf.createEntityManager();
	
	
//	public List<Employee> findAllEmployees(){
//		
//		em.find(Employee.class, 3);
//		// select queries
//	}
	
	public Employee findEmployee(int id) {
		return em.find(Employee.class, id);
	}
	
	public void addEmployee(Employee e) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(e);
		tx.commit();
	}
	
	
	public static void main(String[] args) {
		
		EmployeeRepository repo = new EmployeeRepository();
		Employee e = new Employee("Priya", 43433.34);
		repo.addEmployee(e);
		
//		Employee foundEmployee = repo.findEmployee(3);
//		System.out.println(foundEmployee);
		
		
		
	}

}
