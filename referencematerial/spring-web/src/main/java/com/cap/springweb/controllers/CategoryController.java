package com.cap.springweb.controllers;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cap.springweb.entities.Category;
import com.cap.springweb.exceptions.CategoryNotFoundException;
import com.cap.springweb.exceptions.DuplicateCategoryException;
import com.cap.springweb.repos.CategoryRepository;

@RestController
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	
	@PostMapping("/categories")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addCategory(@RequestBody Category c)
	{
		Category category = categoryRepository.findByName(c.getName());
		
		if(category==null)
		{
			categoryRepository.save(c);
		}
		else
			throw new DuplicateCategoryException("category "+ c.getName() + " already exist...");
			
	}
	
	
	@GetMapping("/category/{name}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public Category findCategoryByName(@PathVariable("name") String name){
		
		Category category = categoryRepository.findByName(name);
		
		if(category == null)
			throw new CategoryNotFoundException("No category found with name " + name);
		
		return category;
	}
	
	@GetMapping("/categories/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public Category findCategory(@PathVariable("id") int id)
	{
		Optional<Category> category = categoryRepository.findById(id);
		
		if(!category.isPresent())
			throw new CategoryNotFoundException("No category found with id " + id);
		
		return category.get();
	}
	
	@GetMapping("/categories")
	@ResponseStatus(code = HttpStatus.FOUND)
	public List<Category> findAllCategories()
	{
		List<Category> list = categoryRepository.findAll();
		
		if(list.isEmpty())
			throw new CategoryNotFoundException("No categories found...");
		
		return list;
	}
	
	@PutMapping("/categories")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@Transactional
	public void updateCategory(@RequestBody Category category)
	{
		Category c = findCategory(category.getId());
		c.setName(category.getName());
	}
	
	@DeleteMapping("/categories/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteCategory(@PathVariable("id") int id)
	{
		Category c = findCategory(id);
		
		if(c==null)
			throw new CategoryNotFoundException("No category found with id " + id);
		
		
		categoryRepository.delete(c);
	}
}
