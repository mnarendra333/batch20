package pack1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Resource res1 = new ClassPathResource("spring-config2.xml");
		
		BeanFactory factory  = new XmlBeanFactory(res1);
		
		Resource res2 = new ClassPathResource("spring-config1.xml");
		BeanFactory factory2 = new XmlBeanFactory(res2,factory);
		
		Traveller bean = factory2.getBean("id1",Traveller.class);
		bean.planTravel();
}
	
}
