package com.pragim.awwithannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pragim.hibautowiring.model.Person;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx  =new ClassPathXmlApplicationContext("spring-beans.xml");
		Person perObj = ctx.getBean("person",Person.class);
		perObj.buyMobile();

	}

}
