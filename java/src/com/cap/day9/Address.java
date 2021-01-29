package com.cap.day9;

public class Address {
	
	int houseNumber;
	String locality;
	String city;
	
	
	
	
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public Address() {
		
	}
	
//	public void changeAddress(Address address) {
//		this.houseNumber = address.houseNumber;
//		this.locality = address.locality;
//		this.city = address.city;
//	}
	
	public Address(int houseNumber, String locality, String city) {
		super();
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", locality=" + locality + ", city=" + city + "]";
	}
	
	
	
	

}
