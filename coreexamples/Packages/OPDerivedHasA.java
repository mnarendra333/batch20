package op;
import sp.Base;
class OPDerivedHasA
{
	
	
		public static void main(String args[])
		{
			Base obj  =new Base();
			//obj.c+" "+ protected data con't access outside package with hasA
			System.out.println(obj.d);
			
		}


}