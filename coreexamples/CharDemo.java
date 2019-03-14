class CharDemo
{

	public static void main(String args[])
	{
		
			String s1 = args[0];
			//convert String into charecter format
			char ch  = s1.charAt(0);
		
		switch(ch){
			
			
			case 'a' : System.out.println(ch +" is a vowel");
						break;
			case 'e' : System.out.println(ch +" is a vowel");
						break;
			case 'i' : System.out.println(ch +" is a vowel");
						break;
			case 'o' : System.out.println(ch +" is a vowel");
						break;
			case 'u' : System.out.println(ch +" is a vowel");
						break;
						
			default : System.out.println("given chrecter "+ch+" is a consonent");
			
			
		}
		
	}

}