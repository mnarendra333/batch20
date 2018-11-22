
public class StrRevDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Narendra";
		
		
		/*for (int i = s1.length()-1; i >=0; i--) {
			System.out.print(s1.charAt(i));
			
		}*/
		
		//
		
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());

	}

}
