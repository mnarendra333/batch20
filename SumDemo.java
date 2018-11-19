class SumDemo
{
	public static void main(String args[])
	{
		
		int no  = Integer.parseInt(args[0]);
		
		int sum = 0;
		for(int i=1;i<=no;i++)
		{
			
			sum = sum+i;
		}
		System.out.println("sum of n numbers is "+sum);
			
	
	}


}