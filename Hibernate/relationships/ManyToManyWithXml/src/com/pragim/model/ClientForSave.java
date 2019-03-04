package com.pragim.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientForSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		
		//map the existing  student to exsting course
		
	/*	Student sObj = (Student)session.load(Student.class, 20);
		Course obj = (Course)session.load(Course.class, 2);
		
		Set<Course> courseList = new HashSet<Course>();
		courseList.add(obj);
		sObj.setCourses(courseList);
		
		
		session.update(sObj);
		
		session.beginTransaction().commit();*/
		
		
		//remove the relatio bw Student and course
		
		/*Student sObj = (Student)session.load(Student.class, 2);
		Set<Course> courses = sObj.getCourses();
		System.out.println(courses.size());
		Iterator<Course> iterator = courses.iterator();
		while (iterator.hasNext()) {
			Course course =  iterator.next();
			if(course.getcName().equals("JAVA/J2EE"))
				iterator.remove();
			
		}
		
		session.beginTransaction().commit();*/
		
		//how to map a new course to existing student
		
		Student sObj = (Student)session.load(Student.class, 2);
		
		//new course
		Course course = new Course();
		course.setcName("WebServices");
		course.setDuration(30);
		
		Set<Course> existingCourses = sObj.getCourses();
		existingCourses.add(course);
		sObj.setCourses(existingCourses);
		
		session.update(sObj);
		
		session.beginTransaction().commit();

	}

}
