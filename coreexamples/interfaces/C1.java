interface  A1
{

	int x = 10;
}
interface B1
{
	int x=20;

}
class C1 implements A1,B1
{
	public static void main(String args[])
	{
		//C1 obj  =new C1();
		System.out.println(A1.x+" "+B1.x);
	}

}