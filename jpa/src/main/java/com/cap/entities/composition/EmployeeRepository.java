package com.cap.entities.composition;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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
	
	//CRUD - Create, Read, Update, Delete
	//Named Queries - HQL
	
	public Employee findEmployee(int id) {
		return em.find(Employee.class, id);
	}
	
	public void addEmployee(Employee e) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(e);
		tx.commit();
	}
	
	public void deleteEmployee(int id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Employee ef = em.find(Employee.class, id);
		em.remove(ef);
		tx.commit();
	}
	
	
	public void updateEmployee(int id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Employee ef = em.find(Employee.class, id);
		ef.setName("Amit");
		tx.commit();
	}
	
	public List<Employee> findAllEmployees(){
		TypedQuery<Employee> query = em.createQuery("select e from Employee e where e.salary > :x", Employee.class);
		query.setParameter("x", 40000.0);
		List<Employee> employees = query.getResultList();
		return employees;
	}
	
	public static void main(String[] args) {
		
		EmployeeRepository repo = new EmployeeRepository();
		Address address = new Address(23, "GK", "New Delhi");
		Address officialAddress = new Address(233, "Noida", "UP");
		List<Address> addresses = new ArrayList<>();
		addresses.add(address);
		addresses.add(officialAddress);
		
		Employee e = new Employee("Ravi", 43433.34, addresses);
		repo.addEmployee(e);
		
//		Employee foundEmployee = repo.findEmployee(1);
//		System.out.println(foundEmployee);
		
//		
//		List<Employee> employees = repo.findAllEmployees();
//		System.out.println(employees);
		
		
	}

}
