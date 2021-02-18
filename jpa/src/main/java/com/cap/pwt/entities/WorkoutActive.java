package com.cap.pwt.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class WorkoutActive {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String title;

	int caloriesBurntPerMinute;
	
	LocalDateTime startTime;
	LocalDateTime endTime;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	User user;
	
	

	public WorkoutActive() {
		
	}
	public WorkoutActive(String title, int caloriesBurntPerMinute, User user, LocalDateTime startTime, LocalDateTime endTime) {
		super();
		this.title = title;
		this.caloriesBurntPerMinute = caloriesBurntPerMinute;
		this.startTime = startTime;
		this.endTime = endTime;
		this.user = user;
	}
	
		

}
