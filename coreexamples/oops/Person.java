class Person
{

	//variables	
	private int pId;
	private	String pName;
	private	String addr;
		
	
	//this is used to intialize the instance variables
	public Person(int pId, String pName, String addr){
		
		this.pId = pId;
		this.pName = pName;
		this.addr = addr;
		
	}
	
	//methods
	public static void main(String... args)
	{
		
		Person obj = new Person(101,"Jsmes","bangl");
		System.out.println(obj.pId+" "+obj.pName+" "+obj.addr);
		
		
	}
		
		


}