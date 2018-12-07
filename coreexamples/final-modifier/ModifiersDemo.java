class ModifiersDemo
{
	
	int x  =10;
	static int y=20;
	
	public static void m1()
	{
		System.out.println("i am from static method m1");
	}
	public void m3()
	{
		
		System.out.println("i am from instance method m3");
	}
	public void m2()
	{
		this.m3();
		System.out.println("i am from instance method m2");
	}
	public static void main(String args[])
	{
		ModifiersDemo obj = new ModifiersDemo();
		System.out.println(y);
		m1();
		obj.m2();
	}


}