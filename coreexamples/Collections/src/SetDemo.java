import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashMap<String,List<String>> map = new HashMap<String, List<String>>();
		
		
		List<String> list = new ArrayList<String>();
		list.add("wish");
		list.add("hello");
		list.add("welcome");
		map.put("hi", list);
		
		map.put("hello",Arrays.asList("hi","wish"));
		
		
		System.out.println(map);
		
		
		System.out.println(map.get("hi"));
		
		
		
	}

}
