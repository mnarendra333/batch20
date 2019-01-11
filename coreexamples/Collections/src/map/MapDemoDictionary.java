package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MapDemoDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("hi", Arrays.asList("hi","wish","welcome","call"));
		map.put("hello", Arrays.asList("hi","wish","welcome","call"));
		map.put("happy", Arrays.asList("joy","wish","welcome","call"));
		map.put("sad", Arrays.asList("sarrow","wish","welcome","call"));
		
		
		System.out.println(map);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a work to find the sysnonyms");
		String input = sc.next();
		
		List<String> list = map.get(input);
		for (String word : list) {
			System.out.println(word);
		}
		
		

	}

}
