
public class NumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer x = 474040605;
		
		/*String s1 = x.toString();
		
		char[] charArray = s1.toCharArray();
		
		String output = "";
		for (int i = 0; i < charArray.length; i++) {
			
			if(charArray[i] != '0')
				output = 	
				output.concat(((Character)charArray[i]).toString());
		}
		System.out.println(output);*/
		
		
		String s2 = x.toString();
		String output2 = s2.replace("0","");
		System.out.println(output2);
		
		

	}

}
