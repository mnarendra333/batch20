package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		
		
		map.put(null, "John");
		map.put(101, "raamya");
		map.put(200, "arun");
		
		map.put(300, "surya");
		map.put(500, "meghana");
		
		System.out.println(map);
		System.out.println(map.get(101));
		System.out.println("==========print keys===========");
		
		//System.out.println(map.keySet());
		
		/*Set<Integer> keySet = map.keySet();
		System.out.println(keySet.getClass());
		
		Collection<String> values = map.values();
		System.out.println(values.getClass());
		
		System.out.println(map.containsKey(2000));

		System.out.println(map.containsValue("surya"));
		
		
		
		System.out.println("==========print key and value=============");
		
		
		Set<Integer> set = new HashSet<Integer>();
		for(Integer i1:set){
			System.out.println(i1);
		}
		
		//map.putAll(map2);
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry =  iterator
					.next();
			System.out.println(entry.getClass());
			System.out.println(entry.getKey());
		}
		
		for(Entry<Integer, String> entry:entrySet)
			System.out.println(entry.getKey()+" "+entry.getValue());*/
	}

}
