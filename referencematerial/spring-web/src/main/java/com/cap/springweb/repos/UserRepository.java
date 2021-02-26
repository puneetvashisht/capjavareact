package com.cap.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.springweb.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username);
	
	public User findByUsernameAndPassword(String username, String password);
	
}
