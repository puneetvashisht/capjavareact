package com.cap.springweb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cap.springweb.entities.User;
import com.cap.springweb.exceptions.DuplicateUserException;
import com.cap.springweb.exceptions.UserNotFoundException;
import com.cap.springweb.repos.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	
	@PostMapping("/users")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addUser(@RequestBody User u)
	{
		User user = userRepository.findByUsername(u.getUsername());
		
		if(user==null)
		{
			userRepository.save(u);
		}
		else
			throw new DuplicateUserException("user "+ u.getUsername() + " already exist...");
		
		
	}
	
	@GetMapping("/users/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public User findUser(@PathVariable("id") int id)
	{
		Optional<User> user = userRepository.findById(id);
		
		if(!user.isPresent())
			throw new UserNotFoundException("No category found with id " + id);
		
		return user.get();
	}
	
	@GetMapping("/user/{username}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public User findUserByName(@PathVariable("username") String username){
		
		User user = userRepository.findByUsername(username);
		
		if(user == null)
			throw new UserNotFoundException("No user found with username " + username);
		
		return user;
	}
	
	@GetMapping("/login/{username}/{password}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public User findUserByNameAndPassword(@PathVariable("username")String username,@PathVariable("password")String password)
	{
		
		User user = userRepository.findByUsernameAndPassword(username, password);
		
		if(user==null)
			throw new UserNotFoundException("No user found with username = " + username + " and password = " + password);
		
		
		return user;
	}
	
	@GetMapping("/users")
	@ResponseStatus(code = HttpStatus.FOUND)
	public List<User> findAllUsers()
	{
		List<User> users = userRepository.findAll(); 
		
		
		if(users.isEmpty())
			throw new UserNotFoundException("no users found");
		
		
		return users;
		
	}
	
	@DeleteMapping("/users/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable("id") int id)
	{
		User u = findUser(id);
		
		if(u==null)
			throw new UserNotFoundException("No user found with id " + id);
		
		
		userRepository.delete(u);
	}
}
