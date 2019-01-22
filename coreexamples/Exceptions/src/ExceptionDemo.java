import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ExceptionDemo {
	
	
	public static void main(String[] args) {
		
		
		//NullPointerException
		/*String s1= null;
		
		if(s1!=null)
			s1.length();*/
		
		//ArrayIndexOutOfBoundsException
		String s1 = "Arun";
		char[] charArray = s1.toCharArray();
		int index = 9; 
		if(charArray.length>index)
		System.out.println(charArray[index]);
		
		//NumberFormatException
		/*String s2 = "ravi";
		int y = Integer.parseInt(s2);
		System.out.println(y);*/
		
		//java.lang.ClassCastException:
		/*Object obj = new Object(); // Object obj = new String("hello");
		String s4 = (String)obj;
		System.out.println(s4);*/
		
		
		
		Object obj6 = new Object();
		Integer myname = (Integer)obj6;
		System.out.println(myname);
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter denominator value");
		int denominator = sc.nextInt();
		
		try {

			int res = 100/denominator;
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			
			int cube  = 10*10*10;
			System.out.println(cube);*/
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
