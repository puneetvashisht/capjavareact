package com.cap.entities.composition;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	int houseNumber;
	String location;
	String city;
	
	public Address() {
		
	}
	public Address(int houseNumber, String location, String city) {
		super();
		this.houseNumber = houseNumber;
		this.location = location;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNumber=" + houseNumber + ", location=" + location + ", city=" + city + "]";
	}
	
	
	
}
