package com.cap.pwt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String email;
	String password;
	
	public User() {
		
	}
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	

}
