package map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IHMDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> map = new HashMap<String, String>();
		map.put(new String("hello"), "king");
		map.put(new String("hello"), "maker");
		System.out.println(map);
		
		/*
		System.out.println("FB".hashCode());//and 
		System.out.println("Ea".hashCode());*/
		
		
		
		

	}

}
