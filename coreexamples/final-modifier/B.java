class A
{
	A()
	{
		System.out.println("i am from A");
	}

}
class B extends A
{

	B()
	{
		super();
		System.out.println("i am from B");
	}
	
	public static void main(String args[])
	{
		B obj = new B();
	
	}


}