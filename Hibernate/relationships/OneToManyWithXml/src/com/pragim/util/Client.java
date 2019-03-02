package com.pragim.util;

import java.util.HashSet;
import java.util.Set;



import oracle.net.aso.p;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pragim.model.Child;
import com.pragim.model.Parent;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		//prepare child data
		
		Child c1 = new Child();
		c1.setcName("Ajith");
		c1.setAge(20);
		
		Child c2 = new Child();
		c2.setcName("sunil");
		c2.setAge(21);
		
		Child c3 = new Child();
		c3.setcName("niranajn");
		c3.setAge(22);
		
		
		Set<Child> childList = new HashSet<Child>();
		
		childList.add(c1);
		childList.add(c2);
		childList.add(c3);
		
		
		//prepare parent info
		
		Parent pobj = new Parent();
		pobj.setParName("baskar");
		pobj.setAge(50);
		pobj.setChilds(childList);
		
		
		session.save(pobj);
		
		
		session.beginTransaction().commit();
		
		
		
	}

}
