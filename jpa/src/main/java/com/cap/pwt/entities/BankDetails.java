package com.cap.pwt.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BankDetails implements Serializable {

	int id;
	String name;
}
