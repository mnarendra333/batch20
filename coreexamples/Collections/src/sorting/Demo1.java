package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(99);
		al.add(66);
		al.add(55);
		al.add(42);
		al.add(99);
		al.add(33);
		
		System.out.println(al);
		
		/*TreeSet<Integer> ts = new TreeSet<Integer>(al);
		System.out.println(ts);*/
		
		Collections.sort(al,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}

			
		});
		

	}

}
