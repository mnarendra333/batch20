package com.pragim.model;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CRUDClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		//select a parent along with childs
		
		System.out.println("=============parent info================");
		Parent pobj =(Parent)session.load(Parent.class, 1);
		System.out.println(pobj.getParId()+" "+pobj.getParName()+" "+pobj.getAge());
		
		System.out.println("------------child info----------------");
		Set<Child> childs = pobj.getChilds();
		for (Child child : childs) {
			System.out.println(child);
		}
		
		//select all parent along with all childs
		Query query = session.createQuery("select p from Parent p");
		List<Parent> list = query.list();
		
		for (Parent parent : list) {
			System.out.println("=============parent info================");
			System.out.println(parent);
			System.out.println("------------childs info----------------");
			for (Child child : parent.getChilds()) {
				
				System.out.println(child);
			}
		}
		

	}

}
