package com.cap.springweb.entities;

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
	String note;
	int caloriesBurntPerMinute;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	Category category;
	
	

	public Workout() {
		
	}
	public Workout(String title, Category category,String note, int caloriesBurntPerMinute) {
		super();
		this.title = title;
		this.category = category;
		this.note=note;
		this.caloriesBurntPerMinute = caloriesBurntPerMinute;
		
	}
	
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getId() {
		return id;
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
		return "Workout [id=" + id + ", title=" + title + ", note=" + note + ", category=" + category
				+ ", caloriesBurntPerMinute=" + caloriesBurntPerMinute + "]";
	}
	
	
	

	

}
