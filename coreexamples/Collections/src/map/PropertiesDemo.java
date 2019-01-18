package map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis = new FileInputStream("connection.properties");
			Properties props = new Properties();
			props.load(fis);
			
			System.out.println(props.getProperty("ipaddress"));
			System.out.println(props.getProperty("username"));
			System.out.println(props.getProperty("password"));
			System.out.println(props.getProperty("port"));
			
			
			
			
			
			Collection<Object> values = props.values();
			for (Object object : values) {
				System.out.println(object);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
