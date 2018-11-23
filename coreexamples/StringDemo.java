
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s1 = "Session to Java Session Session Session"; 
	
		
		String tokens[] = s1.split(" ");
		System.out.println(tokens.length);
		
		for (int i = 0; i < tokens.length; i++) {
			int count=0;
			for (int j = i+1; j < tokens.length; j++) {
				
				if(tokens[i].equals(tokens[j])){
					count++;
					tokens[j]="0";
				}
					
			}
			if(tokens[i]!="0" && count>1)
				System.out.println("occurances of "+tokens[i]+" is "+count);
		}
		
		
		
		
		
		
	}

}
