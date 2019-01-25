package pack1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {
		
		
		try {
			
			List<Movie> list = new ArrayList<Movie>();
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/sapuser/Desktop/movies2.txt"));
			String line = null;
			while((line=br.readLine())!=null){
				String[] data = line.split("-");
				int year = Integer.parseInt(data[1].trim());
				Movie movie = new Movie(data[0].trim(),year,data[2].trim(), data[3].trim(), data[4].trim());
				list.add(movie);
			}
			System.out.println(list);
			
			
			Map<Integer, List<Movie>> populateMapFromList = populateMapFromList(list);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter year");
			int releaseYear = sc.nextInt();
			
		
			List<Movie> list2 = populateMapFromList.get(releaseYear);
			if(list2!=null &&  list2.size()>0){
				for (Movie movie : list2) {
					System.out.println(movie);
				}
			}else{
				System.out.println("no movies released in "+releaseYear);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Map<Integer,List<Movie>> populateMapFromList(List<Movie> list) {
			
		Map<Integer,List<Movie>> map = new HashMap<Integer, List<Movie>>();
		
		for (Movie movie : list) {
			
			int year = movie.getYear();
			
			if(map.get(year)==null){
				List<Movie> movList = new ArrayList<Movie>();
				movList.add(movie);
				map.put(year, movList);
			}else{
				List<Movie> exsMov = map.get(year);
				exsMov.add(movie);
				map.put(year, exsMov);
			}
			
			
		}
		
		return map;
	}

}
