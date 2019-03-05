package com.pragim.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Student s1 = (Student)session.get(Student.class, 1);
		System.out.println(s1);
		Student s2 = (Student)session.get(Student.class, 1);
		System.out.println(s2);
		session.close();
		
		
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Session session2 = factory.openSession();
		Student s3 = (Student)session2.get(Student.class, 1);
		System.out.println(s3);
		
		
	}

}
