package op;
import sp.Base;
class OPDerived extends Base 
{
	
	
		public static void main(String args[])
		{
			OPDerived obj  =new OPDerived();
			//obj.b+" "+ has default access - default is package lavel modifier
			System.out.println(obj.c+" "+obj.d);
			
		}


}