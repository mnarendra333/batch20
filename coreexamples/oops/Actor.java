class Actor
{


	private int id;
	private String name;
	private int age;
	private String addr;
	
	
	public Actor(int a, String b, int c, String d)
	{
		id = a;
		name = b;
		age = c;
		addr = d;
		
		
	}
	
	public static void main(String args[])
	{
		
		Actor obj = new Actor(101,"Surya",45,"chenni");
		System.out.println(obj.id+" "+obj.name+" "+obj.age+" "+obj.addr);
		
		Actor obj2 = new Actor(102,"Ajith",45,"bangl");
		System.out.println(obj2.id+" "+obj2.name+" "+obj2.age+" "+obj2.addr);
		
	}


}