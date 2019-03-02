package com.pragim.model;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateClient {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		/*
		Child child = (Child)session.load(Child.class, 3);
		System.out.println(child);
		child.setAge(25);*/
		
		Parent parent = (Parent)session.load(Parent.class, 1);
		
		//update 
		/*for(Child childObj : parent.getChilds()){
			if(childObj.getcName().equalsIgnoreCase("Anil"))
				childObj.setAge(30);
		}
		session.beginTransaction().commit();
		*/
		
		//delete
		/*for (Child child : parent.getChilds()) {
			if(child.getcName().equalsIgnoreCase("Anil"))
				session.delete(child);
		}*/
		
		Set<Child> childs = parent.getChilds();
		Iterator<Child> iterator = childs.iterator();
		while (iterator.hasNext()) {
			Child child = iterator.next();
			if(child.getcName().equalsIgnoreCase("Surya"))
				iterator.remove();
		}
		
		session.beginTransaction().commit();
		
		
		
		
		
	}

}
