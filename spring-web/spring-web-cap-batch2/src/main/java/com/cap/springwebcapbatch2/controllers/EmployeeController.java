package com.cap.springwebcapbatch2.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
//	
//	@Autowired
//	EmployeeService employeeService;
	
	@RequestMapping(path="/index", method=RequestMethod.GET)
	public String fetchEmp(){
		return "index";
//		/hello.jsp
	}
	
	@RequestMapping(path="/hello", method=RequestMethod.GET)
//	@GetMapping("/hello")
	public String sayHello(Model model){
		//LOGIC
		// container of data 
		model.addAttribute("name", "Ravi");
		
		//view 
		return "hello";
//		/hello.jsp
	}
	
	@GetMapping("/employee")
	public String findEmployee(@RequestParam("name") String name, Model model){
		//LOGIC
		
//		String value1 = request.getParameter("value1");
		System.out.println(name);
//		System.out.println();
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Ravi", 3434.34));
		employees.add(new Employee(2, "Priya", 4434.34));
		
		Optional<Employee> foundEmployee = employees.stream()
		.filter((e) -> e.getName().equals(name))
		.findFirst();
		
		if(foundEmployee.isPresent()) {
			Employee e = foundEmployee.get();
			model.addAttribute("emp", e);
			return "employee";
		}
		else {
			model.addAttribute("message", "No employee with specified name found");
			return "errorpage";
		}

//		System.out.println(employees);
		
		
//		/employee.jsp
	}
	

}
