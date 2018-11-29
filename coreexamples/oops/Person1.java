import java.util.Scanner;

class Person1
{

	//variables	
	private int pId;
	private	String pName;
	private	String addr;
		
	
	//this is used to intialize the instance variables
	public Person1(int pId, String pName, String addr){
		
		this.pId = pId;
		this.pName = pName;
		this.addr = addr;
		
	}
	
	//methods
	public static void main(String... args)
	{
		
		Person1 plist[] = new Person1[3];
		
		/*Scanner sc = new Scanner(System.in);
		
		Integer i1[] = new Integer[10];
		
		for (int i = 0; i < i1.length; i++) {
			System.out.println("enter "+i+" th position");
			i1[i] = sc.nextInt();
		}
		for (int i = 0; i < i1.length; i++) {
			System.out.println(i1[i]);
		}*/
		
		/*Person obj = new Person(101,"Jsmes","bangl");
		System.out.println(obj.pId+" "+obj.pName+" "+obj.addr);*/
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < plist.length; i++) {
			System.out.println("enter "+i+" st person");
			int id = sc.nextInt();
			String pName = sc.next();
			String addr = sc.next();
			plist[i] = new Person1(id, pName, addr);
		}
		
		for (Person1 person : plist) {
			System.out.println(person.pId+" "+person.pName+" "+person.addr);
		}
		
		
		
	}
		
		


}