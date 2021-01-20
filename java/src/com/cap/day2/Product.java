package com.cap.day2;

public class Product {
	
	// Fields
	int id;
	String name;
	double price;

	// Constructors
	Product(int id, String name, double amount){
		int price = 34;
		
		this.id= id;
		this.name = name;
		this.price = amount;
	}
	
	// Methods
	
	
	// String representation

	public String toString() {
		
		return "Product [id=" + this.id + ", name=" + this.name + ", price=" + price + "]";
	}
	
	
	public static void main(String[] args) {
		
		Product p = new Product(2, "iPhone", 33000.99);
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.price);
		
		System.out.println(p);
		
		Product p1 = new Product(6, "iwatch", 18000.00);
		System.out.println(p1.price);
		
	}

	

}
