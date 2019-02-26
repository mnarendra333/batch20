package com.pragim.HibBulkOperations;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.procedure.ProcedureCall;

public class HQLNonSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new AnnotationConfiguration().configure(
				"hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction beginTransaction = session.beginTransaction();

		/*
		 * Query createQuery = session.createQuery("delete from Product"); int
		 * res = createQuery.executeUpdate();
		 * 
		 * 
		 * 
		 * if(res>0) System.out.println(res+" rows effected");
		 */
		/*
		 * 
		 * try { Query query =
		 * session.createQuery("update Product set price=? where pId=?"); int
		 * executeUpdate = query.setParameter(0, 5000.0).setInteger(1,
		 * 4).executeUpdate();
		 * 
		 * 
		 * if(executeUpdate>0){
		 * System.out.println(executeUpdate+" rows modified"); }
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */

		/*Query query = session
		.createQuery("update Product set price=:pro_price where pId=:pro_pid");
		query.setParameter("pro_price", 6000.0);
		query.setInteger("pro_pid", 2);
		query.executeUpdate();*/
		
		
		
		Query query = session
				.createQuery("delete from Product where pId in(:pids)");
		query.setParameterList("pids", new Integer[]{1,2}).executeUpdate();
		
		
		
		
/*		ProcedureCall createStoredProcedureCall = session.createStoredProcedureCall("call {}");*/

		beginTransaction.commit();
	}

}
