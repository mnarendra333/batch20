import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		
		Iterator<Integer> iterator = al.iterator();
		while (iterator.hasNext()) {
			//System.out.println(iterator.next());
			
			if(iterator.next() == 30)
				iterator.remove();
		}
		System.out.println(al);
		//op - [10, 20, 40, 50]
		
		
		
		
		
		
		
		

	}

}
