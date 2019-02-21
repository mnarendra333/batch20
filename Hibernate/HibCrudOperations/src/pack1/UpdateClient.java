package pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("unused")
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		
		Object obj = session.load(Employee.class, 104);
		Employee emp = (Employee)obj;
		emp.setEmpName("Arunkumar");
		session.update(emp);
		session.beginTransaction().commit();
		
	}

}
