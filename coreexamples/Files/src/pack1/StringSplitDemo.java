package pack1;

import java.util.StringTokenizer;

public class StringSplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String line = "Today is friday so we aare not working";
		String[] split = line.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		
		System.out.println("=======================================");
		StringTokenizer tokenizer = new StringTokenizer(line," ");
		
		while(tokenizer.hasMoreTokens()){
			System.out.println(tokenizer.nextToken());
		}

	}

}
