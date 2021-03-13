package com.cg.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//class WorkoutActive{
//	int workoutId;
//	int userId;
//	public int getWorkoutId() {
//		return workoutId;
//	}
//	public void setWorkoutId(int workoutId) {
//		this.workoutId = workoutId;
//	}
//	public int getUserId() {
//		return userId;
//	}
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
//	
//	
//}

class Message{
	String text;
	List<Employee> employees;
	

	public Message(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}


@RestController
@CrossOrigin("*")
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@PostMapping("/")
	public Message add(@RequestBody Employee employee) {
		employeeRepo.save(employee);
		return new Message("Employee successfully inserted!!");
		
	}
	
	@GetMapping("/")
	public List<Employee> fetchAllEmployees(){
		return employeeRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee fetchEmployeeById(@PathVariable("id")int id){
		Optional<Employee> employee =  employeeRepo.findById(id);
		if(employee.isPresent()) {
			return employee.get();
			
		}
		return null;
	}
	
	
	@DeleteMapping("/{id}")
	public Message deleteEmployee(@PathVariable("id")int id){
		 employeeRepo.deleteById(id);
		 Message message = new Message("Employee successfully deleted!!");
		 List<Employee> employees = employeeRepo.findAll();
		 message.setEmployees(employees);
		 
		 return message;
	}
	
	
	
	
//	@GetMapping("/workoutactive")
//	public List<Employee> assignWorkout(@RequestBody WorkoutActive workoutActive){
//		workoutActive.getUserId();
//		workoutActive.getWorkoutId();
//		
//		return employeeRepo.findAll();
//	}

}
