class PrimeDemoRange
{

	public static void main(String myargs[])
	{
		
		int no = Integer.parseInt(myargs[0]);
		
		for(int i=1;i<=no;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				
				if(i%j==0)
					count++;
			}
			
			if(count == 2)
				System.out.println(i +" is prime");
			else
				System.out.println(i +" is not prime");
		}
		
		
		
	}
	


}