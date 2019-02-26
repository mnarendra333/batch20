package com.pragim.HibBulkOperations;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pragim.HibBulkOperations.model.Product;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SessionFactory factory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		//create HQL Object
		//from Product p
		
		//method-1 - selecting full object from DB
		System.out.println("==================full object selection=====================");
		Query query = session.createQuery("select p from Product p where pId=?");
		query.setParameter(0, 4);
		List<Product> list = query.list();
		
		for (Product product : list) {
			System.out.println(product);
		}
		
		//method-2 - selecting partial object from DB
		System.out.println("==================partial object selection=====================");
		Query query2 = session.createQuery("select p.pName,p.price from Product p");
		List<Object[]> data = query2.list();
		for (Object[] objects : data) {
			for (Object object : objects) {
				System.out.print(object+"\t");
			}
			System.out.println();
		}
		
		//method-3 - selecting partial object from DB
		System.out.println("==================partial object selection=====================");
		Query query3 = session.createQuery("select p.pName from Product p");
		List<String> list2 = query3.list();
		for (String proName : list2) {
			System.out.println(proName);
		}
		
	}

}
