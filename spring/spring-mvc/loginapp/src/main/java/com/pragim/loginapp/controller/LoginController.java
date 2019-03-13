package com.pragim.loginapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pragim.loginapp.dao.LoginDao;
import com.pragim.loginapp.model.Login;

@Controller
public class LoginController {
	
			@Autowired
			private LoginDao dao;
			
			
			@RequestMapping("/validate")
			public ModelAndView validate(@ModelAttribute("login") Login login){
				//System.out.println("login info "+login);
				String validateLogin = dao.validateLogin(login);
				return new ModelAndView("result", "msg", validateLogin);
			}
			
			@RequestMapping("/")
			public ModelAndView displayLoginPage(@ModelAttribute("login") Login login){
				Login loginObj = new Login();
				return new ModelAndView("login", "login", loginObj);
			}

}
