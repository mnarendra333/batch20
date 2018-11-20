class RevNum
{
	public static void main(String myargs[])
	{	
		
		int no  = Integer.parseInt(myargs[0]);
		
		int sum = 0,r=0;
		int dup = no;
		while(no>0){
			r = no%10;
			sum = (sum*10)+r;
			no = no/10;
		}
		System.out.println("reverse of "+dup+" is "+sum);
		
	}


}