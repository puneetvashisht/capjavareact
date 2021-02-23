package com.cap.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Workout {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String title;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	Category category;
	
	int caloriesBurntPerMinute;

	public Workout() {
		
	}
	public Workout(String title, Category category, int caloriesBurntPerMinute) {
		super();
		this.title = title;
		this.category = category;
		this.caloriesBurntPerMinute = caloriesBurntPerMinute;
	}
	
	
	

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getCaloriesBurntPerMinute() {
		return caloriesBurntPerMinute;
	}
	public void setCaloriesBurntPerMinute(int caloriesBurntPerMinute) {
		this.caloriesBurntPerMinute = caloriesBurntPerMinute;
	}
	@Override
	public String toString() {
		return "Workout [id=" + id + ", title=" + title + ", category=" + category + ", caloriesBurntPerMinute="
				+ caloriesBurntPerMinute + "]";
	}
	

	

}
