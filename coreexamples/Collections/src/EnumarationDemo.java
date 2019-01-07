import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class EnumarationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		
		System.out.println(vector);
		
		
		Enumeration<Integer> elements = vector.elements();
		System.out.println(elements.getClass());
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		

		
		/*for (Integer integer : vector) {
			if(integer == 30)
				break;
			System.out.println(integer);
		}*/
		
		
		
		

	}

}
