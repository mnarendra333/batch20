class TableDemo
{
	public static void main(String args[])
	{
		
		int no  = Integer.parseInt(args[0]);
		
		
		for(int i=1;i<=no;i++)
		{
			for(int j=10;j>0;j--)
			{
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println("*************************");
			
		}
			
	
	}


}