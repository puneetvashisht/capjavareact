package com.cap.day9;

import java.util.ArrayList;
import java.util.List;

public class TestComposition {

	public static void main(String[] args) {
		
		Address address = new Address(12, "Jangpura", "New Delhi");
		Address address2 = new Address(23, "OMR", "Chennai");
		Address officeAddress = new Address(422, "Sector32", "Noida");
		
		List<Address> addresses = new ArrayList<>();
		addresses.add(address);
		addresses.add(address2);
		addresses.add(officeAddress);
		
		Employee emp = new Employee(12, "Ravi", 23433.34, addresses);
		
		System.out.println(emp);
		
//		emp.incrementSalary();
		
//		System.out.println(emp);
		
//		emp.getAddress().setHouseNumber(1212);
		
		
//		Address newAddress = new Address(4545, "Magarpatta", "Pune");
//		emp.address.changeAddress(newAddress);
		
//		emp.getAddress().changeAddress(newAddress);
//		emp.setAddress(newAddress);
		
		
	
		
//		System.out.println(emp);

	}

}
