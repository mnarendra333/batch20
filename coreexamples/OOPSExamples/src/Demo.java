


import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList obj = new ArrayList();
		
		obj.add(67);
		obj.add(44);
		obj.add(69);
		obj.add(33);
		obj.add(99);
		
		System.out.println(obj);
		
		
		System.out.println(new TreeSet(obj));
		
		int x[] = {78,98,34,21,78,435};
		
		/*Integer i1[] = new Integer[10];
		
		i1[0]  =10;
		i1[1] = "hello";
		
		String s1[]  = new String[5];
		s1[0] = 100;*/
		
		
		Object[] objArraay = new Object[10];
		
		objArraay[0]  = 10;
		objArraay[1] = "hello";
		objArraay[2] = 10.5;
		objArraay[3] = 10.5f;
		objArraay[4] = 'a';
		objArraay[5] = true;
		
		
		
		Arrays.sort(x);
		for (int i : x) {
			System.out.print(i+" ");
		}
		
		

	}

}
