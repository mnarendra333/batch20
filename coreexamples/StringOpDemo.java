class StringOpDemo
{

	public static void main(String myargs[])
	{
		
		String s1 = myargs[0];
		
		System.out.println(s1.length());
		//trim the white spaces
		String s2 = s1.trim();
		
		//find out the length of a string
		
		System.out.println(s2.length());
		
		//reverse the string
		
		
		char ch[] = s2.toCharArray();
		for(int i=s2.length()-1;i>=0;i--)
			System.out.print(ch[i]);
		
		
		
		
		
	}


}