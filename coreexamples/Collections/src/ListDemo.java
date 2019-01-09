import java.util.ArrayList;
import java.util.List;


public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(20);
		
		System.out.println(list);
		
		list.remove(new Integer(60));
		System.out.println(list);

	}

}
