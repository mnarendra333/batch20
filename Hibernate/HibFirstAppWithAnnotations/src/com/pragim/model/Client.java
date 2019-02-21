package com.pragim.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		//student obj
		
		Student student = new Student();
		student.setStuId(101);
		student.setStuName("Surya");
		student.setAge(40);

		
		session.save(student);
		session.beginTransaction().commit();
	}

}
