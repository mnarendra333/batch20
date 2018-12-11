class A
{

	int x = 10;
}
class B
{
	int x=20;

}
class C extends A,B
{
	public static void main(String args[])
	{
		C obj  =new C();
		System.out.println(obj.x);
	}

}