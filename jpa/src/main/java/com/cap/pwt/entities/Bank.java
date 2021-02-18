package com.cap.pwt.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	
	
	@Id
	BankDetails bankDetails;

	String location;

}
