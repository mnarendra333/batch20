package com.pragim.springmvcfirstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class HelloWorldController {
	
	
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		String message = "Welcome to the world of Spring MVC!!!!";
		return new ModelAndView("success", "msg", message);
	}

}
