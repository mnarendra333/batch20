package pack1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
		System.out.println(sdf.format(date));
		

	}

}
