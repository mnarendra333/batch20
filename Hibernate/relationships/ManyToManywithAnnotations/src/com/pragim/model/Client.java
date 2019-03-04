package com.pragim.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		Course c1 = new Course();
		c1.setcName("JAVA/J2EE");
		c1.setDuration(120);
		
		Course c2 = new Course();
		c2.setcName("HTML");
		c2.setDuration(120);
		
		
		Course c3 = new Course();
		c3.setcName("JavaScript");
		c3.setDuration(120);


		
		Set<Course> courseList = new HashSet<Course>();
		courseList.add(c1);
		courseList.add(c2);
		courseList.add(c3);
		
		Student sobj  = new Student();
		sobj.setsName("Surya");
		sobj.setAddr("bangl");
		sobj.setCourses(courseList);
		
		
		session.save(sobj);
		session.beginTransaction().commit();
		
		
	}

}
