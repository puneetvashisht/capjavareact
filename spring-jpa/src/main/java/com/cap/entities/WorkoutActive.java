package com.cap.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class WorkoutActive {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String title;

	int caloriesBurntPerMinute;
	
	LocalDateTime startTime;
	LocalDateTime endTime;
	
	
	
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	@ManyToOne(cascade = CascadeType.ALL)
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
