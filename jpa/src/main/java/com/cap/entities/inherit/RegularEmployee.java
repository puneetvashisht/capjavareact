package com.cap.entities.inherit;

import javax.persistence.Entity;

@Entity
public class RegularEmployee extends Employee {
	
	double salary;
	int monthlyLeaves;
	
	public RegularEmployee() {
		
	}
	public RegularEmployee(String name, double salary, int monthlyLeaves) {
		super(name);
		this.salary = salary;
		this.monthlyLeaves = monthlyLeaves;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", monthlyLeaves=" + monthlyLeaves + "]";
	}
	
	

}
