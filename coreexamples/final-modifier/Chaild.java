class Parent
{
	int x;
	int y;
	int a  =20;
	
	public Parent(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void method1()
	{
		System.out.println("i am from parent class method1");
	}
	
}
class Chaild extends Parent
{

	int z;
	int a = 30;
	public Chaild(int x, int y, int z)
	{
		super(x,y);
		
		this.z = z;
	}
	public void method2()
	{	int a  =10;
		System.out.println(a+" "+this.a+" "+super.a);
		super.method1();
		System.out.println("i am from Chaild class method2");
	}
	
	public static void m3()
	{
		//Chaild obj = new Chaild(10,20,30);
		//obj.method1();
		super.method1();
	}

	public static void main(String... args)
	{
		//Chaild obj  = new Chaild(10,20,30);
		m3();
	}
}