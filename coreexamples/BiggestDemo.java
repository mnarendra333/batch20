class BiggestDemo
{

	public static void main(String args[])
	{
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		/*if(a>b && a>c)
			System.out.println(a+" is big");
		else if(b>c)
			System.out.println(b+" is big");
		else
			System.out.println(c+" is big");*/
		
		//int output = 
		System.out.println(a>b&&a>c?a:b>c?b:c);
	}

}