package sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo3 {

	public static void main(String[] args) {
		
		//sorting the elements using anonymous inner class
		TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}
		});
		ts.add(10);
		ts.add(99);
		ts.add(66);
		ts.add(55);
		ts.add(42);
		ts.add(99);
		ts.add(33);
		
		System.out.println(ts);

	}

}
