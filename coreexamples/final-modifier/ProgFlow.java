class ProgFlow
{
	static int x =30;
	static
	{
		System.out.println("i am from static block");
		
	}
	public static void m1()
	{
		
		System.out.println("i am from instance method m1");
	}
	{
		System.out.println(ProgFlow.x);
		m1();
		System.out.println("i am from instance block");
	}
	public ProgFlow()
	{
		System.out.println("i am from constructor");
	}
	
	
	public static void main(String args[])
	{
		System.out.println("i am from main method");
		ProgFlow obj = new ProgFlow();
		
		
	}

}