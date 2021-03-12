package com.cap.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.springweb.entities.WorkoutActive;



@Repository
public interface WorkoutActiveRepository extends JpaRepository<WorkoutActive, Integer> {

	
	

}
