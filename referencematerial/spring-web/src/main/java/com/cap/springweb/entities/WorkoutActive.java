package com.cap.springweb.entities;

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
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	Workout workout;
	
	LocalDateTime startTime;
	
	LocalDateTime endTime;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	User user;
	
	public WorkoutActive() {
		super();
	}

	

	public WorkoutActive(Workout workout, User user) {
		super();
		this.workout = workout;
		this.user = user;
	}



	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	
	public Workout getWorkout() {
		return workout;
	}



	public void setWorkout(Workout workout) {
		this.workout = workout;
	}



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



	public int getId() {
		return id;
	}



	@Override
	public String toString() {
		return "WorkoutActive [id=" + id + ", workout=" + workout + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", user=" + user + "]";
	}



	

	

	
	
	
}
