import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int x[] = {100,50,34,78,24};
		
		Arrays.sort(x);
		for (int i : x) {
			System.out.println(i);
		}
		
		
		
		
		Integer i1[] = new Integer[10];
		System.out.println(i1);
		Arrays.fill(i1, 10);
		for(int i:i1)
			System.out.println(i);
		
		
		
		Integer[] data = Arrays.copyOf(i1, 20);
		for(int i2:data)
			System.out.println(i2);
		
		
		
		
		
		/*ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(20);
		al.add(20);
		
		System.out.println(al);
		*/
		
		
		
		
		
		
		
		

	}

}
