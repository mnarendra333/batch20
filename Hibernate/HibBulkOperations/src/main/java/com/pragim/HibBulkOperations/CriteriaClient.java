package com.pragim.HibBulkOperations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.pragim.HibBulkOperations.model.Product;

public class CriteriaClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		//full object
		Criteria createCriteria = session.createCriteria(Product.class);
		/*List<Product> list = createCriteria.list();
		for (Product product : list) {
			System.out.println(product);
		}
		
		//partial object
		
		
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("pName"));
		projectionList.add(Projections.property("price"));
		
		
		createCriteria.setProjection(projectionList);
		
		List<Object[]> data = createCriteria.list();
		for (Object[] objects : data) {
			for (Object object : objects) {
				System.out.print(object+" ");
			}
			System.out.println();
		}
		
		//single property
		List<String> list2 = createCriteria.setProjection(Projections.property("pName")).list();
		for (String string : list2) {
			System.out.println(string);
		}*/
		
		
		List<Product> list = createCriteria.add(Restrictions.eq("pId", 3)).list();
		System.out.println(list);
	}

}
