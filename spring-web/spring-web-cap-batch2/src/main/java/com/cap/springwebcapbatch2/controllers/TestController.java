package com.cap.springwebcapbatch2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
//	@RequestMapping(path = "/hello", method=RequestMethod.GET)
	public String sayHello() {
		System.out.println("hello");
		return "test";
	}

}
