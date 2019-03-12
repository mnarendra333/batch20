package com.pragim.loginapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pragim.loginapp.model.Login;

@Controller
public class LoginController {
	
	
			@RequestMapping("/validate")
			public ModelAndView validate(@ModelAttribute("login") Login login){
				System.out.println("login info "+login);
				return null;
			}
			
			@RequestMapping("/")
			public ModelAndView displayLoginPage(@ModelAttribute("login") Login login){
				Login loginObj = new Login();
				return new ModelAndView("login", "login", loginObj);
			}

}
