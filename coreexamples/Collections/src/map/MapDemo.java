package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(100, "John");
		map.put(101, "raamya");
		map.put(200, "arun");
		
		map.put(300, "surya");
		map.put(500, "meghana");
		
		System.out.println(map);
		System.out.println("==========print keys===========");
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.containsKey(2000));

		System.out.println(map.containsValue("surya"));
		
		
		
		System.out.println("==========print key and value=============");
		
		
		Set<Integer> set = new HashSet<Integer>();
		for(Integer i1:set){
			System.out.println(i1);
		}
		
		//map.putAll(map2);
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for(Entry<Integer,String> entry:entrySet){
			if(entry.getKey() == 101 && entry.getValue().equals("surya"))
				break;
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		System.out.println(map.size());

	}

}
