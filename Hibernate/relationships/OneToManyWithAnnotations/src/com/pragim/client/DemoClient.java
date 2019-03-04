package com.pragim.client;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pragim.model.Actor;
import com.pragim.model.Movie;

public class DemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		Actor act1 = new Actor("pk",30);
		
		Actor act2 = new Actor("pridhvi",45);
		
		Actor act3 = new Actor("nine",45);
		
		Set<Actor> actList = new LinkedHashSet<Actor>();
		actList.add(act1);
		actList.add(act2);
		actList.add(act3);
		
		String rd = "04-MAR-00";
		Movie mov = new Movie("Gamyam", "pVR", 20, new Date(rd), actList);
		
		
		session.save(mov);
		
		session.beginTransaction().commit();
	}

}
