package com.cap.entities.inherit;

import javax.persistence.Entity;

@Entity
public class ContractEmployee extends Employee {
	
	double payPerDay;
	
	
	public ContractEmployee() {
		
	}
	public ContractEmployee(String name, double payPerDay) {
		super(name);
		this.payPerDay = payPerDay;
	}

	@Override
	public String toString() {
		return "ContractEmployee [payPerDay=" + payPerDay + "]";
	}
	
	

}
