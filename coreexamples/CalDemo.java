import java.util.Scanner;
class CalDemo
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("enhter your choice\n 1.add \n 2.sub \n 3.mul \n 4.div");
		int choice = sc.nextInt();
		
		switch(choice){
			case 1: System.out.println("sum is "+(x+y));
					break;
			case 2: System.out.println("sub is "+(x-y));
					break;
			case 3: System.out.println("mul is "+(x*y));
					break;
			case 4: System.out.println("div is "+(x/y));
					break;
			default : System.out.println("invalid choice : try bw 1 and 4");
			
		}
		
		
	}


}