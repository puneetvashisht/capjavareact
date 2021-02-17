package com.cap.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="USER_TABLE")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(unique = true, nullable = false)
	String email;
	@Column(name="PWD")
	String password;
	boolean active;
	@Transient
	String confirmPassword;
	
	public User() {
		
	}
	public User(String email, String password, String confirmPassword, boolean active) {
		super();
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.active = active;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
	
	

}
