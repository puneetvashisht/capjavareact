package com.cap.day8;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSalary().compareTo(e2.getSalary());
	}

}
