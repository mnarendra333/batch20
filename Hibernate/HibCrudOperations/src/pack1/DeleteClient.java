package pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteClient {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("unused")
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		
		Employee emp = (Employee)session.load(Employee.class,104);
		System.out.println(emp.getEmpName());
		session.delete(emp);
		
		session.beginTransaction().commit();
		
		
	}

}
