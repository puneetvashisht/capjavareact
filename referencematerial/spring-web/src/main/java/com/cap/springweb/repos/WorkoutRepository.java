package com.cap.springweb.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.springweb.entities.Category;
import com.cap.springweb.entities.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Integer>{
	

	public List<Workout> findByCategory(Category category);
//	
//	@Transactional
//	public void updateWorkoutTitle(int id,String title)
//	{
//		Workout w = findWorkout(id);
//		w.setTitle(title);
//	}
//	
//	@Transactional
//	public void updateWorkoutNote(int id,String note)
//	{
//		Workout w = findWorkout(id);
//		w.setNote(note);
//	}
//	
//	@Transactional
//	public void updateWorkoutCbpm(int id,int cbpm)
//	{
//		Workout w = findWorkout(id);
//		w.setCaloriesBurntPerMinute(cbpm);
//	}
//	
}
