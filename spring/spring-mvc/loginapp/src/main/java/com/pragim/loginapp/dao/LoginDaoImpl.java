package com.pragim.loginapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pragim.loginapp.model.Login;

public class LoginDaoImpl implements LoginDao {

	@Autowired
	private JdbcTemplate templeate;
	

	
	@Override
	public String validateLogin(Login login) {
		// TODO Auto-generated method stub
		String message = null;
		Integer queryForObject = templeate.queryForObject("select count(*) from userlist where username=? and password=?",new Object[]{login.getUname(),login.getPwd()},Integer.class);
		if(queryForObject>0)
			message = "logn success for :"+login.getUname();
		else
			message = "logn denied for :"+login.getUname();
		return message;
	}

}
