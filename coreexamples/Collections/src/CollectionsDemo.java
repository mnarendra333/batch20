import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		//Vector
		al.add(50);
		al.add(78);
		al.add(13);
		al.add(44);
		al.add(67);
		
		System.out.println(al);
		
		
		List<Integer> synchronizedList = Collections.synchronizedList(al);
		System.out.println(synchronizedList.getClass());
		
		
		Collections.sort(al,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}
		});
		System.out.println(al);
		

	}

}
