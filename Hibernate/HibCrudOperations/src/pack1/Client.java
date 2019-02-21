package pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		//step-1 - create session factory
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//step-2 enable cache 
		Session session = factory.openSession();
		
		
		//step-3 prepare model
		
		Employee emp  =new Employee();
		emp.setEmpId(105);
		emp.setEmpName("krishnan");
		emp.setSal(500000);
		
		
		/*Integer id = (Integer)session.save(emp);
		System.out.println(id);*/
		
		session.persist(emp);
		
		Transaction tx = session.beginTransaction();
		tx.commit();
		

	}

}
